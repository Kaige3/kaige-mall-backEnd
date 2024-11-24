package kaigee.top;

import kaigee.top.box.category.entity.MysteryBoxCategory;
import kaigee.top.box.category.entity.MysteryBoxCategoryDraft;
import kaigee.top.dict.entity.Dict;
import kaigee.top.dict.entity.DictDraft;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuDraft;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleDraft;
import kaigee.top.role.entity.RoleMenuRel;
import kaigee.top.role.entity.RoleMenuRelDraft;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserDraft;
import kaigee.top.user.root.entity.UserRoleRel;
import kaigee.top.user.root.entity.UserRoleRelDraft;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.internal.GeneratedBy;

@GeneratedBy
public interface Objects {
    static MysteryBoxCategory createMysteryBoxCategory(
            DraftConsumer<MysteryBoxCategoryDraft> block) {
        return MysteryBoxCategoryDraft.$.produce(block);
    }

    static MysteryBoxCategory createMysteryBoxCategory(MysteryBoxCategory base,
            DraftConsumer<MysteryBoxCategoryDraft> block) {
        return MysteryBoxCategoryDraft.$.produce(base, block);
    }

    static Dict createDict(DraftConsumer<DictDraft> block) {
        return DictDraft.$.produce(block);
    }

    static Dict createDict(Dict base, DraftConsumer<DictDraft> block) {
        return DictDraft.$.produce(base, block);
    }

    static Menu createMenu(DraftConsumer<MenuDraft> block) {
        return MenuDraft.$.produce(block);
    }

    static Menu createMenu(Menu base, DraftConsumer<MenuDraft> block) {
        return MenuDraft.$.produce(base, block);
    }

    static Role createRole(DraftConsumer<RoleDraft> block) {
        return RoleDraft.$.produce(block);
    }

    static Role createRole(Role base, DraftConsumer<RoleDraft> block) {
        return RoleDraft.$.produce(base, block);
    }

    static RoleMenuRel createRoleMenuRel(DraftConsumer<RoleMenuRelDraft> block) {
        return RoleMenuRelDraft.$.produce(block);
    }

    static RoleMenuRel createRoleMenuRel(RoleMenuRel base, DraftConsumer<RoleMenuRelDraft> block) {
        return RoleMenuRelDraft.$.produce(base, block);
    }

    static User createUser(DraftConsumer<UserDraft> block) {
        return UserDraft.$.produce(block);
    }

    static User createUser(User base, DraftConsumer<UserDraft> block) {
        return UserDraft.$.produce(base, block);
    }

    static UserRoleRel createUserRoleRel(DraftConsumer<UserRoleRelDraft> block) {
        return UserRoleRelDraft.$.produce(block);
    }

    static UserRoleRel createUserRoleRel(UserRoleRel base, DraftConsumer<UserRoleRelDraft> block) {
        return UserRoleRelDraft.$.produce(base, block);
    }
}
