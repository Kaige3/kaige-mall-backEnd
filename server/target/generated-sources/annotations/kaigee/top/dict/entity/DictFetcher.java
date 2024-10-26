package kaigee.top.dict.entity;

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
        type = Dict.class
)
public class DictFetcher extends AbstractTypedFetcher<Dict, DictFetcher> {
    public static final DictFetcher $ = new DictFetcher(null);

    private DictFetcher(FetcherImpl<Dict> base) {
        super(Dict.class, base);
    }

    private DictFetcher(DictFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private DictFetcher(DictFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static DictFetcher $from(Fetcher<Dict> base) {
        return base instanceof DictFetcher ? 
        	(DictFetcher)base : 
        	new DictFetcher((FetcherImpl<Dict>)base);
    }

    @NewChain
    public DictFetcher createdTime() {
        return add("createdTime");
    }

    @NewChain
    public DictFetcher createdTime(boolean enabled) {
        return enabled ? add("createdTime") : remove("createdTime");
    }

    @NewChain
    public DictFetcher editedTime() {
        return add("editedTime");
    }

    @NewChain
    public DictFetcher editedTime(boolean enabled) {
        return enabled ? add("editedTime") : remove("editedTime");
    }

    @NewChain
    public DictFetcher editor() {
        return add("editor");
    }

    @NewChain
    public DictFetcher editor(boolean enabled) {
        return enabled ? add("editor") : remove("editor");
    }

    @NewChain
    public DictFetcher editor(Fetcher<User> childFetcher) {
        return add("editor", childFetcher);
    }

    @NewChain
    public DictFetcher editor(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("editor", childFetcher, fieldConfig);
    }

    @NewChain
    public DictFetcher editor(IdOnlyFetchType idOnlyFetchType) {
        return add("editor", idOnlyFetchType);
    }

    @NewChain
    public DictFetcher creator() {
        return add("creator");
    }

    @NewChain
    public DictFetcher creator(boolean enabled) {
        return enabled ? add("creator") : remove("creator");
    }

    @NewChain
    public DictFetcher creator(Fetcher<User> childFetcher) {
        return add("creator", childFetcher);
    }

    @NewChain
    public DictFetcher creator(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("creator", childFetcher, fieldConfig);
    }

    @NewChain
    public DictFetcher creator(IdOnlyFetchType idOnlyFetchType) {
        return add("creator", idOnlyFetchType);
    }

    @NewChain
    public DictFetcher keyId() {
        return add("keyId");
    }

    @NewChain
    public DictFetcher keyId(boolean enabled) {
        return enabled ? add("keyId") : remove("keyId");
    }

    @NewChain
    public DictFetcher keyEnName() {
        return add("keyEnName");
    }

    @NewChain
    public DictFetcher keyEnName(boolean enabled) {
        return enabled ? add("keyEnName") : remove("keyEnName");
    }

    @NewChain
    public DictFetcher keyName() {
        return add("keyName");
    }

    @NewChain
    public DictFetcher keyName(boolean enabled) {
        return enabled ? add("keyName") : remove("keyName");
    }

    @NewChain
    public DictFetcher dictId() {
        return add("dictId");
    }

    @NewChain
    public DictFetcher dictId(boolean enabled) {
        return enabled ? add("dictId") : remove("dictId");
    }

    @NewChain
    public DictFetcher dictName() {
        return add("dictName");
    }

    @NewChain
    public DictFetcher dictName(boolean enabled) {
        return enabled ? add("dictName") : remove("dictName");
    }

    @NewChain
    public DictFetcher dictEnName() {
        return add("dictEnName");
    }

    @NewChain
    public DictFetcher dictEnName(boolean enabled) {
        return enabled ? add("dictEnName") : remove("dictEnName");
    }

    @NewChain
    public DictFetcher orderNum() {
        return add("orderNum");
    }

    @NewChain
    public DictFetcher orderNum(boolean enabled) {
        return enabled ? add("orderNum") : remove("orderNum");
    }

    @NewChain
    public DictFetcher visible() {
        return add("visible");
    }

    @NewChain
    public DictFetcher visible(boolean enabled) {
        return enabled ? add("visible") : remove("visible");
    }

    @Override
    protected DictFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new DictFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected DictFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new DictFetcher(this, prop, fieldConfig);
    }
}
