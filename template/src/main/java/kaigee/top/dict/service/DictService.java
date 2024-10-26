package kaigee.top.dict.entity.service;

    import kaigee.top.dict.entity.Dict;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class DictService {
    private final DictRepository dictRepository;

    public Dict findById(String id) {
        return dictRepository.findById(id, DictRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(DictInput dictInput) {
        return dictRepository.save(dictInput).id();
    }

    public Page<Dict> query(QueryRequest<DictSpec> queryRequest) {
        return dictRepository.findPage(queryRequest, DictRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        dictRepository.deleteAllById(ids);
        return true;
    }
}