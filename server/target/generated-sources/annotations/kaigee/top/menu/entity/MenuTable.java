package kaigee.top.menu.entity;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.role.entity.RoleMenuRelTableEx;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Menu.class
)
public class MenuTable extends AbstractTypedTable<Menu> implements MenuProps {
    public static final MenuTable $ = new MenuTable();

    public MenuTable() {
        super(Menu.class);
    }

    public MenuTable(AbstractTypedTable.DelayedOperation<Menu> delayedOperation) {
        super(Menu.class, delayedOperation);
    }

    public MenuTable(TableImplementor<Menu> table) {
        super(table);
    }

    protected MenuTable(MenuTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(MenuProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(MenuProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(MenuProps.EDITED_TIME.unwrap());
    }

    @Override
    public UserTable editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MenuProps.EDITOR.unwrap()));
        }
        return new UserTable(joinOperation(MenuProps.EDITOR.unwrap()));
    }

    @Override
    public UserTable editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MenuProps.EDITOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(MenuProps.EDITOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str editorId() {
        return __getAssociatedId(MenuProps.EDITOR.unwrap());
    }

    @Override
    public UserTable creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MenuProps.CREATOR.unwrap()));
        }
        return new UserTable(joinOperation(MenuProps.CREATOR.unwrap()));
    }

    @Override
    public UserTable creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MenuProps.CREATOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(MenuProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str creatorId() {
        return __getAssociatedId(MenuProps.CREATOR.unwrap());
    }

    @Override
    public PropExpression.Str name() {
        return __get(MenuProps.NAME.unwrap());
    }

    @Override
    public PropExpression.Str path() {
        return __get(MenuProps.PATH.unwrap());
    }

    @Override
    public PropExpression.Str parentId() {
        return __get(MenuProps.PARENT_ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> orderNum() {
        return __get(MenuProps.ORDER_NUM.unwrap());
    }

    @Override
    public PropExpression.Cmp<DictConstants.MenuType> menuType() {
        return __get(MenuProps.MENU_TYPE.unwrap());
    }

    @Override
    public PropExpression.Str icon() {
        return __get(MenuProps.ICON.unwrap());
    }

    @Override
    public Predicate roles(Function<RoleMenuRelTableEx, Predicate> block) {
        return exists(MenuProps.ROLES.unwrap(), block);
    }

    @Override
    public MenuTableEx asTableEx() {
        return new MenuTableEx(this, null);
    }

    @Override
    public MenuTable __disableJoin(String reason) {
        return new MenuTable(this, reason);
    }

    @GeneratedBy(
            type = Menu.class
    )
    public static class Remote extends AbstractTypedTable<Menu> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Menu.class, delayedOperation);
        }

        public Remote(TableImplementor<Menu> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(MenuProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Menu> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
