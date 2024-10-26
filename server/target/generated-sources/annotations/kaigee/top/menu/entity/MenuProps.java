package kaigee.top.menu.entity;

import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.infrastructure.jimmer.BaseEntityProps;
import kaigee.top.role.entity.RoleMenuRel;
import kaigee.top.role.entity.RoleMenuRelTableEx;
import kaigee.top.user.root.entity.User;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Menu.class
)
@PropsFor(Menu.class)
public interface MenuProps extends BaseEntityProps {
    TypedProp.Scalar<Menu, String> ID = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("id"));

    TypedProp.Scalar<Menu, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("createdTime"));

    TypedProp.Scalar<Menu, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("editedTime"));

    TypedProp.Reference<Menu, User> EDITOR = 
        TypedProp.reference(ImmutableType.get(Menu.class).getProp("editor"));

    TypedProp.Reference<Menu, User> CREATOR = 
        TypedProp.reference(ImmutableType.get(Menu.class).getProp("creator"));

    TypedProp.Scalar<Menu, String> NAME = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("name"));

    TypedProp.Scalar<Menu, String> PATH = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("path"));

    TypedProp.Scalar<Menu, String> PARENT_ID = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("parentId"));

    TypedProp.Scalar<Menu, Integer> ORDER_NUM = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("orderNum"));

    TypedProp.Scalar<Menu, DictConstants.MenuType> MENU_TYPE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuType"));

    TypedProp.Scalar<Menu, String> ICON = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("icon"));

    TypedProp.ReferenceList<Menu, RoleMenuRel> ROLES = 
        TypedProp.referenceList(ImmutableType.get(Menu.class).getProp("roles"));

    PropExpression.Str name();

    PropExpression.Str path();

    PropExpression.Str parentId();

    PropExpression.Num<Integer> orderNum();

    PropExpression.Cmp<DictConstants.MenuType> menuType();

    PropExpression.Str icon();

    Predicate roles(Function<RoleMenuRelTableEx, Predicate> block);
}
