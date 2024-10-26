package kaigee.top.role.service;

    import io.qifan.infrastructure.common.constants.ResultCode;
    import io.qifan.infrastructure.common.exception.BusinessException;
    import kaigee.top.infrastructure.model.QueryRequest;
    import kaigee.top.role.entity.Role;
    import kaigee.top.role.entity.dto.RoleInput;
    import kaigee.top.role.entity.dto.RoleSpec;
    import kaigee.top.role.repository.RoleRepository;
    import lombok.AllArgsConstructor;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

    import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class RoleService {
    private final RoleRepository roleRepository;

    public Role findById(String id) {
        return roleRepository.findById(id, RoleRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(RoleInput roleInput) {
        return roleRepository.save(roleInput).id();
    }

    public Page<Role> query(QueryRequest<RoleSpec> queryRequest) {
        return roleRepository.findPage(queryRequest, RoleRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        roleRepository.deleteAllById(ids);
        return true;
    }
}