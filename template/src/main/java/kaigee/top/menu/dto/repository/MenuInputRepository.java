package kaigee.top.menu.entity.dto.repository;

import kaigee.top.menu.entity.dto.MenuInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface MenuInputRepository extends JRepository<MenuInput, String> {
    MenuInputTable menuInputTable = MenuInputTable.$;
    MenuInputFetcher COMPLEX_FETCHER = MenuInputFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<MenuInput> findPage(QueryRequest<MenuInputSpec> queryRequest, Fetcher<MenuInput> fetcher) {
        MenuInputSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(menuInputTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(menuInputTable, pageable.getSort()))
                .select(menuInputTable.fetch(fetcher)));
    }
}