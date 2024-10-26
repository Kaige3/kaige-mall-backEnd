package kaigee.top.role.entity.dto.service;

    import kaigee.top.role.entity.dto.RoleInput;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class RoleInputService {
    private final RoleInputRepository roleInputRepository;

    public RoleInput findById(String id) {
        return roleInputRepository.findById(id, RoleInputRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(RoleInputInput roleInputInput) {
        return roleInputRepository.save(roleInputInput).id();
    }

    public Page<RoleInput> query(QueryRequest<RoleInputSpec> queryRequest) {
        return roleInputRepository.findPage(queryRequest, RoleInputRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        roleInputRepository.deleteAllById(ids);
        return true;
    }
}