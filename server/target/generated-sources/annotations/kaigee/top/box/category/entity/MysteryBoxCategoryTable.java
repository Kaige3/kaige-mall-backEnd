package kaigee.top.box.category.entity;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = MysteryBoxCategory.class
)
public class MysteryBoxCategoryTable extends AbstractTypedTable<MysteryBoxCategory> implements MysteryBoxCategoryProps {
    public static final MysteryBoxCategoryTable $ = new MysteryBoxCategoryTable();

    public MysteryBoxCategoryTable() {
        super(MysteryBoxCategory.class);
    }

    public MysteryBoxCategoryTable(
            AbstractTypedTable.DelayedOperation<MysteryBoxCategory> delayedOperation) {
        super(MysteryBoxCategory.class, delayedOperation);
    }

    public MysteryBoxCategoryTable(TableImplementor<MysteryBoxCategory> table) {
        super(table);
    }

    protected MysteryBoxCategoryTable(MysteryBoxCategoryTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(MysteryBoxCategoryProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(MysteryBoxCategoryProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(MysteryBoxCategoryProps.EDITED_TIME.unwrap());
    }

    @Override
    public UserTable editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MysteryBoxCategoryProps.EDITOR.unwrap()));
        }
        return new UserTable(joinOperation(MysteryBoxCategoryProps.EDITOR.unwrap()));
    }

    @Override
    public UserTable editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MysteryBoxCategoryProps.EDITOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(MysteryBoxCategoryProps.EDITOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str editorId() {
        return __getAssociatedId(MysteryBoxCategoryProps.EDITOR.unwrap());
    }

    @Override
    public UserTable creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MysteryBoxCategoryProps.CREATOR.unwrap()));
        }
        return new UserTable(joinOperation(MysteryBoxCategoryProps.CREATOR.unwrap()));
    }

    @Override
    public UserTable creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MysteryBoxCategoryProps.CREATOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(MysteryBoxCategoryProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str creatorId() {
        return __getAssociatedId(MysteryBoxCategoryProps.CREATOR.unwrap());
    }

    @Override
    public PropExpression.Str name() {
        return __get(MysteryBoxCategoryProps.NAME.unwrap());
    }

    @Override
    public PropExpression.Str icon() {
        return __get(MysteryBoxCategoryProps.ICON.unwrap());
    }

    @Override
    public PropExpression.Str description() {
        return __get(MysteryBoxCategoryProps.DESCRIPTION.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> sortOrder() {
        return __get(MysteryBoxCategoryProps.SORT_ORDER.unwrap());
    }

    @Override
    public MysteryBoxCategoryTableEx asTableEx() {
        return new MysteryBoxCategoryTableEx(this, null);
    }

    @Override
    public MysteryBoxCategoryTable __disableJoin(String reason) {
        return new MysteryBoxCategoryTable(this, reason);
    }

    @GeneratedBy(
            type = MysteryBoxCategory.class
    )
    public static class Remote extends AbstractTypedTable<MysteryBoxCategory> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(MysteryBoxCategory.class, delayedOperation);
        }

        public Remote(TableImplementor<MysteryBoxCategory> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(MysteryBoxCategoryProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<MysteryBoxCategory> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
