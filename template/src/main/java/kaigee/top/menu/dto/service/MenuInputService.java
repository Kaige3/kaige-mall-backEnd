package kaigee.top.menu.entity.dto.service;

    import kaigee.top.menu.entity.dto.MenuInput;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class MenuInputService {
    private final MenuInputRepository menuInputRepository;

    public MenuInput findById(String id) {
        return menuInputRepository.findById(id, MenuInputRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(MenuInputInput menuInputInput) {
        return menuInputRepository.save(menuInputInput).id();
    }

    public Page<MenuInput> query(QueryRequest<MenuInputSpec> queryRequest) {
        return menuInputRepository.findPage(queryRequest, MenuInputRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        menuInputRepository.deleteAllById(ids);
        return true;
    }
}