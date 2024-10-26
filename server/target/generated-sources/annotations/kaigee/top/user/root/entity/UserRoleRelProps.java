package kaigee.top.user.root.entity;

import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.infrastructure.jimmer.BaseEntityProps;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = UserRoleRel.class
)
@PropsFor(UserRoleRel.class)
public interface UserRoleRelProps extends BaseEntityProps {
    TypedProp.Scalar<UserRoleRel, String> ID = 
        TypedProp.scalar(ImmutableType.get(UserRoleRel.class).getProp("id"));

    TypedProp.Scalar<UserRoleRel, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(UserRoleRel.class).getProp("createdTime"));

    TypedProp.Scalar<UserRoleRel, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(UserRoleRel.class).getProp("editedTime"));

    TypedProp.Reference<UserRoleRel, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(UserRoleRel.class).getProp("editor"));

    TypedProp.Reference<UserRoleRel, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(UserRoleRel.class).getProp("creator"));

    TypedProp.Reference<UserRoleRel, User> USER = 
        TypedProp.reference(ImmutableType.get(UserRoleRel.class).getProp("user"));

    TypedProp.Reference<UserRoleRel, Role> ROLE = 
        TypedProp.reference(ImmutableType.get(UserRoleRel.class).getProp("role"));

    UserTable user();

    UserTable user(JoinType joinType);

    PropExpression.Str userId();

    RoleTable role();

    RoleTable role(JoinType joinType);

    PropExpression.Str roleId();
}
