package kaigee.top.box.category.entity.service;

    import kaigee.top.box.category.entity.MysteryBoxCategory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class MysteryBoxCategoryService {
    private final MysteryBoxCategoryRepository mysteryBoxCategoryRepository;

    public MysteryBoxCategory findById(String id) {
        return mysteryBoxCategoryRepository.findById(id, MysteryBoxCategoryRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(MysteryBoxCategoryInput mysteryBoxCategoryInput) {
        return mysteryBoxCategoryRepository.save(mysteryBoxCategoryInput).id();
    }

    public Page<MysteryBoxCategory> query(QueryRequest<MysteryBoxCategorySpec> queryRequest) {
        return mysteryBoxCategoryRepository.findPage(queryRequest, MysteryBoxCategoryRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        mysteryBoxCategoryRepository.deleteAllById(ids);
        return true;
    }
}