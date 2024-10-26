package kaigee.top.menu.entity;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import kaigee.top.role.entity.RoleMenuRelTableEx;
import kaigee.top.user.root.entity.UserTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Menu.class
)
public class MenuTableEx extends MenuTable implements TableEx<Menu> {
    public static final MenuTableEx $ = new MenuTableEx(MenuTable.$, null);

    public MenuTableEx() {
        super();
    }

    public MenuTableEx(AbstractTypedTable.DelayedOperation<Menu> delayedOperation) {
        super(delayedOperation);
    }

    public MenuTableEx(TableImplementor<Menu> table) {
        super(table);
    }

    protected MenuTableEx(MenuTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MenuProps.EDITOR.unwrap()));
        }
        return new UserTableEx(joinOperation(MenuProps.EDITOR.unwrap()));
    }

    public UserTableEx editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MenuProps.EDITOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(MenuProps.EDITOR.unwrap(), joinType));
    }

    public UserTableEx creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MenuProps.CREATOR.unwrap()));
        }
        return new UserTableEx(joinOperation(MenuProps.CREATOR.unwrap()));
    }

    public UserTableEx creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MenuProps.CREATOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(MenuProps.CREATOR.unwrap(), joinType));
    }

    public RoleMenuRelTableEx roles() {
        __beforeJoin();
        if (raw != null) {
            return new RoleMenuRelTableEx(raw.joinImplementor(MenuProps.ROLES.unwrap()));
        }
        return new RoleMenuRelTableEx(joinOperation(MenuProps.ROLES.unwrap()));
    }

    public RoleMenuRelTableEx roles(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleMenuRelTableEx(raw.joinImplementor(MenuProps.ROLES.unwrap(), joinType));
        }
        return new RoleMenuRelTableEx(joinOperation(MenuProps.ROLES.unwrap(), joinType));
    }

    @Override
    public Predicate roles(Function<RoleMenuRelTableEx, Predicate> block) {
        return exists(MenuProps.ROLES.unwrap(), block);
    }

    @Override
    public MenuTableEx asTableEx() {
        return this;
    }

    @Override
    public MenuTableEx __disableJoin(String reason) {
        return new MenuTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<MenuTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<MenuTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
