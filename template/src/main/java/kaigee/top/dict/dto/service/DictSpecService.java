package kaigee.top.dict.entity.dto.service;

    import kaigee.top.dict.entity.dto.DictSpec;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class DictSpecService {
    private final DictSpecRepository dictSpecRepository;

    public DictSpec findById(String id) {
        return dictSpecRepository.findById(id, DictSpecRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(DictSpecInput dictSpecInput) {
        return dictSpecRepository.save(dictSpecInput).id();
    }

    public Page<DictSpec> query(QueryRequest<DictSpecSpec> queryRequest) {
        return dictSpecRepository.findPage(queryRequest, DictSpecRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        dictSpecRepository.deleteAllById(ids);
        return true;
    }
}