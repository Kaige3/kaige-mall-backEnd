package kaigee.top.user.entity;

import java.lang.Override;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = User.class
)
public class UserFetcher extends AbstractTypedFetcher<User, UserFetcher> {
    public static final UserFetcher $ = new UserFetcher(null);

    private UserFetcher(FetcherImpl<User> base) {
        super(User.class, base);
    }

    private UserFetcher(UserFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private UserFetcher(UserFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static UserFetcher $from(Fetcher<User> base) {
        return base instanceof UserFetcher ? 
        	(UserFetcher)base : 
        	new UserFetcher((FetcherImpl<User>)base);
    }

    @NewChain
    public UserFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public UserFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public UserFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public UserFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public UserFetcher nickname() {
        return add("nickname");
    }

    @NewChain
    public UserFetcher nickname(boolean enabled) {
        return enabled ? add("nickname") : remove("nickname");
    }

    @NewChain
    public UserFetcher avatar() {
        return add("avatar");
    }

    @NewChain
    public UserFetcher avatar(boolean enabled) {
        return enabled ? add("avatar") : remove("avatar");
    }

    @NewChain
    public UserFetcher gender() {
        return add("gender");
    }

    @NewChain
    public UserFetcher gender(boolean enabled) {
        return enabled ? add("gender") : remove("gender");
    }

    @NewChain
    public UserFetcher phone() {
        return add("phone");
    }

    @NewChain
    public UserFetcher phone(boolean enabled) {
        return enabled ? add("phone") : remove("phone");
    }

    @NewChain
    public UserFetcher password() {
        return add("password");
    }

    @NewChain
    public UserFetcher password(boolean enabled) {
        return enabled ? add("password") : remove("password");
    }

    @Override
    protected UserFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new UserFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected UserFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new UserFetcher(this, prop, fieldConfig);
    }
}
