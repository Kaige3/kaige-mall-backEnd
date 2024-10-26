package kaigee.top.dict.repository;

import kaigee.top.dict.entity.Dict;
import kaigee.top.dict.entity.DictFetcher;
import kaigee.top.dict.entity.DictTable;
import kaigee.top.dict.entity.dto.DictSpec;
import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.user.root.entity.UserFetcher;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.SpringOrders;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DictRepository extends JRepository<Dict, String> {
    DictTable dictTable = DictTable.$;
    DictFetcher COMPLEX_FETCHER = DictFetcher.$.allScalarFields();


    default Page<Dict> findPage(QueryRequest<DictSpec> queryRequest, Fetcher<Dict> fetcher) {
        DictSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(dictTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(dictTable, pageable.getSort()))
                .select(dictTable.fetch(fetcher)));
    }
}