package kaigee.top.user.repository;

import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.user.entity.User;
import kaigee.top.user.entity.UserFetcher;
import kaigee.top.user.entity.UserTable;
import kaigee.top.user.entity.dto.UserSpec;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.SpringOrders;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository extends JRepository<User, String> {
    UserTable userTable = UserTable.$;
    UserFetcher COMPLEX_FETCHER = UserFetcher.$.allScalarFields();
//            .creator(UserFetcher.$.phone().nickname())
//            .editor(UserFetcher.$.phone().nickname());

    default Page<User> findPage(QueryRequest<UserSpec> queryRequest, Fetcher<User> fetcher) {
        UserSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(userTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(userTable, pageable.getSort()))
                .select(userTable.fetch(fetcher)));
    }
}