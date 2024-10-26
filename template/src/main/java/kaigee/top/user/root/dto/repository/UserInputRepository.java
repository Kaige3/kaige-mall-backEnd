package kaigee.top.user.root.entity.dto.repository;

import kaigee.top.user.root.entity.dto.UserInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public interface UserInputRepository extends JRepository<UserInput, String> {
    UserInputTable userInputTable = UserInputTable.$;
    UserInputFetcher COMPLEX_FETCHER = UserInputFetcher.$.allScalarFields()
        .creator(UserFetcher.$.phone().nickname())
        .editor(UserFetcher.$.phone().nickname());
    default Page<UserInput> findPage(QueryRequest<UserInputSpec> queryRequest, Fetcher<UserInput> fetcher) {
        UserInputSpec query = queryRequest.getQuery();
        Pageable pageable = queryRequest.toPageable();
        return pager(pageable).execute(sql().createQuery(userInputTable)
                .where(query)
                .orderBy(SpringOrders.toOrders(userInputTable, pageable.getSort()))
                .select(userInputTable.fetch(fetcher)));
    }
}