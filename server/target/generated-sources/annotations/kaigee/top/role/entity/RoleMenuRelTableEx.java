package kaigee.top.role.entity;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import kaigee.top.menu.entity.MenuTableEx;
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
        type = RoleMenuRel.class
)
public class RoleMenuRelTableEx extends RoleMenuRelTable implements TableEx<RoleMenuRel> {
    public static final RoleMenuRelTableEx $ = new RoleMenuRelTableEx(RoleMenuRelTable.$, null);

    public RoleMenuRelTableEx() {
        super();
    }

    public RoleMenuRelTableEx(AbstractTypedTable.DelayedOperation<RoleMenuRel> delayedOperation) {
        super(delayedOperation);
    }

    public RoleMenuRelTableEx(TableImplementor<RoleMenuRel> table) {
        super(table);
    }

    protected RoleMenuRelTableEx(RoleMenuRelTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleMenuRelProps.EDITOR.unwrap()));
        }
        return new UserTableEx(joinOperation(RoleMenuRelProps.EDITOR.unwrap()));
    }

    public UserTableEx editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleMenuRelProps.EDITOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(RoleMenuRelProps.EDITOR.unwrap(), joinType));
    }

    public UserTableEx creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleMenuRelProps.CREATOR.unwrap()));
        }
        return new UserTableEx(joinOperation(RoleMenuRelProps.CREATOR.unwrap()));
    }

    public UserTableEx creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleMenuRelProps.CREATOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(RoleMenuRelProps.CREATOR.unwrap(), joinType));
    }

    public RoleTableEx role() {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor(RoleMenuRelProps.ROLE.unwrap()));
        }
        return new RoleTableEx(joinOperation(RoleMenuRelProps.ROLE.unwrap()));
    }

    public RoleTableEx role(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor(RoleMenuRelProps.ROLE.unwrap(), joinType));
        }
        return new RoleTableEx(joinOperation(RoleMenuRelProps.ROLE.unwrap(), joinType));
    }

    public MenuTableEx menu() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor(RoleMenuRelProps.MENU.unwrap()));
        }
        return new MenuTableEx(joinOperation(RoleMenuRelProps.MENU.unwrap()));
    }

    public MenuTableEx menu(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor(RoleMenuRelProps.MENU.unwrap(), joinType));
        }
        return new MenuTableEx(joinOperation(RoleMenuRelProps.MENU.unwrap(), joinType));
    }

    @Override
    public RoleMenuRelTableEx asTableEx() {
        return this;
    }

    @Override
    public RoleMenuRelTableEx __disableJoin(String reason) {
        return new RoleMenuRelTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<RoleMenuRelTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<RoleMenuRelTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
