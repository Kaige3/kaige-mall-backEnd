package kaigee.top.dict.entity;

import java.lang.Boolean;
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
        type = Dict.class
)
public class DictTable extends AbstractTypedTable<Dict> implements DictProps {
    public static final DictTable $ = new DictTable();

    public DictTable() {
        super(Dict.class);
    }

    public DictTable(AbstractTypedTable.DelayedOperation<Dict> delayedOperation) {
        super(Dict.class, delayedOperation);
    }

    public DictTable(TableImplementor<Dict> table) {
        super(table);
    }

    protected DictTable(DictTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(DictProps.ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createdTime() {
        return __get(DictProps.CREATED_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> editedTime() {
        return __get(DictProps.EDITED_TIME.unwrap());
    }

    @Override
    public UserTable editor() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(DictProps.EDITOR.unwrap()));
        }
        return new UserTable(joinOperation(DictProps.EDITOR.unwrap()));
    }

    @Override
    public UserTable editor(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(DictProps.EDITOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(DictProps.EDITOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str editorId() {
        return __getAssociatedId(DictProps.EDITOR.unwrap());
    }

    @Override
    public UserTable creator() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(DictProps.CREATOR.unwrap()));
        }
        return new UserTable(joinOperation(DictProps.CREATOR.unwrap()));
    }

    @Override
    public UserTable creator(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(DictProps.CREATOR.unwrap(), joinType));
        }
        return new UserTable(joinOperation(DictProps.CREATOR.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str creatorId() {
        return __getAssociatedId(DictProps.CREATOR.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> keyId() {
        return __get(DictProps.KEY_ID.unwrap());
    }

    @Override
    public PropExpression.Str keyEnName() {
        return __get(DictProps.KEY_EN_NAME.unwrap());
    }

    @Override
    public PropExpression.Str keyName() {
        return __get(DictProps.KEY_NAME.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> dictId() {
        return __get(DictProps.DICT_ID.unwrap());
    }

    @Override
    public PropExpression.Str dictName() {
        return __get(DictProps.DICT_NAME.unwrap());
    }

    @Override
    public PropExpression.Str dictEnName() {
        return __get(DictProps.DICT_EN_NAME.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> orderNum() {
        return __get(DictProps.ORDER_NUM.unwrap());
    }

    @Override
    public PropExpression<Boolean> visible() {
        return __get(DictProps.VISIBLE.unwrap());
    }

    @Override
    public DictTableEx asTableEx() {
        return new DictTableEx(this, null);
    }

    @Override
    public DictTable __disableJoin(String reason) {
        return new DictTable(this, reason);
    }

    @GeneratedBy(
            type = Dict.class
    )
    public static class Remote extends AbstractTypedTable<Dict> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Dict.class, delayedOperation);
        }

        public Remote(TableImplementor<Dict> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(DictProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Dict> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
