package kaigee.top.menu.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuDraft;
import kaigee.top.menu.entity.MenuFetcher;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/menu/entity/Menu.dto"
)
@JsonDeserialize(
        builder = MenuInput.Builder.class
)
@GenEntity
public class MenuInput implements Input<Menu> {
    public static final DtoMetadata<Menu, MenuInput> METADATA = 
        new DtoMetadata<Menu, MenuInput>(
            MenuFetcher.$
                .name()
                .path()
                .parentId()
                .orderNum()
                .menuType()
                .icon(),
            MenuInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_ID }
    );

    @FixedInputField
    private String name;

    @FixedInputField
    private String path;

    private String parentId;

    private Integer orderNum;

    @FixedInputField
    private DictConstants.MenuType menuType;

    private String icon;

    private String id;

    public MenuInput() {
    }

    public MenuInput(@NotNull Menu base) {
        this.name = base.name();
        this.path = base.path();
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.orderNum = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_ORDER_NUM)) ? base.orderNum() : null;
        this.menuType = base.menuType();
        this.icon = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_ICON)) ? base.icon() : null;
        this.id = ID_ACCESSOR.get(base);
    }

    @NotNull
    @GenField(
            value = "菜单名称",
            order = 0
    )
    public String getName() {
        if (name == null) {
            throw new IllegalStateException("The property \"name\" is not specified");
        }
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    @GenField(
            value = "菜单路径",
            order = 2
    )
    public String getPath() {
        if (path == null) {
            throw new IllegalStateException("The property \"path\" is not specified");
        }
        return path;
    }

    public void setPath(@NotNull String path) {
        this.path = path;
    }

    @Nullable
    @GenField(
            value = "父级菜单",
            order = 1
    )
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    @Nullable
    @GenField(
            value = "排序",
            order = 3
    )
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(@Nullable Integer orderNum) {
        this.orderNum = orderNum;
    }

    @NotNull
    @GenField(
            value = "菜单类型",
            order = 4,
            type = ItemType.SELECTABLE,
            dictEnName = "MENU_TYPE"
    )
    public DictConstants.MenuType getMenuType() {
        if (menuType == null) {
            throw new IllegalStateException("The property \"menuType\" is not specified");
        }
        return menuType;
    }

    public void setMenuType(@NotNull DictConstants.MenuType menuType) {
        this.menuType = menuType;
    }

    @Nullable
    @GenField(
            value = "图标",
            order = 5,
            type = ItemType.PICTURE
    )
    public String getIcon() {
        return icon;
    }

    public void setIcon(@Nullable String icon) {
        this.icon = icon;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(__draft -> {
            __draft.setName(name);
            __draft.setPath(path);
            __draft.setParentId(parentId);
            __draft.setOrderNum(orderNum);
            __draft.setMenuType(menuType);
            __draft.setIcon(icon);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(path);
        hash = hash * 31 + Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(orderNum);
        hash = hash * 31 + Objects.hashCode(menuType);
        hash = hash * 31 + Objects.hashCode(icon);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuInput other = (MenuInput) o;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(path, other.path)) {
            return false;
        }
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        if (!Objects.equals(orderNum, other.orderNum)) {
            return false;
        }
        if (!Objects.equals(menuType, other.menuType)) {
            return false;
        }
        if (!Objects.equals(icon, other.icon)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuInput").append('(');
        builder.append("name=").append(name);
        builder.append(", path=").append(path);
        builder.append(", parentId=").append(parentId);
        builder.append(", orderNum=").append(orderNum);
        builder.append(", menuType=").append(menuType);
        builder.append(", icon=").append(icon);
        builder.append(", id=").append(id);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String name;

        private String path;

        private String parentId;

        private Integer orderNum;

        private DictConstants.MenuType menuType;

        private String icon;

        private String id;

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name, "The property \"name\" cannot be null");
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path, "The property \"path\" cannot be null");
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder orderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }

        public Builder menuType(DictConstants.MenuType menuType) {
            this.menuType = Objects.requireNonNull(menuType, "The property \"menuType\" cannot be null");
            return this;
        }

        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public MenuInput build() {
            MenuInput _input = new MenuInput();
            if (name == null) {
                throw Input.unknownNonNullProperty(MenuInput.class, "name");
            }
            _input.setName(name);
            if (path == null) {
                throw Input.unknownNonNullProperty(MenuInput.class, "path");
            }
            _input.setPath(path);
            _input.setParentId(parentId);
            _input.setOrderNum(orderNum);
            if (menuType == null) {
                throw Input.unknownNonNullProperty(MenuInput.class, "menuType");
            }
            _input.setMenuType(menuType);
            _input.setIcon(icon);
            _input.setId(id);
            return _input;
        }
    }
}
