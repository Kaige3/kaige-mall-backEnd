package kaigee.top.menu.entity.dto.service;

    import kaigee.top.menu.entity.dto.MenuSpec;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class MenuSpecService {
    private final MenuSpecRepository menuSpecRepository;

    public MenuSpec findById(String id) {
        return menuSpecRepository.findById(id, MenuSpecRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(MenuSpecInput menuSpecInput) {
        return menuSpecRepository.save(menuSpecInput).id();
    }

    public Page<MenuSpec> query(QueryRequest<MenuSpecSpec> queryRequest) {
        return menuSpecRepository.findPage(queryRequest, MenuSpecRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        menuSpecRepository.deleteAllById(ids);
        return true;
    }
}