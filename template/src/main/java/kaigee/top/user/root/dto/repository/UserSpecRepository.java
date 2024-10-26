package kaigee.top.user.root.entity.dto.repository;

import kaigee.top.user.root.entity.dto.UserSpec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface UserSpecRepository extends JRepository<UserSpec, String> {
    UserSpecTable userSpecTable = UserSpecTable.$;
    UserSpecFetcher COMPLEX_FETCHER = UserSpecFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<UserSpec> findPage(QueryRequest<UserSpecSpec> queryRequest, Fetcher<UserSpec> fetcher) {
        UserSpecSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(userSpecTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(userSpecTable, pageable.getSort()))
                .select(userSpecTable.fetch(fetcher)));
    }
}