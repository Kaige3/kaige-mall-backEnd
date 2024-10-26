package kaigee.top.dict.entity;

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
        type = Dict.class
)
public class DictTableEx extends DictTable implements TableEx<Dict> {
    public static final DictTableEx $ = new DictTableEx(DictTable.$, null);

    public DictTableEx() {
        super();
    }

    public DictTableEx(AbstractTypedTable.DelayedOperation<Dict> delayedOperation) {
        super(delayedOperation);
    }

    public DictTableEx(TableImplementor<Dict> table) {
        super(table);
    }

    protected DictTableEx(DictTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(DictProps.EDITOR.unwrap()));
        }
        return new UserTableEx(joinOperation(DictProps.EDITOR.unwrap()));
    }

    public UserTableEx editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(DictProps.EDITOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(DictProps.EDITOR.unwrap(), joinType));
    }

    public UserTableEx creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(DictProps.CREATOR.unwrap()));
        }
        return new UserTableEx(joinOperation(DictProps.CREATOR.unwrap()));
    }

    public UserTableEx creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(DictProps.CREATOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(DictProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public DictTableEx asTableEx() {
        return this;
    }

    @Override
    public DictTableEx __disableJoin(String reason) {
        return new DictTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<DictTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<DictTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
