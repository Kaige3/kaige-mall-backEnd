package kaigee.top.role.entity.repository;

import kaigee.top.role.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface RoleRepository extends JRepository<Role, String> {
    RoleTable roleTable = RoleTable.$;
    RoleFetcher COMPLEX_FETCHER = RoleFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<Role> findPage(QueryRequest<RoleSpec> queryRequest, Fetcher<Role> fetcher) {
        RoleSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(roleTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(roleTable, pageable.getSort()))
                .select(roleTable.fetch(fetcher)));
    }
}