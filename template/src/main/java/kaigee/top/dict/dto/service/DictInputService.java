package kaigee.top.dict.entity.dto.service;

    import kaigee.top.dict.entity.dto.DictInput;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class DictInputService {
    private final DictInputRepository dictInputRepository;

    public DictInput findById(String id) {
        return dictInputRepository.findById(id, DictInputRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(DictInputInput dictInputInput) {
        return dictInputRepository.save(dictInputInput).id();
    }

    public Page<DictInput> query(QueryRequest<DictInputSpec> queryRequest) {
        return dictInputRepository.findPage(queryRequest, DictInputRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        dictInputRepository.deleteAllById(ids);
        return true;
    }
}