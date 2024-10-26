package kaigee.top.role.repository;

import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleFetcher;
import kaigee.top.role.entity.RoleTable;
import kaigee.top.role.entity.dto.RoleSpec;
import kaigee.top.user.root.entity.UserFetcher;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.SpringOrders;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoleRepository extends JRepository<Role, String> {
    RoleTable roleTable = RoleTable.$;
    RoleFetcher COMPLEX_FETCHER = RoleFetcher.$.allScalarFields();
    RoleFetcher ROLE_MENU_FETCHER = RoleFetcher.$.allScalarFields().menusView(true);



    default Page<Role> findPage(QueryRequest<RoleSpec> queryRequest, Fetcher<Role> fetcher) {
        RoleSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(roleTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(roleTable, pageable.getSort()))
                .select(roleTable.fetch(fetcher)));
    }
}