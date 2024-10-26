package kaigee.top.dict.entity;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.infrastructure.jimmer.BaseEntityProps;
import kaigee.top.user.root.entity.User;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Dict.class
)
@PropsFor(Dict.class)
public interface DictProps extends BaseEntityProps {
    TypedProp.Scalar<Dict, String> ID = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("id"));

    TypedProp.Scalar<Dict, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("createdTime"));

    TypedProp.Scalar<Dict, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("editedTime"));

    TypedProp.Reference<Dict, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(Dict.class).getProp("editor"));

    TypedProp.Reference<Dict, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(Dict.class).getProp("creator"));

    TypedProp.Scalar<Dict, Integer> KEY_ID = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("keyId"));

    TypedProp.Scalar<Dict, String> KEY_EN_NAME = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("keyEnName"));

    TypedProp.Scalar<Dict, String> KEY_NAME = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("keyName"));

    TypedProp.Scalar<Dict, Integer> DICT_ID = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("dictId"));

    TypedProp.Scalar<Dict, String> DICT_NAME = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("dictName"));

    TypedProp.Scalar<Dict, String> DICT_EN_NAME = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("dictEnName"));

    TypedProp.Scalar<Dict, Integer> ORDER_NUM = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("orderNum"));

    TypedProp.Scalar<Dict, Boolean> VISIBLE = 
        TypedProp.scalar(ImmutableType.get(Dict.class).getProp("visible"));

    PropExpression.Num<Integer> keyId();

    PropExpression.Str keyEnName();

    PropExpression.Str keyName();

    PropExpression.Num<Integer> dictId();

    PropExpression.Str dictName();

    PropExpression.Str dictEnName();

    PropExpression.Num<Integer> orderNum();

    PropExpression<Boolean> visible();
}
