package kaigee.top.menu.repository;

import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuFetcher;
import kaigee.top.menu.entity.MenuTable;
import kaigee.top.menu.entity.dto.MenuSpec;
import kaigee.top.user.root.entity.UserFetcher;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.SpringOrders;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface MenuRepository extends JRepository<Menu, String> {
    MenuTable menuTable = MenuTable.$;
    MenuFetcher COMPLEX_FETCHER = MenuFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<Menu> findPage(QueryRequest<MenuSpec> queryRequest, Fetcher<Menu> fetcher) {
        MenuSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(menuTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(menuTable, pageable.getSort()))
                .select(menuTable.fetch(fetcher)));
    }
}