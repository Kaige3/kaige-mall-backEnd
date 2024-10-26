package kaigee.top.user.root.entity;

import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.infrastructure.jimmer.BaseDateTimeProps;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
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

    TypedProp.Scalar<User, DictConstants.SEX> GENDER = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("gender"));

    TypedProp.Scalar<User, String> PHONE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("phone"));

    TypedProp.Scalar<User, String> PASSWORD = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("password"));

    TypedProp.Scalar<User, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("status"));

    TypedProp.ReferenceList<User, UserRoleRel> ROLES = 
        TypedProp.referenceList(ImmutableType.get(User.class).getProp("roles"));

    TypedProp.ReferenceList<User, Role> ROLES_VIEW = 
        TypedProp.referenceList(ImmutableType.get(User.class).getProp("rolesView"));

    PropExpression.Str id();

    PropExpression.Str nickname();

    PropExpression.Str avatar();

    PropExpression.Cmp<DictConstants.SEX> gender();

    PropExpression.Str phone();

    PropExpression.Str password();

    PropExpression.Str status();

    Predicate roles(Function<UserRoleRelTableEx, Predicate> block);

    Predicate rolesView(Function<RoleTableEx, Predicate> block);
}
