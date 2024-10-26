package kaigee.top.role.entity.dto.repository;

import kaigee.top.role.entity.dto.RoleSpec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface RoleSpecRepository extends JRepository<RoleSpec, String> {
    RoleSpecTable roleSpecTable = RoleSpecTable.$;
    RoleSpecFetcher COMPLEX_FETCHER = RoleSpecFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<RoleSpec> findPage(QueryRequest<RoleSpecSpec> queryRequest, Fetcher<RoleSpec> fetcher) {
        RoleSpecSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(roleSpecTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(roleSpecTable, pageable.getSort()))
                .select(roleSpecTable.fetch(fetcher)));
    }
}