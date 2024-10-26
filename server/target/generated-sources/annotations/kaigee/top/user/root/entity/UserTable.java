package kaigee.top.user.root.entity;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.role.entity.RoleTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = User.class
)
public class UserTable extends AbstractTypedTable<User> implements UserProps {
    public static final UserTable $ = new UserTable();

    public UserTable() {
        super(User.class);
    }

    public UserTable(AbstractTypedTable.DelayedOperation<User> delayedOperation) {
        super(User.class, delayedOperation);
    }

    public UserTable(TableImplementor<User> table) {
        super(table);
    }

    protected UserTable(UserTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(UserProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(UserProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(UserProps.EDITED_TIME.unwrap());
    }

    @Override
    public PropExpression.Str nickname() {
        return __get(UserProps.NICKNAME.unwrap());
    }

    @Override
    public PropExpression.Str avatar() {
        return __get(UserProps.AVATAR.unwrap());
    }

    @Override
    public PropExpression.Cmp<DictConstants.SEX> gender() {
        return __get(UserProps.GENDER.unwrap());
    }

    @Override
    public PropExpression.Str phone() {
        return __get(UserProps.PHONE.unwrap());
    }

    @Override
    public PropExpression.Str password() {
        return __get(UserProps.PASSWORD.unwrap());
    }

    @Override
    public PropExpression.Str status() {
        return __get(UserProps.STATUS.unwrap());
    }

    @Override
    public Predicate roles(Function<UserRoleRelTableEx, Predicate> block) {
        return exists(UserProps.ROLES.unwrap(), block);
    }

    @Override
    public Predicate rolesView(Function<RoleTableEx, Predicate> block) {
        return exists(UserProps.ROLES_VIEW.unwrap(), block);
    }

    @Override
    public UserTableEx asTableEx() {
        return new UserTableEx(this, null);
    }

    @Override
    public UserTable __disableJoin(String reason) {
        return new UserTable(this, reason);
    }

    @GeneratedBy(
            type = User.class
    )
    public static class Remote extends AbstractTypedTable<User> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(User.class, delayedOperation);
        }

        public Remote(TableImplementor<User> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(UserProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<User> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
