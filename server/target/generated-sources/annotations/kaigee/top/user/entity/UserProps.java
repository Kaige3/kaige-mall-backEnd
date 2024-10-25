package kaigee.top.user.entity;

import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.infrastructure.jimmer.BaseDateTimeProps;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = User.class
)
@PropsFor(User.class)
public interface UserProps extends BaseDateTimeProps {
    TypedProp.Scalar<User, String> ID = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("id"));

    TypedProp.Scalar<User, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("createdTime"));

    TypedProp.Scalar<User, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("editedTime"));

    TypedProp.Scalar<User, String> NICKNAME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("nickname"));

    TypedProp.Scalar<User, String> AVATAR = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("avatar"));

    TypedProp.Scalar<User, String> GENDER = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("gender"));

    TypedProp.Scalar<User, String> PHONE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("phone"));

    TypedProp.Scalar<User, String> PASSWORD = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("password"));

    PropExpression.Str id();

    PropExpression.Str nickname();

    PropExpression.Str avatar();

    PropExpression.Str gender();

    PropExpression.Str phone();

    PropExpression.Str password();
}
