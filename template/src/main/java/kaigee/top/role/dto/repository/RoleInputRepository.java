package kaigee.top.role.entity.dto.repository;

import kaigee.top.role.entity.dto.RoleInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface RoleInputRepository extends JRepository<RoleInput, String> {
    RoleInputTable roleInputTable = RoleInputTable.$;
    RoleInputFetcher COMPLEX_FETCHER = RoleInputFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<RoleInput> findPage(QueryRequest<RoleInputSpec> queryRequest, Fetcher<RoleInput> fetcher) {
        RoleInputSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(roleInputTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(roleInputTable, pageable.getSort()))
                .select(roleInputTable.fetch(fetcher)));
    }
}