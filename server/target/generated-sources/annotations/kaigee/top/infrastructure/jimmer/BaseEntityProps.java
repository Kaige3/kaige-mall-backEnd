package kaigee.top.infrastructure.jimmer;

import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.user.entity.User;
import kaigee.top.user.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = BaseEntity.class
)
@PropsFor(BaseEntity.class)
public interface BaseEntityProps extends BaseDateTimeProps {
    TypedProp.Scalar<BaseEntity, String> ID = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("id"));

    TypedProp.Scalar<BaseEntity, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("createdTime"));

    TypedProp.Scalar<BaseEntity, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("editedTime"));

    TypedProp.Reference<BaseEntity, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(BaseEntity.class).getProp("editor"));

    TypedProp.Reference<BaseEntity, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(BaseEntity.class).getProp("creator"));

    PropExpression.Str id();

    UserTable editor();

    UserTable editor(JoinType joinType);

    PropExpression.Str editorId();

    UserTable creator();

    UserTable creator(JoinType joinType);

    PropExpression.Str creatorId();
}
