package kaigee.top.user.root.entity.dto.service;

    import kaigee.top.user.root.entity.dto.UserSpec;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class UserSpecService {
    private final UserSpecRepository userSpecRepository;

    public UserSpec findById(String id) {
        return userSpecRepository.findById(id, UserSpecRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(UserSpecInput userSpecInput) {
        return userSpecRepository.save(userSpecInput).id();
    }

    public Page<UserSpec> query(QueryRequest<UserSpecSpec> queryRequest) {
        return userSpecRepository.findPage(queryRequest, UserSpecRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        userSpecRepository.deleteAllById(ids);
        return true;
    }
}