package kaigee.top.menu.entity.repository;

import kaigee.top.menu.entity.Menu;
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