package kaigee.top.role.entity;

import java.lang.Override;
import java.util.function.Consumer;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuTable;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserTable;
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
        type = RoleMenuRel.class
)
public class RoleMenuRelFetcher extends AbstractTypedFetcher<RoleMenuRel, RoleMenuRelFetcher> {
    public static final RoleMenuRelFetcher $ = new RoleMenuRelFetcher(null);

    private RoleMenuRelFetcher(FetcherImpl<RoleMenuRel> base) {
        super(RoleMenuRel.class, base);
    }

    private RoleMenuRelFetcher(RoleMenuRelFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private RoleMenuRelFetcher(RoleMenuRelFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static RoleMenuRelFetcher $from(Fetcher<RoleMenuRel> base) {
        return base instanceof RoleMenuRelFetcher ? 
        	(RoleMenuRelFetcher)base : 
        	new RoleMenuRelFetcher((FetcherImpl<RoleMenuRel>)base);
    }

    @NewChain
    public RoleMenuRelFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public RoleMenuRelFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public RoleMenuRelFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public RoleMenuRelFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public RoleMenuRelFetcher editor() {
        return add("editor");
    }

    @NewChain
    public RoleMenuRelFetcher editor(boolean enabled) {
        return enabled ? add("editor") : remove("editor");
    }

    @NewChain
    public RoleMenuRelFetcher editor(Fetcher<User> childFetcher) {
        return add("editor", childFetcher);
    }

    @NewChain
    public RoleMenuRelFetcher editor(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("editor", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleMenuRelFetcher editor(IdOnlyFetchType idOnlyFetchType) {
        return add("editor", idOnlyFetchType);
    }

    @NewChain
    public RoleMenuRelFetcher creator() {
        return add("creator");
    }

    @NewChain
    public RoleMenuRelFetcher creator(boolean enabled) {
        return enabled ? add("creator") : remove("creator");
    }

    @NewChain
    public RoleMenuRelFetcher creator(Fetcher<User> childFetcher) {
        return add("creator", childFetcher);
    }

    @NewChain
    public RoleMenuRelFetcher creator(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("creator", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleMenuRelFetcher creator(IdOnlyFetchType idOnlyFetchType) {
        return add("creator", idOnlyFetchType);
    }

    @NewChain
    public RoleMenuRelFetcher role() {
        return add("role");
    }

    @NewChain
    public RoleMenuRelFetcher role(boolean enabled) {
        return enabled ? add("role") : remove("role");
    }

    @NewChain
    public RoleMenuRelFetcher role(Fetcher<Role> childFetcher) {
        return add("role", childFetcher);
    }

    @NewChain
    public RoleMenuRelFetcher role(Fetcher<Role> childFetcher,
            Consumer<FieldConfig<Role, RoleTable>> fieldConfig) {
        return add("role", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleMenuRelFetcher role(IdOnlyFetchType idOnlyFetchType) {
        return add("role", idOnlyFetchType);
    }

    @NewChain
    public RoleMenuRelFetcher menu() {
        return add("menu");
    }

    @NewChain
    public RoleMenuRelFetcher menu(boolean enabled) {
        return enabled ? add("menu") : remove("menu");
    }

    @NewChain
    public RoleMenuRelFetcher menu(Fetcher<Menu> childFetcher) {
        return add("menu", childFetcher);
    }

    @NewChain
    public RoleMenuRelFetcher menu(Fetcher<Menu> childFetcher,
            Consumer<FieldConfig<Menu, MenuTable>> fieldConfig) {
        return add("menu", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleMenuRelFetcher menu(IdOnlyFetchType idOnlyFetchType) {
        return add("menu", idOnlyFetchType);
    }

    @Override
    protected RoleMenuRelFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new RoleMenuRelFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected RoleMenuRelFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new RoleMenuRelFetcher(this, prop, fieldConfig);
    }
}
