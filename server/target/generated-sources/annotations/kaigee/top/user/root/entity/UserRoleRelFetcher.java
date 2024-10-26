package kaigee.top.user.root.entity;

import java.lang.Override;
import java.util.function.Consumer;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleTable;
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
        type = UserRoleRel.class
)
public class UserRoleRelFetcher extends AbstractTypedFetcher<UserRoleRel, UserRoleRelFetcher> {
    public static final UserRoleRelFetcher $ = new UserRoleRelFetcher(null);

    private UserRoleRelFetcher(FetcherImpl<UserRoleRel> base) {
        super(UserRoleRel.class, base);
    }

    private UserRoleRelFetcher(UserRoleRelFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private UserRoleRelFetcher(UserRoleRelFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static UserRoleRelFetcher $from(Fetcher<UserRoleRel> base) {
        return base instanceof UserRoleRelFetcher ? 
        	(UserRoleRelFetcher)base : 
        	new UserRoleRelFetcher((FetcherImpl<UserRoleRel>)base);
    }

    @NewChain
    public UserRoleRelFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public UserRoleRelFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public UserRoleRelFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public UserRoleRelFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public UserRoleRelFetcher editor() {
        return add("editor");
    }

    @NewChain
    public UserRoleRelFetcher editor(boolean enabled) {
        return enabled ? add("editor") : remove("editor");
    }

    @NewChain
    public UserRoleRelFetcher editor(Fetcher<User> childFetcher) {
        return add("editor", childFetcher);
    }

    @NewChain
    public UserRoleRelFetcher editor(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("editor", childFetcher, fieldConfig);
    }

    @NewChain
    public UserRoleRelFetcher editor(IdOnlyFetchType idOnlyFetchType) {
        return add("editor", idOnlyFetchType);
    }

    @NewChain
    public UserRoleRelFetcher creator() {
        return add("creator");
    }

    @NewChain
    public UserRoleRelFetcher creator(boolean enabled) {
        return enabled ? add("creator") : remove("creator");
    }

    @NewChain
    public UserRoleRelFetcher creator(Fetcher<User> childFetcher) {
        return add("creator", childFetcher);
    }

    @NewChain
    public UserRoleRelFetcher creator(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("creator", childFetcher, fieldConfig);
    }

    @NewChain
    public UserRoleRelFetcher creator(IdOnlyFetchType idOnlyFetchType) {
        return add("creator", idOnlyFetchType);
    }

    @NewChain
    public UserRoleRelFetcher user() {
        return add("user");
    }

    @NewChain
    public UserRoleRelFetcher user(boolean enabled) {
        return enabled ? add("user") : remove("user");
    }

    @NewChain
    public UserRoleRelFetcher user(Fetcher<User> childFetcher) {
        return add("user", childFetcher);
    }

    @NewChain
    public UserRoleRelFetcher user(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("user", childFetcher, fieldConfig);
    }

    @NewChain
    public UserRoleRelFetcher user(IdOnlyFetchType idOnlyFetchType) {
        return add("user", idOnlyFetchType);
    }

    @NewChain
    public UserRoleRelFetcher role() {
        return add("role");
    }

    @NewChain
    public UserRoleRelFetcher role(boolean enabled) {
        return enabled ? add("role") : remove("role");
    }

    @NewChain
    public UserRoleRelFetcher role(Fetcher<Role> childFetcher) {
        return add("role", childFetcher);
    }

    @NewChain
    public UserRoleRelFetcher role(Fetcher<Role> childFetcher,
            Consumer<FieldConfig<Role, RoleTable>> fieldConfig) {
        return add("role", childFetcher, fieldConfig);
    }

    @NewChain
    public UserRoleRelFetcher role(IdOnlyFetchType idOnlyFetchType) {
        return add("role", idOnlyFetchType);
    }

    @Override
    protected UserRoleRelFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new UserRoleRelFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected UserRoleRelFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new UserRoleRelFetcher(this, prop, fieldConfig);
    }
}
