package kaigee.top;

import kaigee.top.box.category.entity.MysteryBoxCategoryTable;
import kaigee.top.dict.entity.DictTable;
import kaigee.top.menu.entity.MenuTable;
import kaigee.top.role.entity.RoleMenuRelTable;
import kaigee.top.role.entity.RoleTable;
import kaigee.top.user.root.entity.UserRoleRelTable;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;

@GeneratedBy
public interface Tables {
    MysteryBoxCategoryTable MYSTERY_BOX_CATEGORY_TABLE = MysteryBoxCategoryTable.$;

    DictTable DICT_TABLE = DictTable.$;

    MenuTable MENU_TABLE = MenuTable.$;

    RoleTable ROLE_TABLE = RoleTable.$;

    RoleMenuRelTable ROLE_MENU_REL_TABLE = RoleMenuRelTable.$;

    UserTable USER_TABLE = UserTable.$;

    UserRoleRelTable USER_ROLE_REL_TABLE = UserRoleRelTable.$;
}
