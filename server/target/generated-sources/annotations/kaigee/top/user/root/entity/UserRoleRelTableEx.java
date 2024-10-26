package kaigee.top.user.root.entity;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import kaigee.top.role.entity.RoleTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = UserRoleRel.class
)
public class UserRoleRelTableEx extends UserRoleRelTable implements TableEx<UserRoleRel> {
    public static final UserRoleRelTableEx $ = new UserRoleRelTableEx(UserRoleRelTable.$, null);

    public UserRoleRelTableEx() {
        super();
    }

    public UserRoleRelTableEx(AbstractTypedTable.DelayedOperation<UserRoleRel> delayedOperation) {
        super(delayedOperation);
    }

    public UserRoleRelTableEx(TableImplementor<UserRoleRel> table) {
        super(table);
    }

    protected UserRoleRelTableEx(UserRoleRelTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(UserRoleRelProps.EDITOR.unwrap()));
        }
        return new UserTableEx(joinOperation(UserRoleRelProps.EDITOR.unwrap()));
    }

    public UserTableEx editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(UserRoleRelProps.EDITOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(UserRoleRelProps.EDITOR.unwrap(), joinType));
    }

    public UserTableEx creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(UserRoleRelProps.CREATOR.unwrap()));
        }
        return new UserTableEx(joinOperation(UserRoleRelProps.CREATOR.unwrap()));
    }

    public UserTableEx creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(UserRoleRelProps.CREATOR.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(UserRoleRelProps.CREATOR.unwrap(), joinType));
    }

    public UserTableEx user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(UserRoleRelProps.USER.unwrap()));
        }
        return new UserTableEx(joinOperation(UserRoleRelProps.USER.unwrap()));
    }

    public UserTableEx user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(UserRoleRelProps.USER.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(UserRoleRelProps.USER.unwrap(), joinType));
    }

    public RoleTableEx role() {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor(UserRoleRelProps.ROLE.unwrap()));
        }
        return new RoleTableEx(joinOperation(UserRoleRelProps.ROLE.unwrap()));
    }

    public RoleTableEx role(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor(UserRoleRelProps.ROLE.unwrap(), joinType));
        }
        return new RoleTableEx(joinOperation(UserRoleRelProps.ROLE.unwrap(), joinType));
    }

    @Override
    public UserRoleRelTableEx asTableEx() {
        return this;
    }

    @Override
    public UserRoleRelTableEx __disableJoin(String reason) {
        return new UserRoleRelTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<UserRoleRelTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<UserRoleRelTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
