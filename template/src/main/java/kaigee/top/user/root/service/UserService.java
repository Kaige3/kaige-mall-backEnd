package kaigee.top.user.root.entity.service;

    import kaigee.top.user.root.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public User findById(String id) {
        return userRepository.findById(id, UserRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(UserInput userInput) {
        return userRepository.save(userInput).id();
    }

    public Page<User> query(QueryRequest<UserSpec> queryRequest) {
        return userRepository.findPage(queryRequest, UserRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        userRepository.deleteAllById(ids);
        return true;
    }
}