package kaigee.top.dict.entity.dto.repository;

import kaigee.top.dict.entity.dto.DictSpec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface DictSpecRepository extends JRepository<DictSpec, String> {
    DictSpecTable dictSpecTable = DictSpecTable.$;
    DictSpecFetcher COMPLEX_FETCHER = DictSpecFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<DictSpec> findPage(QueryRequest<DictSpecSpec> queryRequest, Fetcher<DictSpec> fetcher) {
        DictSpecSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(dictSpecTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(dictSpecTable, pageable.getSort()))
                .select(dictSpecTable.fetch(fetcher)));
    }
}