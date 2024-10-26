package kaigee.top.dict.entity.repository;

import kaigee.top.dict.entity.Dict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface DictRepository extends JRepository<Dict, String> {
    DictTable dictTable = DictTable.$;
    DictFetcher COMPLEX_FETCHER = DictFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<Dict> findPage(QueryRequest<DictSpec> queryRequest, Fetcher<Dict> fetcher) {
        DictSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(dictTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(dictTable, pageable.getSort()))
                .select(dictTable.fetch(fetcher)));
    }
}