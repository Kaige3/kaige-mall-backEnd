package kaigee.top.box.category.entity;

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
        type = MysteryBoxCategory.class
)
@PropsFor(MysteryBoxCategory.class)
public interface MysteryBoxCategoryProps extends BaseEntityProps {
    TypedProp.Scalar<MysteryBoxCategory, String> ID = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("id"));

    TypedProp.Scalar<MysteryBoxCategory, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("createdTime"));

    TypedProp.Scalar<MysteryBoxCategory, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("editedTime"));

    TypedProp.Reference<MysteryBoxCategory, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(MysteryBoxCategory.class).getProp("editor"));

    TypedProp.Reference<MysteryBoxCategory, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(MysteryBoxCategory.class).getProp("creator"));

    TypedProp.Scalar<MysteryBoxCategory, String> NAME = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("name"));

    TypedProp.Scalar<MysteryBoxCategory, String> ICON = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("icon"));

    TypedProp.Scalar<MysteryBoxCategory, String> DESCRIPTION = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("description"));

    TypedProp.Scalar<MysteryBoxCategory, Integer> SORT_ORDER = 
        TypedProp.scalar(ImmutableType.get(MysteryBoxCategory.class).getProp("sortOrder"));

    PropExpression.Str name();

    PropExpression.Str icon();

    PropExpression.Str description();

    PropExpression.Num<Integer> sortOrder();
}
