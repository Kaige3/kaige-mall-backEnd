package kaigee.top.menu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import jakarta.validation.constraints.Null;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.infrastructure.jimmer.BaseEntityDraft;
import kaigee.top.role.entity.RoleMenuRel;
import kaigee.top.role.entity.RoleMenuRelDraft;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserDraft;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.OneToMany;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        type = Menu.class
)
public interface MenuDraft extends Menu, BaseEntityDraft {
    MenuDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    MenuDraft setId(String id);

    @OldChain
    MenuDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    MenuDraft setEditedTime(LocalDateTime editedTime);

    UserDraft editor();

    UserDraft editor(boolean autoCreate);

    @OldChain
    MenuDraft setEditor(User editor);

    @NotNull
    String editorId();

    @OldChain
    MenuDraft setEditorId(@NotNull String editorId);

    @OldChain
    MenuDraft applyEditor(DraftConsumer<UserDraft> block);

    @OldChain
    MenuDraft applyEditor(User base, DraftConsumer<UserDraft> block);

    UserDraft creator();

    UserDraft creator(boolean autoCreate);

    @OldChain
    MenuDraft setCreator(User creator);

    @NotNull
    String creatorId();

    @OldChain
    MenuDraft setCreatorId(@NotNull String creatorId);

    @OldChain
    MenuDraft applyCreator(DraftConsumer<UserDraft> block);

    @OldChain
    MenuDraft applyCreator(User base, DraftConsumer<UserDraft> block);

    @OldChain
    MenuDraft setName(String name);

    @OldChain
    MenuDraft setPath(String path);

    @OldChain
    MenuDraft setParentId(String parentId);

    @OldChain
    MenuDraft setOrderNum(Integer orderNum);

    @OldChain
    MenuDraft setMenuType(DictConstants.MenuType menuType);

    @OldChain
    MenuDraft setIcon(String icon);

    List<RoleMenuRelDraft> roles(boolean autoCreate);

    @OldChain
    MenuDraft setRoles(List<RoleMenuRel> roles);

    @OldChain
    MenuDraft addIntoRoles(DraftConsumer<RoleMenuRelDraft> block);

    @OldChain
    MenuDraft addIntoRoles(RoleMenuRel base, DraftConsumer<RoleMenuRelDraft> block);

