package kaigee.top.menu.entity;

import java.lang.Override;
import java.util.function.Consumer;
import kaigee.top.role.entity.RoleMenuRel;
import kaigee.top.role.entity.RoleMenuRelTable;
import kaigee.top.user.root.entity.User;
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
        type = Menu.class
)
public class MenuFetcher extends AbstractTypedFetcher<Menu, MenuFetcher> {
    public static final MenuFetcher $ = new MenuFetcher(null);

    private MenuFetcher(FetcherImpl<Menu> base) {
        super(Menu.class, base);
    }

    private MenuFetcher(MenuFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private MenuFetcher(MenuFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static MenuFetcher $from(Fetcher<Menu> base) {
        return base instanceof MenuFetcher ? 
        	(MenuFetcher)base : 
        	new MenuFetcher((FetcherImpl<Menu>)base);
    }

    @NewChain
    public MenuFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public MenuFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public MenuFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public MenuFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public MenuFetcher editor() {
        return add("editor");
    }

    @NewChain
    public MenuFetcher editor(boolean enabled) {
        return enabled ? add("editor") : remove("editor");
    }

    @NewChain
    public MenuFetcher editor(Fetcher<User> childFetcher) {
        return add("editor", childFetcher);
    }

    @NewChain
    public MenuFetcher editor(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("editor", childFetcher, fieldConfig);
    }

    @NewChain
    public MenuFetcher editor(IdOnlyFetchType idOnlyFetchType) {
        return add("editor", idOnlyFetchType);
    }

    @NewChain
    public MenuFetcher creator() {
        return add("creator");
    }

    @NewChain
    public MenuFetcher creator(boolean enabled) {
        return enabled ? add("creator") : remove("creator");
    }

    @NewChain
    public MenuFetcher creator(Fetcher<User> childFetcher) {
        return add("creator", childFetcher);
    }

    @NewChain
    public MenuFetcher creator(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("creator", childFetcher, fieldConfig);
    }

    @NewChain
    public MenuFetcher creator(IdOnlyFetchType idOnlyFetchType) {
        return add("creator", idOnlyFetchType);
    }

    @NewChain
    public MenuFetcher name() {
        return add("name");
    }

    @NewChain
    public MenuFetcher name(boolean enabled) {
        return enabled ? add("name") : remove("name");
    }

    @NewChain
    public MenuFetcher path() {
        return add("path");
    }

    @NewChain
    public MenuFetcher path(boolean enabled) {
        return enabled ? add("path") : remove("path");
    }

    @NewChain
    public MenuFetcher parentId() {
        return add("parentId");
    }

    @NewChain
    public MenuFetcher parentId(boolean enabled) {
        return enabled ? add("parentId") : remove("parentId");
    }

    @NewChain
    public MenuFetcher orderNum() {
        return add("orderNum");
    }

    @NewChain
    public MenuFetcher orderNum(boolean enabled) {
        return enabled ? add("orderNum") : remove("orderNum");
    }

    @NewChain
    public MenuFetcher menuType() {
        return add("menuType");
    }

    @NewChain
    public MenuFetcher menuType(boolean enabled) {
        return enabled ? add("menuType") : remove("menuType");
    }

    @NewChain
    public MenuFetcher icon() {
        return add("icon");
    }

    @NewChain
    public MenuFetcher icon(boolean enabled) {
        return enabled ? add("icon") : remove("icon");
    }

    @NewChain
    public MenuFetcher roles() {
        return add("roles");
    }

    @NewChain
    public MenuFetcher roles(boolean enabled) {
        return enabled ? add("roles") : remove("roles");
    }

    @NewChain
    public MenuFetcher roles(Fetcher<RoleMenuRel> childFetcher) {
        return add("roles", childFetcher);
    }

    @NewChain
    public MenuFetcher roles(Fetcher<RoleMenuRel> childFetcher,
            Consumer<ListFieldConfig<RoleMenuRel, RoleMenuRelTable>> fieldConfig) {
        return add("roles", childFetcher, fieldConfig);
    }

    @Override
    protected MenuFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new MenuFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected MenuFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new MenuFetcher(this, prop, fieldConfig);
    }
}
