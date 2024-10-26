package kaigee.top.role.entity;

import java.lang.String;
import java.time.LocalDateTime;
import kaigee.top.infrastructure.jimmer.BaseEntityProps;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuTable;
import kaigee.top.user.root.entity.User;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = RoleMenuRel.class
)
@PropsFor(RoleMenuRel.class)
public interface RoleMenuRelProps extends BaseEntityProps {
    TypedProp.Scalar<RoleMenuRel, String> ID = 
        TypedProp.scalar(ImmutableType.get(RoleMenuRel.class).getProp("id"));

    TypedProp.Scalar<RoleMenuRel, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(RoleMenuRel.class).getProp("createdTime"));

    TypedProp.Scalar<RoleMenuRel, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(RoleMenuRel.class).getProp("editedTime"));

    TypedProp.Reference<RoleMenuRel, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(RoleMenuRel.class).getProp("editor"));

    TypedProp.Reference<RoleMenuRel, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(RoleMenuRel.class).getProp("creator"));

    TypedProp.Reference<RoleMenuRel, Role> ROLE = 
        TypedProp.reference(ImmutableType.get(RoleMenuRel.class).getProp("role"));

    TypedProp.Reference<RoleMenuRel, Menu> MENU = 
        TypedProp.reference(ImmutableType.get(RoleMenuRel.class).getProp("menu"));

    RoleTable role();

    RoleTable role(JoinType joinType);

    PropExpression.Str roleId();

    MenuTable menu();

    MenuTable menu(JoinType joinType);

    PropExpression.Str menuId();
}