    @GeneratedBy(
            type = Menu.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_CREATED_TIME = 1;

        public static final int SLOT_EDITED_TIME = 2;

        public static final int SLOT_EDITOR = 3;

        public static final int SLOT_CREATOR = 4;

        public static final int SLOT_NAME = 5;

        public static final int SLOT_PATH = 6;

        public static final int SLOT_PARENT_ID = 7;

        public static final int SLOT_ORDER_NUM = 8;

        public static final int SLOT_MENU_TYPE = 9;

        public static final int SLOT_ICON = 10;

        public static final int SLOT_ROLES = 11;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                Menu.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Menu)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("createdTime", SLOT_CREATED_TIME)
            .redefine("editedTime", SLOT_EDITED_TIME)
            .redefine("editor", SLOT_EDITOR)
            .redefine("creator", SLOT_CREATOR)
            .add(SLOT_NAME, "name", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_PATH, "path", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_PARENT_ID, "parentId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_ORDER_NUM, "orderNum", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(SLOT_MENU_TYPE, "menuType", ImmutablePropCategory.SCALAR, DictConstants.MenuType.class, false)
            .add(SLOT_ICON, "icon", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_ROLES, "roles", OneToMany.class, RoleMenuRel.class, false)
            .build();

        private Producer() {
        }

        public Menu produce(DraftConsumer<MenuDraft> block) {
            return produce(null, block);
        }

        public Menu produce(Menu base, DraftConsumer<MenuDraft> block) {
            return (Menu)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = Menu.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "createdTime", "editedTime", "editor", "creator", "name", "path", "parentId", "orderNum", "menuType", "icon", "roles"})
        public abstract static class Implementor implements Menu, ImmutableSpi {
            @Override
            public final Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_CREATED_TIME:
                    		return createdTime();
                    case SLOT_EDITED_TIME:
                    		return editedTime();
                    case SLOT_EDITOR:
                    		return editor();
                    case SLOT_CREATOR:
                    		return creator();
                    case SLOT_NAME:
                    		return name();
                    case SLOT_PATH:
                    		return path();
                    case SLOT_PARENT_ID:
                    		return parentId();
                    case SLOT_ORDER_NUM:
                    		return orderNum();
                    case SLOT_MENU_TYPE:
                    		return menuType();
                    case SLOT_ICON:
                    		return icon();
                    case SLOT_ROLES:
                    		return roles();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "createdTime":
                    		return createdTime();
                    case "editedTime":
                    		return editedTime();
                    case "editor":
                    		return editor();
                    case "creator":
                    		return creator();
                    case "name":
                    		return name();
                    case "path":
                    		return path();
                    case "parentId":
                    		return parentId();
                    case "orderNum":
                    		return orderNum();
                    case "menuType":
                    		return menuType();
                    case "icon":
                    		return icon();
                    case "roles":
                    		return roles();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\"");
                }
            }

            public final String getId() {
                return id();
            }

            public final LocalDateTime getCreatedTime() {
                return createdTime();
            }

            public final LocalDateTime getEditedTime() {
                return editedTime();
            }

            public final User getEditor() {
                return editor();
            }

            public final User getCreator() {
                return creator();
            }

            @GenField(
                    value = "菜单名称",
                    order = 0
            )
            public final String getName() {
                return name();
            }

            @GenField(
                    value = "菜单路径",
                    order = 2
            )
            public final String getPath() {
                return path();
            }

            @Null
            @GenField(
                    value = "父级菜单",
                    order = 1
            )
            public final String getParentId() {
                return parentId();
            }

            @GenField(
                    value = "排序",
                    order = 3
            )
            public final Integer getOrderNum() {
                return orderNum();
            }

            @GenField(
                    value = "菜单类型",
                    order = 4,
                    type = ItemType.SELECTABLE,
                    dictEnName = "MENU_TYPE"
            )
            public final DictConstants.MenuType getMenuType() {
                return menuType();
            }

            @Null
            @GenField(
                    value = "图标",
                    order = 5,
                    type = ItemType.PICTURE
            )
            public final String getIcon() {
                return icon();
            }

            public final List<RoleMenuRel> getRoles() {
                return roles();
            }

            @Override
            public final ImmutableType __type() {
                return TYPE;
            }

            public final int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = Menu.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            LocalDateTime __createdTimeValue;

            LocalDateTime __editedTimeValue;

            User __editorValue;

            User __creatorValue;

            String __nameValue;

            String __pathValue;

            String __parentIdValue;

            boolean __parentIdLoaded = false;

            Integer __orderNumValue;

            boolean __orderNumLoaded = false;

            DictConstants.MenuType __menuTypeValue;

            String __iconValue;

            boolean __iconLoaded = false;

            NonSharedList<RoleMenuRel> __rolesValue;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Menu.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                if (__createdTimeValue == null) {
                    throw new UnloadedException(Menu.class, "createdTime");
                }
                return __createdTimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                if (__editedTimeValue == null) {
                    throw new UnloadedException(Menu.class, "editedTime");
                }
                return __editedTimeValue;
            }

            @Override
            @JsonIgnore
            public User editor() {
                if (__editorValue == null) {
                    throw new UnloadedException(Menu.class, "editor");
                }
                return __editorValue;
            }

            @Override
            @JsonIgnore
            public User creator() {
                if (__creatorValue == null) {
                    throw new UnloadedException(Menu.class, "creator");
                }
                return __creatorValue;
            }

            @Override
            @JsonIgnore
            public String name() {
                if (__nameValue == null) {
                    throw new UnloadedException(Menu.class, "name");
                }
                return __nameValue;
            }

            @Override
            @JsonIgnore
            public String path() {
                if (__pathValue == null) {
                    throw new UnloadedException(Menu.class, "path");
                }
                return __pathValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                if (!__parentIdLoaded) {
                    throw new UnloadedException(Menu.class, "parentId");
                }
                return __parentIdValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer orderNum() {
                if (!__orderNumLoaded) {
                    throw new UnloadedException(Menu.class, "orderNum");
                }
                return __orderNumValue;
            }

            @Override
            @JsonIgnore
            public DictConstants.MenuType menuType() {
                if (__menuTypeValue == null) {
                    throw new UnloadedException(Menu.class, "menuType");
                }
                return __menuTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String icon() {
                if (!__iconLoaded) {
                    throw new UnloadedException(Menu.class, "icon");
                }
                return __iconValue;
            }

            @Override
            @JsonIgnore
            public List<RoleMenuRel> roles() {
                if (__rolesValue == null) {
                    throw new UnloadedException(Menu.class, "roles");
                }
                return __rolesValue;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_ID:
                    		return __idValue != null;
                    case SLOT_CREATED_TIME:
                    		return __createdTimeValue != null;
                    case SLOT_EDITED_TIME:
                    		return __editedTimeValue != null;
                    case SLOT_EDITOR:
                    		return __editorValue != null;
                    case SLOT_CREATOR:
                    		return __creatorValue != null;
                    case SLOT_NAME:
                    		return __nameValue != null;
                    case SLOT_PATH:
                    		return __pathValue != null;
                    case SLOT_PARENT_ID:
                    		return __parentIdLoaded;
                    case SLOT_ORDER_NUM:
                    		return __orderNumLoaded;
                    case SLOT_MENU_TYPE:
                    		return __menuTypeValue != null;
                    case SLOT_ICON:
                    		return __iconLoaded;
                    case SLOT_ROLES:
                    		return __rolesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "createdTime":
                    		return __createdTimeValue != null;
                    case "editedTime":
                    		return __editedTimeValue != null;
                    case "editor":
                    		return __editorValue != null;
                    case "creator":
                    		return __creatorValue != null;
                    case "name":
                    		return __nameValue != null;
                    case "path":
                    		return __pathValue != null;
                    case "parentId":
                    		return __parentIdLoaded;
                    case "orderNum":
                    		return __orderNumLoaded;
                    case "menuType":
                    		return __menuTypeValue != null;
                    case "icon":
                    		return __iconLoaded;
                    case "roles":
                    		return __rolesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
                    case SLOT_CREATED_TIME:
                    		return __visibility.visible(SLOT_CREATED_TIME);
                    case SLOT_EDITED_TIME:
                    		return __visibility.visible(SLOT_EDITED_TIME);
                    case SLOT_EDITOR:
                    		return __visibility.visible(SLOT_EDITOR);
                    case SLOT_CREATOR:
                    		return __visibility.visible(SLOT_CREATOR);
                    case SLOT_NAME:
                    		return __visibility.visible(SLOT_NAME);
                    case SLOT_PATH:
                    		return __visibility.visible(SLOT_PATH);
                    case SLOT_PARENT_ID:
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case SLOT_ORDER_NUM:
                    		return __visibility.visible(SLOT_ORDER_NUM);
                    case SLOT_MENU_TYPE:
                    		return __visibility.visible(SLOT_MENU_TYPE);
                    case SLOT_ICON:
                    		return __visibility.visible(SLOT_ICON);
                    case SLOT_ROLES:
                    		return __visibility.visible(SLOT_ROLES);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "id":
                    		return __visibility.visible(SLOT_ID);
                    case "createdTime":
                    		return __visibility.visible(SLOT_CREATED_TIME);
                    case "editedTime":
                    		return __visibility.visible(SLOT_EDITED_TIME);
                    case "editor":
                    		return __visibility.visible(SLOT_EDITOR);
                    case "creator":
                    		return __visibility.visible(SLOT_CREATOR);
                    case "name":
                    		return __visibility.visible(SLOT_NAME);
                    case "path":
                    		return __visibility.visible(SLOT_PATH);
                    case "parentId":
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case "orderNum":
                    		return __visibility.visible(SLOT_ORDER_NUM);
                    case "menuType":
                    		return __visibility.visible(SLOT_MENU_TYPE);
                    case "icon":
                    		return __visibility.visible(SLOT_ICON);
                    case "roles":
                    		return __visibility.visible(SLOT_ROLES);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + __idValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__createdTimeValue != null) {
                    hash = 31 * hash + __createdTimeValue.hashCode();
                }
                if (__editedTimeValue != null) {
                    hash = 31 * hash + __editedTimeValue.hashCode();
                }
                if (__editorValue != null) {
                    hash = 31 * hash + __editorValue.hashCode();
                }
                if (__creatorValue != null) {
                    hash = 31 * hash + __creatorValue.hashCode();
                }
                if (__nameValue != null) {
                    hash = 31 * hash + __nameValue.hashCode();
                }
                if (__pathValue != null) {
                    hash = 31 * hash + __pathValue.hashCode();
                }
                if (__parentIdLoaded && __parentIdValue != null) {
                    hash = 31 * hash + __parentIdValue.hashCode();
                }
                if (__orderNumLoaded && __orderNumValue != null) {
                    hash = 31 * hash + __orderNumValue.hashCode();
                }
                if (__menuTypeValue != null) {
                    hash = 31 * hash + __menuTypeValue.hashCode();
                }
                if (__iconLoaded && __iconValue != null) {
                    hash = 31 * hash + __iconValue.hashCode();
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + __rolesValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__createdTimeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createdTimeValue);
                }
                if (__editedTimeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__editedTimeValue);
                }
                if (__editorValue != null) {
                    hash = 31 * hash + System.identityHashCode(__editorValue);
                }
                if (__creatorValue != null) {
                    hash = 31 * hash + System.identityHashCode(__creatorValue);
                }
                if (__nameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__nameValue);
                }
                if (__pathValue != null) {
                    hash = 31 * hash + System.identityHashCode(__pathValue);
                }
                if (__parentIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(__parentIdValue);
                }
                if (__orderNumLoaded) {
                    hash = 31 * hash + System.identityHashCode(__orderNumValue);
                }
                if (__menuTypeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__menuTypeValue);
                }
                if (__iconLoaded) {
                    hash = 31 * hash + System.identityHashCode(__iconValue);
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__rolesValue);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__idValue, __other.id());
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                boolean __createdTimeLoaded = __createdTimeValue != null;
                if (__createdTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                if (__createdTimeLoaded && !Objects.equals(__createdTimeValue, __other.createdTime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                boolean __editedTimeLoaded = __editedTimeValue != null;
                if (__editedTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                if (__editedTimeLoaded && !Objects.equals(__editedTimeValue, __other.editedTime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITOR)) != __other.__isVisible(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                boolean __editorLoaded = __editorValue != null;
                if (__editorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                if (__editorLoaded && !Objects.equals(__editorValue, __other.editor())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATOR)) != __other.__isVisible(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                boolean __creatorLoaded = __creatorValue != null;
                if (__creatorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                if (__creatorLoaded && !Objects.equals(__creatorValue, __other.creator())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                boolean __nameLoaded = __nameValue != null;
                if (__nameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                if (__nameLoaded && !Objects.equals(__nameValue, __other.name())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PATH)) != __other.__isVisible(PropId.byIndex(SLOT_PATH))) {
                    return false;
                }
                boolean __pathLoaded = __pathValue != null;
                if (__pathLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PATH))) {
                    return false;
                }
                if (__pathLoaded && !Objects.equals(__pathValue, __other.path())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                boolean __parentIdLoaded = this.__parentIdLoaded;
                if (__parentIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__parentIdLoaded && !Objects.equals(__parentIdValue, __other.parentId())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ORDER_NUM)) != __other.__isVisible(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                boolean __orderNumLoaded = this.__orderNumLoaded;
                if (__orderNumLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                if (__orderNumLoaded && !Objects.equals(__orderNumValue, __other.orderNum())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                boolean __menuTypeLoaded = __menuTypeValue != null;
                if (__menuTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                if (__menuTypeLoaded && !Objects.equals(__menuTypeValue, __other.menuType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ICON)) != __other.__isVisible(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                boolean __iconLoaded = this.__iconLoaded;
                if (__iconLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                if (__iconLoaded && !Objects.equals(__iconValue, __other.icon())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && !Objects.equals(__rolesValue, __other.roles())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded && __idValue != __other.id()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                boolean __createdTimeLoaded = __createdTimeValue != null;
                if (__createdTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                if (__createdTimeLoaded && __createdTimeValue != __other.createdTime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                boolean __editedTimeLoaded = __editedTimeValue != null;
                if (__editedTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                if (__editedTimeLoaded && __editedTimeValue != __other.editedTime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITOR)) != __other.__isVisible(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                boolean __editorLoaded = __editorValue != null;
                if (__editorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                if (__editorLoaded && __editorValue != __other.editor()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATOR)) != __other.__isVisible(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                boolean __creatorLoaded = __creatorValue != null;
                if (__creatorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                if (__creatorLoaded && __creatorValue != __other.creator()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                boolean __nameLoaded = __nameValue != null;
                if (__nameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                if (__nameLoaded && __nameValue != __other.name()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PATH)) != __other.__isVisible(PropId.byIndex(SLOT_PATH))) {
                    return false;
                }
                boolean __pathLoaded = __pathValue != null;
                if (__pathLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PATH))) {
                    return false;
                }
                if (__pathLoaded && __pathValue != __other.path()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                boolean __parentIdLoaded = this.__parentIdLoaded;
                if (__parentIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__parentIdLoaded && __parentIdValue != __other.parentId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ORDER_NUM)) != __other.__isVisible(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                boolean __orderNumLoaded = this.__orderNumLoaded;
                if (__orderNumLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                if (__orderNumLoaded && __orderNumValue != __other.orderNum()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                boolean __menuTypeLoaded = __menuTypeValue != null;
                if (__menuTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                if (__menuTypeLoaded && __menuTypeValue != __other.menuType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ICON)) != __other.__isVisible(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                boolean __iconLoaded = this.__iconLoaded;
                if (__iconLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                if (__iconLoaded && __iconValue != __other.icon()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && __rolesValue != __other.roles()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        @GeneratedBy(
                type = Menu.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, MenuDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private Menu __resolved;

            DraftImpl(DraftContext ctx, Menu base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public MenuDraft setId(String id) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__idValue = id;
                return this;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                return (__modified!= null ? __modified : __base).createdTime();
            }

            @Override
            public MenuDraft setCreatedTime(LocalDateTime createdTime) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (createdTime == null) {
                    throw new IllegalArgumentException(
                        "'createdTime' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createdTimeValue = createdTime;
                return this;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                return (__modified!= null ? __modified : __base).editedTime();
            }

            @Override
            public MenuDraft setEditedTime(LocalDateTime editedTime) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (editedTime == null) {
                    throw new IllegalArgumentException(
                        "'editedTime' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__editedTimeValue = editedTime;
                return this;
            }

            @Override
            @JsonIgnore
            public UserDraft editor() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).editor());
            }

            @Override
            public UserDraft editor(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_EDITOR)))) {
                    setEditor(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).editor());
            }

            @Override
            public MenuDraft setEditor(User editor) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (editor == null) {
                    throw new IllegalArgumentException(
                        "'editor' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__editorValue = editor;
                return this;
            }

            @NotNull
            @Override
            public String editorId() {
                return editor().id();
            }

            @OldChain
            @Override
            public MenuDraft setEditorId(@NotNull String editorId) {
                editor(true).setId(Objects.requireNonNull(editorId, "\"editor\" cannot be null"));
                return this;
            }

            @Override
            public MenuDraft applyEditor(DraftConsumer<UserDraft> block) {
                applyEditor(null, block);
                return this;
            }

            @Override
            public MenuDraft applyEditor(User base, DraftConsumer<UserDraft> block) {
                setEditor(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public UserDraft creator() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).creator());
            }

            @Override
            public UserDraft creator(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_CREATOR)))) {
                    setCreator(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).creator());
            }

            @Override
            public MenuDraft setCreator(User creator) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (creator == null) {
                    throw new IllegalArgumentException(
                        "'creator' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__creatorValue = creator;
                return this;
            }

            @NotNull
            @Override
            public String creatorId() {
                return creator().id();
            }

            @OldChain
            @Override
            public MenuDraft setCreatorId(@NotNull String creatorId) {
                creator(true).setId(Objects.requireNonNull(creatorId, "\"creator\" cannot be null"));
                return this;
            }

            @Override
            public MenuDraft applyCreator(DraftConsumer<UserDraft> block) {
                applyCreator(null, block);
                return this;
            }

            @Override
            public MenuDraft applyCreator(User base, DraftConsumer<UserDraft> block) {
                setCreator(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public String name() {
                return (__modified!= null ? __modified : __base).name();
            }

            @Override
            public MenuDraft setName(String name) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (name == null) {
                    throw new IllegalArgumentException(
                        "'name' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__nameValue = name;
                return this;
            }

            @Override
            @JsonIgnore
            public String path() {
                return (__modified!= null ? __modified : __base).path();
            }

            @Override
            public MenuDraft setPath(String path) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (path == null) {
                    throw new IllegalArgumentException(
                        "'path' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__pathValue = path;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                return (__modified!= null ? __modified : __base).parentId();
            }

            @Override
            public MenuDraft setParentId(String parentId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__parentIdValue = parentId;
                __tmpModified.__parentIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer orderNum() {
                return (__modified!= null ? __modified : __base).orderNum();
            }

            @Override
            public MenuDraft setOrderNum(Integer orderNum) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__orderNumValue = orderNum;
                __tmpModified.__orderNumLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public DictConstants.MenuType menuType() {
                return (__modified!= null ? __modified : __base).menuType();
            }

            @Override
            public MenuDraft setMenuType(DictConstants.MenuType menuType) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (menuType == null) {
                    throw new IllegalArgumentException(
                        "'menuType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__menuTypeValue = menuType;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String icon() {
                return (__modified!= null ? __modified : __base).icon();
            }

            @Override
            public MenuDraft setIcon(String icon) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__iconValue = icon;
                __tmpModified.__iconLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public List<RoleMenuRel> roles() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), RoleMenuRel.class, true);
            }

            @Override
            public List<RoleMenuRelDraft> roles(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_ROLES)))) {
                    setRoles(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), RoleMenuRel.class, true);
            }

            @Override
            public MenuDraft setRoles(List<RoleMenuRel> roles) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (roles == null) {
                    throw new IllegalArgumentException(
                        "'roles' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, roles);
                return this;
            }

            @Override
            public MenuDraft addIntoRoles(DraftConsumer<RoleMenuRelDraft> block) {
                addIntoRoles(null, block);
                return this;
            }

            @Override
            public MenuDraft addIntoRoles(RoleMenuRel base, DraftConsumer<RoleMenuRelDraft> block) {
                roles(true).add((RoleMenuRelDraft)RoleMenuRelDraft.$.produce(base, block));
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_CREATED_TIME:
                    		setCreatedTime((LocalDateTime)value);break;
                    case SLOT_EDITED_TIME:
                    		setEditedTime((LocalDateTime)value);break;
                    case SLOT_EDITOR:
                    		setEditor((User)value);break;
                    case SLOT_CREATOR:
                    		setCreator((User)value);break;
                    case SLOT_NAME:
                    		setName((String)value);break;
                    case SLOT_PATH:
                    		setPath((String)value);break;
                    case SLOT_PARENT_ID:
                    		setParentId((String)value);break;
                    case SLOT_ORDER_NUM:
                    		setOrderNum((Integer)value);break;
                    case SLOT_MENU_TYPE:
                    		setMenuType((DictConstants.MenuType)value);break;
                    case SLOT_ICON:
                    		setIcon((String)value);break;
                    case SLOT_ROLES:
                    		setRoles((List<RoleMenuRel>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "createdTime":
                    		setCreatedTime((LocalDateTime)value);break;
                    case "editedTime":
                    		setEditedTime((LocalDateTime)value);break;
                    case "editor":
                    		setEditor((User)value);break;
                    case "creator":
                    		setCreator((User)value);break;
                    case "name":
                    		setName((String)value);break;
                    case "path":
                    		setPath((String)value);break;
                    case "parentId":
                    		setParentId((String)value);break;
                    case "orderNum":
                    		setOrderNum((Integer)value);break;
                    case "menuType":
                    		setMenuType((DictConstants.MenuType)value);break;
                    case "icon":
                    		setIcon((String)value);break;
                    case "roles":
                    		setRoles((List<RoleMenuRel>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(12);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_CREATED_TIME:
                    		__visibility.show(SLOT_CREATED_TIME, visible);break;
                    case SLOT_EDITED_TIME:
                    		__visibility.show(SLOT_EDITED_TIME, visible);break;
                    case SLOT_EDITOR:
                    		__visibility.show(SLOT_EDITOR, visible);break;
                    case SLOT_CREATOR:
                    		__visibility.show(SLOT_CREATOR, visible);break;
                    case SLOT_NAME:
                    		__visibility.show(SLOT_NAME, visible);break;
                    case SLOT_PATH:
                    		__visibility.show(SLOT_PATH, visible);break;
                    case SLOT_PARENT_ID:
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case SLOT_ORDER_NUM:
                    		__visibility.show(SLOT_ORDER_NUM, visible);break;
                    case SLOT_MENU_TYPE:
                    		__visibility.show(SLOT_MENU_TYPE, visible);break;
                    case SLOT_ICON:
                    		__visibility.show(SLOT_ICON, visible);break;
                    case SLOT_ROLES:
                    		__visibility.show(SLOT_ROLES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"kaigee.top.menu.entity.Menu\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(12);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "createdTime":
                    		__visibility.show(SLOT_CREATED_TIME, visible);break;
                    case "editedTime":
                    		__visibility.show(SLOT_EDITED_TIME, visible);break;
                    case "editor":
                    		__visibility.show(SLOT_EDITOR, visible);break;
                    case "creator":
                    		__visibility.show(SLOT_CREATOR, visible);break;
                    case "name":
                    		__visibility.show(SLOT_NAME, visible);break;
                    case "path":
                    		__visibility.show(SLOT_PATH, visible);break;
                    case "parentId":
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case "orderNum":
                    		__visibility.show(SLOT_ORDER_NUM, visible);break;
                    case "menuType":
                    		__visibility.show(SLOT_MENU_TYPE, visible);break;
                    case "icon":
                    		__visibility.show(SLOT_ICON, visible);break;
                    case "roles":
                    		__visibility.show(SLOT_ROLES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_CREATED_TIME:
                    		__modified().__createdTimeValue = null;break;
                    case SLOT_EDITED_TIME:
                    		__modified().__editedTimeValue = null;break;
                    case SLOT_EDITOR:
                    		__modified().__editorValue = null;break;
                    case SLOT_CREATOR:
                    		__modified().__creatorValue = null;break;
                    case SLOT_NAME:
                    		__modified().__nameValue = null;break;
                    case SLOT_PATH:
                    		__modified().__pathValue = null;break;
                    case SLOT_PARENT_ID:
                    		__modified().__parentIdLoaded = false;break;
                    case SLOT_ORDER_NUM:
                    		__modified().__orderNumLoaded = false;break;
                    case SLOT_MENU_TYPE:
                    		__modified().__menuTypeValue = null;break;
                    case SLOT_ICON:
                    		__modified().__iconLoaded = false;break;
                    case SLOT_ROLES:
                    		__modified().__rolesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "createdTime":
                    		__modified().__createdTimeValue = null;break;
                    case "editedTime":
                    		__modified().__editedTimeValue = null;break;
                    case "editor":
                    		__modified().__editorValue = null;break;
                    case "creator":
                    		__modified().__creatorValue = null;break;
                    case "name":
                    		__modified().__nameValue = null;break;
                    case "path":
                    		__modified().__pathValue = null;break;
                    case "parentId":
                    		__modified().__parentIdLoaded = false;break;
                    case "orderNum":
                    		__modified().__orderNumLoaded = false;break;
                    case "menuType":
                    		__modified().__menuTypeValue = null;break;
                    case "icon":
                    		__modified().__iconLoaded = false;break;
                    case "roles":
                    		__modified().__rolesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.menu.entity.Menu\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolved != null) {
                    return __resolved;
                }
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_EDITOR))) {
                            User oldValue = base.editor();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setEditor(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_CREATOR))) {
                            User oldValue = base.creator();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setCreator(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                            List<RoleMenuRel> oldValue = base.roles();
                            List<RoleMenuRel> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setRoles(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__editorValue = __ctx.resolveObject(__tmpModified.__editorValue);
                        __tmpModified.__creatorValue = __ctx.resolveObject(__tmpModified.__creatorValue);
                        __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, __ctx.resolveList(__tmpModified.__rolesValue));
                    }
                    if (__base != null && __tmpModified == null) {
                        this.__resolved = base;
                        return base;
                    }
                    this.__resolved = __tmpModified;
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            @Override
            public boolean __isResolved() {
                return __resolved != null;
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = Menu.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        public Builder createdTime(LocalDateTime createdTime) {
            if (createdTime != null) {
                __draft.setCreatedTime(createdTime);
            }
            return this;
        }

        public Builder editedTime(LocalDateTime editedTime) {
            if (editedTime != null) {
                __draft.setEditedTime(editedTime);
            }
            return this;
        }

        public Builder editor(User editor) {
            if (editor != null) {
                __draft.setEditor(editor);
            }
            return this;
        }

        public Builder creator(User creator) {
            if (creator != null) {
                __draft.setCreator(creator);
            }
            return this;
        }

        @GenField(
                value = "菜单名称",
                order = 0
        )
        public Builder name(String name) {
            if (name != null) {
                __draft.setName(name);
            }
            return this;
        }

        @GenField(
                value = "菜单路径",
                order = 2
        )
        public Builder path(String path) {
            if (path != null) {
                __draft.setPath(path);
            }
            return this;
        }

        @Null
        @GenField(
                value = "父级菜单",
                order = 1
        )
        public Builder parentId(String parentId) {
            __draft.setParentId(parentId);
            return this;
        }

        @GenField(
                value = "排序",
                order = 3
        )
        public Builder orderNum(Integer orderNum) {
            __draft.setOrderNum(orderNum);
            return this;
        }

        @GenField(
                value = "菜单类型",
                order = 4,
                type = ItemType.SELECTABLE,
                dictEnName = "MENU_TYPE"
        )
        public Builder menuType(DictConstants.MenuType menuType) {
            if (menuType != null) {
                __draft.setMenuType(menuType);
            }
            return this;
        }

        @Null
        @GenField(
                value = "图标",
                order = 5,
                type = ItemType.PICTURE
        )
        public Builder icon(String icon) {
            __draft.setIcon(icon);
            return this;
        }

        public Builder roles(List<RoleMenuRel> roles) {
            if (roles != null) {
                __draft.setRoles(roles);
            }
            return this;
        }

        public Menu build() {
            return (Menu)__draft.__modified();
        }
    }
}
