package kaigee.top.role.entity.dto.service;

    import kaigee.top.role.entity.dto.RoleSpec;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class RoleSpecService {
    private final RoleSpecRepository roleSpecRepository;

    public RoleSpec findById(String id) {
        return roleSpecRepository.findById(id, RoleSpecRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(RoleSpecInput roleSpecInput) {
        return roleSpecRepository.save(roleSpecInput).id();
    }

    public Page<RoleSpec> query(QueryRequest<RoleSpecSpec> queryRequest) {
        return roleSpecRepository.findPage(queryRequest, RoleSpecRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        roleSpecRepository.deleteAllById(ids);
        return true;
    }
}