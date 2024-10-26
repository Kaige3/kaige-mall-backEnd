package kaigee.top.role.entity;

import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import kaigee.top.infrastructure.jimmer.BaseEntityProps;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuTableEx;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserRoleRel;
import kaigee.top.user.root.entity.UserRoleRelTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Role.class
)
@PropsFor(Role.class)
public interface RoleProps extends BaseEntityProps {
    TypedProp.Scalar<Role, String> ID = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("id"));

    TypedProp.Scalar<Role, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("createdTime"));

    TypedProp.Scalar<Role, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("editedTime"));

    TypedProp.Reference<Role, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(Role.class).getProp("editor"));

    TypedProp.Reference<Role, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(Role.class).getProp("creator"));

    TypedProp.Scalar<Role, String> NAME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("name"));

    TypedProp.ReferenceList<Role, UserRoleRel> USERS = 
        TypedProp.referenceList(ImmutableType.get(Role.class).getProp("users"));

    TypedProp.ReferenceList<Role, RoleMenuRel> MENUS = 
        TypedProp.referenceList(ImmutableType.get(Role.class).getProp("menus"));

    TypedProp.ReferenceList<Role, Menu> MENUS_VIEW = 
        TypedProp.referenceList(ImmutableType.get(Role.class).getProp("menusView"));

    PropExpression.Str name();

    Predicate users(Function<UserRoleRelTableEx, Predicate> block);

    Predicate menus(Function<RoleMenuRelTableEx, Predicate> block);

    Predicate menusView(Function<MenuTableEx, Predicate> block);
}
