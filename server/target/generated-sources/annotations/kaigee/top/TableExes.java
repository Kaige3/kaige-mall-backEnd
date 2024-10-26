package kaigee.top;

import kaigee.top.dict.entity.DictTableEx;
import kaigee.top.menu.entity.MenuTableEx;
import kaigee.top.role.entity.RoleMenuRelTableEx;
import kaigee.top.role.entity.RoleTableEx;
import kaigee.top.user.root.entity.UserRoleRelTableEx;
import kaigee.top.user.root.entity.UserTableEx;
import org.babyfish.jimmer.internal.GeneratedBy;

@GeneratedBy
public interface TableExes {
    DictTableEx DICT_TABLE_EX = DictTableEx.$;

    MenuTableEx MENU_TABLE_EX = MenuTableEx.$;

    RoleTableEx ROLE_TABLE_EX = RoleTableEx.$;

    RoleMenuRelTableEx ROLE_MENU_REL_TABLE_EX = RoleMenuRelTableEx.$;

    UserTableEx USER_TABLE_EX = UserTableEx.$;

    UserRoleRelTableEx USER_ROLE_REL_TABLE_EX = UserRoleRelTableEx.$;
}
