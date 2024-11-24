package kaigee.top.box.category.entity;

import java.lang.Override;
import java.util.function.Consumer;
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
        type = MysteryBoxCategory.class
)
public class MysteryBoxCategoryFetcher extends AbstractTypedFetcher<MysteryBoxCategory, MysteryBoxCategoryFetcher> {
    public static final MysteryBoxCategoryFetcher $ = new MysteryBoxCategoryFetcher(null);

    private MysteryBoxCategoryFetcher(FetcherImpl<MysteryBoxCategory> base) {
        super(MysteryBoxCategory.class, base);
    }

    private MysteryBoxCategoryFetcher(MysteryBoxCategoryFetcher prev, ImmutableProp prop,
            boolean negative, IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private MysteryBoxCategoryFetcher(MysteryBoxCategoryFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static MysteryBoxCategoryFetcher $from(Fetcher<MysteryBoxCategory> base) {
        return base instanceof MysteryBoxCategoryFetcher ? 
        	(MysteryBoxCategoryFetcher)base : 
        	new MysteryBoxCategoryFetcher((FetcherImpl<MysteryBoxCategory>)base);
    }

    @NewChain
    public MysteryBoxCategoryFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public MysteryBoxCategoryFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public MysteryBoxCategoryFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public MysteryBoxCategoryFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public MysteryBoxCategoryFetcher editor() {
        return add("editor");
    }

    @NewChain
    public MysteryBoxCategoryFetcher editor(boolean enabled) {
        return enabled ? add("editor") : remove("editor");
    }

    @NewChain
    public MysteryBoxCategoryFetcher editor(Fetcher<User> childFetcher) {
        return add("editor", childFetcher);
    }

    @NewChain
    public MysteryBoxCategoryFetcher editor(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("editor", childFetcher, fieldConfig);
    }

    @NewChain
    public MysteryBoxCategoryFetcher editor(IdOnlyFetchType idOnlyFetchType) {
        return add("editor", idOnlyFetchType);
    }

    @NewChain
    public MysteryBoxCategoryFetcher creator() {
        return add("creator");
    }

    @NewChain
    public MysteryBoxCategoryFetcher creator(boolean enabled) {
        return enabled ? add("creator") : remove("creator");
    }

    @NewChain
    public MysteryBoxCategoryFetcher creator(Fetcher<User> childFetcher) {
        return add("creator", childFetcher);
    }

    @NewChain
    public MysteryBoxCategoryFetcher creator(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("creator", childFetcher, fieldConfig);
    }

    @NewChain
    public MysteryBoxCategoryFetcher creator(IdOnlyFetchType idOnlyFetchType) {
        return add("creator", idOnlyFetchType);
    }

    @NewChain
    public MysteryBoxCategoryFetcher name() {
        return add("name");
    }

    @NewChain
    public MysteryBoxCategoryFetcher name(boolean enabled) {
        return enabled ? add("name") : remove("name");
    }

    @NewChain
    public MysteryBoxCategoryFetcher icon() {
        return add("icon");
    }

    @NewChain
    public MysteryBoxCategoryFetcher icon(boolean enabled) {
        return enabled ? add("icon") : remove("icon");
    }

    @NewChain
    public MysteryBoxCategoryFetcher description() {
        return add("description");
    }

    @NewChain
    public MysteryBoxCategoryFetcher description(boolean enabled) {
        return enabled ? add("description") : remove("description");
    }

    @NewChain
    public MysteryBoxCategoryFetcher sortOrder() {
        return add("sortOrder");
    }

    @NewChain
    public MysteryBoxCategoryFetcher sortOrder(boolean enabled) {
        return enabled ? add("sortOrder") : remove("sortOrder");
    }

    @Override
    protected MysteryBoxCategoryFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new MysteryBoxCategoryFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected MysteryBoxCategoryFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new MysteryBoxCategoryFetcher(this, prop, fieldConfig);
    }
}
