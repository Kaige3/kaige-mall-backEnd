package kaigee.top.menu.entity.dto.repository;

import kaigee.top.menu.entity.dto.MenuSpec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface MenuSpecRepository extends JRepository<MenuSpec, String> {
    MenuSpecTable menuSpecTable = MenuSpecTable.$;
    MenuSpecFetcher COMPLEX_FETCHER = MenuSpecFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<MenuSpec> findPage(QueryRequest<MenuSpecSpec> queryRequest, Fetcher<MenuSpec> fetcher) {
        MenuSpecSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(menuSpecTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(menuSpecTable, pageable.getSort()))
                .select(menuSpecTable.fetch(fetcher)));
    }
}