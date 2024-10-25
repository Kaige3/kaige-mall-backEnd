package kaigee.top.user.entity.dto.service;

    import kaigee.top.user.entity.dto.UserInput;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class UserInputService {
    private final UserInputRepository userInputRepository;

    public UserInput findById(String id) {
        return userInputRepository.findById(id, UserInputRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(UserInputInput userInputInput) {
        return userInputRepository.save(userInputInput).id();
    }

    public Page<UserInput> query(QueryRequest<UserInputSpec> queryRequest) {
        return userInputRepository.findPage(queryRequest, UserInputRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        userInputRepository.deleteAllById(ids);
        return true;
    }
}