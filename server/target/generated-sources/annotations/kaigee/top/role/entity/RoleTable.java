package kaigee.top.role.entity;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import kaigee.top.menu.entity.MenuTableEx;
import kaigee.top.user.root.entity.UserRoleRelTableEx;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Role.class
)
public class RoleTable extends AbstractTypedTable<Role> implements RoleProps {
    public static final RoleTable $ = new RoleTable();

    public RoleTable() {
        super(Role.class);
    }

    public RoleTable(AbstractTypedTable.DelayedOperation<Role> delayedOperation) {
        super(Role.class, delayedOperation);
    }

    public RoleTable(TableImplementor<Role> table) {
        super(table);
    }

    protected RoleTable(RoleTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(RoleProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(RoleProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(RoleProps.EDITED_TIME.unwrap());
    }

    @Override
    public UserTable editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleProps.EDITOR.unwrap()));
        }
        return new UserTable(joinOperation(RoleProps.EDITOR.unwrap()));
    }

    @Override
    public UserTable editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleProps.EDITOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(RoleProps.EDITOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str editorId() {
        return __getAssociatedId(RoleProps.EDITOR.unwrap());
    }

    @Override
    public UserTable creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleProps.CREATOR.unwrap()));
        }
        return new UserTable(joinOperation(RoleProps.CREATOR.unwrap()));
    }

    @Override
    public UserTable creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleProps.CREATOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(RoleProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str creatorId() {
        return __getAssociatedId(RoleProps.CREATOR.unwrap());
    }

    @Override
    public PropExpression.Str name() {
        return __get(RoleProps.NAME.unwrap());
    }

    @Override
    public Predicate users(Function<UserRoleRelTableEx, Predicate> block) {
        return exists(RoleProps.USERS.unwrap(), block);
    }

    @Override
    public Predicate menus(Function<RoleMenuRelTableEx, Predicate> block) {
        return exists(RoleProps.MENUS.unwrap(), block);
    }

    @Override
    public Predicate menusView(Function<MenuTableEx, Predicate> block) {
        return exists(RoleProps.MENUS_VIEW.unwrap(), block);
    }

    @Override
    public RoleTableEx asTableEx() {
        return new RoleTableEx(this, null);
    }

    @Override
    public RoleTable __disableJoin(String reason) {
        return new RoleTable(this, reason);
    }

    @GeneratedBy(
            type = Role.class
    )
    public static class Remote extends AbstractTypedTable<Role> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Role.class, delayedOperation);
        }

        public Remote(TableImplementor<Role> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(RoleProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Role> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
