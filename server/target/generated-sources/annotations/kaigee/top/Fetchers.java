package kaigee.top;

import kaigee.top.dict.entity.DictFetcher;
import kaigee.top.menu.entity.MenuFetcher;
import kaigee.top.role.entity.RoleFetcher;
import kaigee.top.role.entity.RoleMenuRelFetcher;
import kaigee.top.user.root.entity.UserFetcher;
import kaigee.top.user.root.entity.UserRoleRelFetcher;
import org.babyfish.jimmer.internal.GeneratedBy;

@GeneratedBy
public interface Fetchers {
    DictFetcher DICT_FETCHER = DictFetcher.$;

    MenuFetcher MENU_FETCHER = MenuFetcher.$;

    RoleFetcher ROLE_FETCHER = RoleFetcher.$;

    RoleMenuRelFetcher ROLE_MENU_REL_FETCHER = RoleMenuRelFetcher.$;

    UserFetcher USER_FETCHER = UserFetcher.$;

    UserRoleRelFetcher USER_ROLE_REL_FETCHER = UserRoleRelFetcher.$;
}
