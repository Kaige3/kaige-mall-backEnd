package kaigee.top.dict.entity.dto.repository;

import kaigee.top.dict.entity.dto.DictInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface DictInputRepository extends JRepository<DictInput, String> {
    DictInputTable dictInputTable = DictInputTable.$;
    DictInputFetcher COMPLEX_FETCHER = DictInputFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<DictInput> findPage(QueryRequest<DictInputSpec> queryRequest, Fetcher<DictInput> fetcher) {
        DictInputSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(dictInputTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(dictInputTable, pageable.getSort()))
                .select(dictInputTable.fetch(fetcher)));
    }
}