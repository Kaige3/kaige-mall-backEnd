package kaigee.top.role.entity;

import java.lang.Override;
import java.util.function.Consumer;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserRoleRel;
import kaigee.top.user.root.entity.UserRoleRelTable;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Role.class
)
public class RoleFetcher extends AbstractTypedFetcher<Role, RoleFetcher> {
    public static final RoleFetcher $ = new RoleFetcher(null);

    private RoleFetcher(FetcherImpl<Role> base) {
        super(Role.class, base);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static RoleFetcher $from(Fetcher<Role> base) {
        return base instanceof RoleFetcher ? 
        	(RoleFetcher)base : 
        	new RoleFetcher((FetcherImpl<Role>)base);
    }

    @NewChain
    public RoleFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public RoleFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public RoleFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public RoleFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public RoleFetcher editor() {
        return add("editor");
    }

    @NewChain
    public RoleFetcher editor(boolean enabled) {
        return enabled ? add("editor") : remove("editor");
    }

    @NewChain
    public RoleFetcher editor(Fetcher<User> childFetcher) {
        return add("editor", childFetcher);
    }

    @NewChain
    public RoleFetcher editor(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("editor", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleFetcher editor(IdOnlyFetchType idOnlyFetchType) {
        return add("editor", idOnlyFetchType);
    }

    @NewChain
    public RoleFetcher creator() {
        return add("creator");
    }

    @NewChain
    public RoleFetcher creator(boolean enabled) {
        return enabled ? add("creator") : remove("creator");
    }

    @NewChain
    public RoleFetcher creator(Fetcher<User> childFetcher) {
        return add("creator", childFetcher);
    }

    @NewChain
    public RoleFetcher creator(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("creator", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleFetcher creator(IdOnlyFetchType idOnlyFetchType) {
        return add("creator", idOnlyFetchType);
    }

    @NewChain
    public RoleFetcher name() {
        return add("name");
    }

    @NewChain
    public RoleFetcher name(boolean enabled) {
        return enabled ? add("name") : remove("name");
    }

    @NewChain
    public RoleFetcher users() {
        return add("users");
    }

    @NewChain
    public RoleFetcher users(boolean enabled) {
        return enabled ? add("users") : remove("users");
    }

    @NewChain
    public RoleFetcher users(Fetcher<UserRoleRel> childFetcher) {
        return add("users", childFetcher);
    }

    @NewChain
    public RoleFetcher users(Fetcher<UserRoleRel> childFetcher,
            Consumer<ListFieldConfig<UserRoleRel, UserRoleRelTable>> fieldConfig) {
        return add("users", childFetcher, fieldConfig);
    }

    @Override
    protected RoleFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new RoleFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected RoleFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new RoleFetcher(this, prop, fieldConfig);
    }
}
