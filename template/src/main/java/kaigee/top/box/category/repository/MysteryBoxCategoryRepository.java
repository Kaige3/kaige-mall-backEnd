package kaigee.top.box.category.entity.repository;

import kaigee.top.box.category.entity.MysteryBoxCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface MysteryBoxCategoryRepository extends JRepository<MysteryBoxCategory, String> {
    MysteryBoxCategoryTable mysteryBoxCategoryTable = MysteryBoxCategoryTable.$;
    MysteryBoxCategoryFetcher COMPLEX_FETCHER = MysteryBoxCategoryFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<MysteryBoxCategory> findPage(QueryRequest<MysteryBoxCategorySpec> queryRequest, Fetcher<MysteryBoxCategory> fetcher) {
        MysteryBoxCategorySpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(mysteryBoxCategoryTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(mysteryBoxCategoryTable, pageable.getSort()))
                .select(mysteryBoxCategoryTable.fetch(fetcher)));
    }
}