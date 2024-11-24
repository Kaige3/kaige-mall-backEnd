package kaigee.top.box.category.repository;

import kaigee.top.box.category.entity.MysteryBoxCategory;
import kaigee.top.box.category.entity.MysteryBoxCategoryFetcher;
import kaigee.top.box.category.entity.MysteryBoxCategoryTable;
import kaigee.top.box.category.entity.dto.MysteryBoxCategorySpec;
import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.user.root.entity.UserFetcher;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.SpringOrders;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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