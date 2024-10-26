package kaigee.top.user.root.repository;

import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.role.entity.RoleFetcher;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserFetcher;
import kaigee.top.user.root.entity.UserTable;
import kaigee.top.user.root.entity.dto.UserSpec;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.SpringOrders;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository extends JRepository<User, String> {
    UserTable userTable = UserTable.$;
    UserFetcher COMPLEX_FETCHER = UserFetcher.$.allScalarFields();
    UserFetcher USER_ROLE_FETCHER = UserFetcher.$.allScalarFields().rolesView(RoleFetcher.$.name());
//        .creator(UserFetcher.$.phone().nickname())
//        .editor(UserFetcher.$.phone().nickname());
    default Page<User> findPage(QueryRequest<UserSpec> queryRequest, Fetcher<User> fetcher) {
        UserSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(userTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(userTable, pageable.getSort()))
                .select(userTable.fetch(fetcher)));
    }
}