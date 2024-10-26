package kaigee.top.user.root.service;

    import cn.dev33.satoken.stp.SaLoginModel;
    import cn.dev33.satoken.stp.SaTokenInfo;
    import cn.dev33.satoken.stp.StpUtil;
    import io.qifan.infrastructure.common.constants.ResultCode;
    import io.qifan.infrastructure.common.exception.BusinessException;
    import kaigee.top.infrastructure.model.LoginDevice;
    import kaigee.top.infrastructure.model.QueryRequest;
    import kaigee.top.user.root.entity.User;
    import kaigee.top.user.root.entity.UserDraft;
    import kaigee.top.user.root.entity.UserFetcher;
    import kaigee.top.user.root.entity.UserTable;
    import kaigee.top.user.root.entity.dto.UserInput;
    import kaigee.top.user.root.entity.dto.UserLoginInput;
    import kaigee.top.user.root.entity.dto.UserSpec;
    import kaigee.top.user.root.repository.UserRepository;
    import lombok.AllArgsConstructor;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

    import java.util.Arrays;
    import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public User findById(String id) {
        return userRepository.findById(id, UserRepository.USER_ROLE_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(UserInput userInput) {
        User user = userInput.toEntity();
        return userRepository.save(UserDraft.$.produce(user,draft -> {
            Arrays.stream(userInput.getRoleIds()).toList().forEach(roleId->{
                draft.addIntoRoles(userRole->{
                    userRole.applyRole(role ->role.setId(roleId))
                            .setUser(user);
                });
            });

        })).id();

    }

    public Page<User> query(QueryRequest<UserSpec> queryRequest) {
        return userRepository.findPage(queryRequest, UserRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        userRepository.deleteAllById(ids);
        return true;
    }

    public SaTokenInfo login(UserLoginInput userLoginInput) {
        UserTable userTable = UserTable.$;
        User databaseUser = userRepository.sql().createQuery(userTable)
                .where(userTable.phone().eq(userLoginInput.getPhone()))
                .select(userTable.fetch(UserFetcher.$.allReferenceFields()))
                .fetchOptional()
                .orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "用户不存在"));

        StpUtil.login(databaseUser.id(),new SaLoginModel()
                .setDevice(LoginDevice.BROWSER)
                .setTimeout(60 * 60 * 24 * 30 * 36));
        return StpUtil.getTokenInfo();
    }
}