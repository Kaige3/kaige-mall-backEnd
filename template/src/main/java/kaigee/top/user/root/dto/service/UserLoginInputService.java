package kaigee.top.user.root.entity.dto.service;

    import kaigee.top.user.root.entity.dto.UserLoginInput;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class UserLoginInputService {
    private final UserLoginInputRepository userLoginInputRepository;

    public UserLoginInput findById(String id) {
        return userLoginInputRepository.findById(id, UserLoginInputRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(UserLoginInputInput userLoginInputInput) {
        return userLoginInputRepository.save(userLoginInputInput).id();
    }

    public Page<UserLoginInput> query(QueryRequest<UserLoginInputSpec> queryRequest) {
        return userLoginInputRepository.findPage(queryRequest, UserLoginInputRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        userLoginInputRepository.deleteAllById(ids);
        return true;
    }
}