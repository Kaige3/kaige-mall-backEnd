package kaigee.top.user.entity.repository;

import kaigee.top.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface UserRepository extends JRepository<User, String> {
    UserTable userTable = UserTable.$;
    UserFetcher COMPLEX_FETCHER = UserFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<User> findPage(QueryRequest<UserSpec> queryRequest, Fetcher<User> fetcher) {
        UserSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(userTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(userTable, pageable.getSort()))
                .select(userTable.fetch(fetcher)));
    }
}