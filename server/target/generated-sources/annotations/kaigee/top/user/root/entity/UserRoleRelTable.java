package kaigee.top.user.root.entity;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.role.entity.RoleTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = UserRoleRel.class
)
public class UserRoleRelTable extends AbstractTypedTable<UserRoleRel> implements UserRoleRelProps {
    public static final UserRoleRelTable $ = new UserRoleRelTable();

    public UserRoleRelTable() {
        super(UserRoleRel.class);
    }

    public UserRoleRelTable(AbstractTypedTable.DelayedOperation<UserRoleRel> delayedOperation) {
        super(UserRoleRel.class, delayedOperation);
    }

    public UserRoleRelTable(TableImplementor<UserRoleRel> table) {
        super(table);
    }

    protected UserRoleRelTable(UserRoleRelTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(UserRoleRelProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(UserRoleRelProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(UserRoleRelProps.EDITED_TIME.unwrap());
    }

    @Override
    public UserTable editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(UserRoleRelProps.EDITOR.unwrap()));
        }
        return new UserTable(joinOperation(UserRoleRelProps.EDITOR.unwrap()));
    }

    @Override
    public UserTable editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(UserRoleRelProps.EDITOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(UserRoleRelProps.EDITOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str editorId() {
        return __getAssociatedId(UserRoleRelProps.EDITOR.unwrap());
    }

    @Override
    public UserTable creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(UserRoleRelProps.CREATOR.unwrap()));
        }
        return new UserTable(joinOperation(UserRoleRelProps.CREATOR.unwrap()));
    }

    @Override
    public UserTable creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(UserRoleRelProps.CREATOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(UserRoleRelProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str creatorId() {
        return __getAssociatedId(UserRoleRelProps.CREATOR.unwrap());
    }

    @Override
    public UserTable user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(UserRoleRelProps.USER.unwrap()));
        }
        return new UserTable(joinOperation(UserRoleRelProps.USER.unwrap()));
    }

    @Override
    public UserTable user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(UserRoleRelProps.USER.unwrap(), joinType));
        }
        return new UserTable(joinOperation(UserRoleRelProps.USER.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str userId() {
        return __getAssociatedId(UserRoleRelProps.USER.unwrap());
    }

    @Override
    public RoleTable role() {
        __beforeJoin();
        if (raw != null) {
            return new RoleTable(raw.joinImplementor(UserRoleRelProps.ROLE.unwrap()));
        }
        return new RoleTable(joinOperation(UserRoleRelProps.ROLE.unwrap()));
    }

    @Override
    public RoleTable role(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleTable(raw.joinImplementor(UserRoleRelProps.ROLE.unwrap(), joinType));
        }
        return new RoleTable(joinOperation(UserRoleRelProps.ROLE.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str roleId() {
        return __getAssociatedId(UserRoleRelProps.ROLE.unwrap());
    }

    @Override
    public UserRoleRelTableEx asTableEx() {
        return new UserRoleRelTableEx(this, null);
    }

    @Override
    public UserRoleRelTable __disableJoin(String reason) {
        return new UserRoleRelTable(this, reason);
    }

    @GeneratedBy(
            type = UserRoleRel.class
    )
    public static class Remote extends AbstractTypedTable<UserRoleRel> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(UserRoleRel.class, delayedOperation);
        }

        public Remote(TableImplementor<UserRoleRel> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(UserRoleRelProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<UserRoleRel> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
