package kaigee.top.role.entity;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import kaigee.top.menu.entity.MenuTableEx;
import kaigee.top.user.root.entity.UserRoleRelTableEx;
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
        type = Role.class
)
public class RoleTableEx extends RoleTable implements TableEx<Role> {
    public static final RoleTableEx $ = new RoleTableEx(RoleTable.$, null);

    public RoleTableEx() {
        super();
    }

    public RoleTableEx(AbstractTypedTable.DelayedOperation<Role> delayedOperation) {
        super(delayedOperation);
    }

    public RoleTableEx(TableImplementor<Role> table) {
        super(table);
    }

    protected RoleTableEx(RoleTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleProps.EDITOR.unwrap()));
        }
        return new UserTableEx(joinOperation(RoleProps.EDITOR.unwrap()));
    }

    public UserTableEx editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleProps.EDITOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(RoleProps.EDITOR.unwrap(), joinType));
    }

    public UserTableEx creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleProps.CREATOR.unwrap()));
        }
        return new UserTableEx(joinOperation(RoleProps.CREATOR.unwrap()));
    }

    public UserTableEx creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleProps.CREATOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(RoleProps.CREATOR.unwrap(), joinType));
    }

    public UserRoleRelTableEx users() {
        __beforeJoin();
        if (raw != null) {
            return new UserRoleRelTableEx(raw.joinImplementor(RoleProps.USERS.unwrap()));
        }
        return new UserRoleRelTableEx(joinOperation(RoleProps.USERS.unwrap()));
    }

    public UserRoleRelTableEx users(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserRoleRelTableEx(raw.joinImplementor(RoleProps.USERS.unwrap(), joinType));
        }
        return new UserRoleRelTableEx(joinOperation(RoleProps.USERS.unwrap(), joinType));
    }

    @Override
    public Predicate users(Function<UserRoleRelTableEx, Predicate> block) {
        return exists(RoleProps.USERS.unwrap(), block);
    }

    public RoleMenuRelTableEx menus() {
        __beforeJoin();
        if (raw != null) {
            return new RoleMenuRelTableEx(raw.joinImplementor(RoleProps.MENUS.unwrap()));
        }
        return new RoleMenuRelTableEx(joinOperation(RoleProps.MENUS.unwrap()));
    }

    public RoleMenuRelTableEx menus(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleMenuRelTableEx(raw.joinImplementor(RoleProps.MENUS.unwrap(), joinType));
        }
        return new RoleMenuRelTableEx(joinOperation(RoleProps.MENUS.unwrap(), joinType));
    }

    @Override
    public Predicate menus(Function<RoleMenuRelTableEx, Predicate> block) {
        return exists(RoleProps.MENUS.unwrap(), block);
    }

    public MenuTableEx menusView() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor(RoleProps.MENUS_VIEW.unwrap()));
        }
        return new MenuTableEx(joinOperation(RoleProps.MENUS_VIEW.unwrap()));
    }

    public MenuTableEx menusView(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor(RoleProps.MENUS_VIEW.unwrap(), joinType));
        }
        return new MenuTableEx(joinOperation(RoleProps.MENUS_VIEW.unwrap(), joinType));
    }

    @Override
    public Predicate menusView(Function<MenuTableEx, Predicate> block) {
        return exists(RoleProps.MENUS_VIEW.unwrap(), block);
    }

    @Override
    public RoleTableEx asTableEx() {
        return this;
    }

    @Override
    public RoleTableEx __disableJoin(String reason) {
        return new RoleTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<RoleTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<RoleTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
