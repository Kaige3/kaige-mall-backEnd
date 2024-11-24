package kaigee.top.box.category.entity;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import kaigee.top.user.root.entity.UserTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = MysteryBoxCategory.class
)
public class MysteryBoxCategoryTableEx extends MysteryBoxCategoryTable implements TableEx<MysteryBoxCategory> {
    public static final MysteryBoxCategoryTableEx $ = new MysteryBoxCategoryTableEx(MysteryBoxCategoryTable.$, null);

    public MysteryBoxCategoryTableEx() {
        super();
    }

    public MysteryBoxCategoryTableEx(
            AbstractTypedTable.DelayedOperation<MysteryBoxCategory> delayedOperation) {
        super(delayedOperation);
    }

    public MysteryBoxCategoryTableEx(TableImplementor<MysteryBoxCategory> table) {
        super(table);
    }

    protected MysteryBoxCategoryTableEx(MysteryBoxCategoryTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MysteryBoxCategoryProps.EDITOR.unwrap()));
        }
        return new UserTableEx(joinOperation(MysteryBoxCategoryProps.EDITOR.unwrap()));
    }

    public UserTableEx editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MysteryBoxCategoryProps.EDITOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(MysteryBoxCategoryProps.EDITOR.unwrap(), joinType));
    }

    public UserTableEx creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MysteryBoxCategoryProps.CREATOR.unwrap()));
        }
        return new UserTableEx(joinOperation(MysteryBoxCategoryProps.CREATOR.unwrap()));
    }

    public UserTableEx creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MysteryBoxCategoryProps.CREATOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(MysteryBoxCategoryProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public MysteryBoxCategoryTableEx asTableEx() {
        return this;
    }

    @Override
    public MysteryBoxCategoryTableEx __disableJoin(String reason) {
        return new MysteryBoxCategoryTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<MysteryBoxCategoryTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<MysteryBoxCategoryTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
