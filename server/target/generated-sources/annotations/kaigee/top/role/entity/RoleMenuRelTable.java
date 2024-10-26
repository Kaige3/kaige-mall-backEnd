package kaigee.top.role.entity;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.menu.entity.MenuTable;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = RoleMenuRel.class
)
public class RoleMenuRelTable extends AbstractTypedTable<RoleMenuRel> implements RoleMenuRelProps {
    public static final RoleMenuRelTable $ = new RoleMenuRelTable();

    public RoleMenuRelTable() {
        super(RoleMenuRel.class);
    }

    public RoleMenuRelTable(AbstractTypedTable.DelayedOperation<RoleMenuRel> delayedOperation) {
        super(RoleMenuRel.class, delayedOperation);
    }

    public RoleMenuRelTable(TableImplementor<RoleMenuRel> table) {
        super(table);
    }

    protected RoleMenuRelTable(RoleMenuRelTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(RoleMenuRelProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(RoleMenuRelProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(RoleMenuRelProps.EDITED_TIME.unwrap());
    }

    @Override
    public UserTable editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleMenuRelProps.EDITOR.unwrap()));
        }
        return new UserTable(joinOperation(RoleMenuRelProps.EDITOR.unwrap()));
    }

    @Override
    public UserTable editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleMenuRelProps.EDITOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(RoleMenuRelProps.EDITOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str editorId() {
        return __getAssociatedId(RoleMenuRelProps.EDITOR.unwrap());
    }

    @Override
    public UserTable creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleMenuRelProps.CREATOR.unwrap()));
        }
        return new UserTable(joinOperation(RoleMenuRelProps.CREATOR.unwrap()));
    }

    @Override
    public UserTable creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(RoleMenuRelProps.CREATOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(RoleMenuRelProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str creatorId() {
        return __getAssociatedId(RoleMenuRelProps.CREATOR.unwrap());
    }

    @Override
    public RoleTable role() {
        __beforeJoin();
        if (raw != null) {
            return new RoleTable(raw.joinImplementor(RoleMenuRelProps.ROLE.unwrap()));
        }
        return new RoleTable(joinOperation(RoleMenuRelProps.ROLE.unwrap()));
    }

    @Override
    public RoleTable role(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleTable(raw.joinImplementor(RoleMenuRelProps.ROLE.unwrap(), joinType));
        }
        return new RoleTable(joinOperation(RoleMenuRelProps.ROLE.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str roleId() {
        return __getAssociatedId(RoleMenuRelProps.ROLE.unwrap());
    }

    @Override
    public MenuTable menu() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTable(raw.joinImplementor(RoleMenuRelProps.MENU.unwrap()));
        }
        return new MenuTable(joinOperation(RoleMenuRelProps.MENU.unwrap()));
    }

    @Override
    public MenuTable menu(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTable(raw.joinImplementor(RoleMenuRelProps.MENU.unwrap(), joinType));
        }
        return new MenuTable(joinOperation(RoleMenuRelProps.MENU.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str menuId() {
        return __getAssociatedId(RoleMenuRelProps.MENU.unwrap());
    }

    @Override
    public RoleMenuRelTableEx asTableEx() {
        return new RoleMenuRelTableEx(this, null);
    }

    @Override
    public RoleMenuRelTable __disableJoin(String reason) {
        return new RoleMenuRelTable(this, reason);
    }

    @GeneratedBy(
            type = RoleMenuRel.class
    )
    public static class Remote extends AbstractTypedTable<RoleMenuRel> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(RoleMenuRel.class, delayedOperation);
        }

        public Remote(TableImplementor<RoleMenuRel> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(RoleMenuRelProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<RoleMenuRel> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
