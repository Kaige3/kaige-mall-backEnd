package kaigee.top.user.root.entity.dto.repository;

import kaigee.top.user.root.entity.dto.UserLoginInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface UserLoginInputRepository extends JRepository<UserLoginInput, String> {
    UserLoginInputTable userLoginInputTable = UserLoginInputTable.$;
    UserLoginInputFetcher COMPLEX_FETCHER = UserLoginInputFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<UserLoginInput> findPage(QueryRequest<UserLoginInputSpec> queryRequest, Fetcher<UserLoginInput> fetcher) {
        UserLoginInputSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(userLoginInputTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(userLoginInputTable, pageable.getSort()))
                .select(userLoginInputTable.fetch(fetcher)));
    }
}