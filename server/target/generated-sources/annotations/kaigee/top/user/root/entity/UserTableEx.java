package kaigee.top.user.root.entity;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import kaigee.top.role.entity.RoleTableEx;
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
        type = User.class
)
public class UserTableEx extends UserTable implements TableEx<User> {
    public static final UserTableEx $ = new UserTableEx(UserTable.$, null);

    public UserTableEx() {
        super();
    }

    public UserTableEx(AbstractTypedTable.DelayedOperation<User> delayedOperation) {
        super(delayedOperation);
    }

    public UserTableEx(TableImplementor<User> table) {
        super(table);
    }

    protected UserTableEx(UserTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserRoleRelTableEx roles() {
        __beforeJoin();
        if (raw != null) {
            return new UserRoleRelTableEx(raw.joinImplementor(UserProps.ROLES.unwrap()));
        }
        return new UserRoleRelTableEx(joinOperation(UserProps.ROLES.unwrap()));
    }

    public UserRoleRelTableEx roles(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserRoleRelTableEx(raw.joinImplementor(UserProps.ROLES.unwrap(), joinType));
        }
        return new UserRoleRelTableEx(joinOperation(UserProps.ROLES.unwrap(), joinType));
    }

    @Override
    public Predicate roles(Function<UserRoleRelTableEx, Predicate> block) {
        return exists(UserProps.ROLES.unwrap(), block);
    }

    public RoleTableEx rolesView() {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor(UserProps.ROLES_VIEW.unwrap()));
        }
        return new RoleTableEx(joinOperation(UserProps.ROLES_VIEW.unwrap()));
    }

    public RoleTableEx rolesView(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor(UserProps.ROLES_VIEW.unwrap(), joinType));
        }
        return new RoleTableEx(joinOperation(UserProps.ROLES_VIEW.unwrap(), joinType));
    }

    @Override
    public Predicate rolesView(Function<RoleTableEx, Predicate> block) {
        return exists(UserProps.ROLES_VIEW.unwrap(), block);
    }

    @Override
    public UserTableEx asTableEx() {
        return this;
    }

    @Override
    public UserTableEx __disableJoin(String reason) {
        return new UserTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<UserTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<UserTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
