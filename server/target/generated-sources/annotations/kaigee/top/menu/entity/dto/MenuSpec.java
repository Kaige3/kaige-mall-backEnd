package kaigee.top.menu.entity.dto;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Objects;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.menu.entity.Menu;
import kaigee.top.menu.entity.MenuProps;
import kaigee.top.menu.entity.MenuTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/menu/entity/Menu.dto"
)
@GenEntity
public class MenuSpec implements JSpecification<Menu, MenuTable> {
    private Integer orderNum;

    private DictConstants.MenuType menuType;

    private String icon;

    private String name;

    private String path;

    private String parentId;

    private String id;

    private LocalDateTime minEditedTime;

    private LocalDateTime maxEditedTime;

    private LocalDateTime minCreatedTime;

    private LocalDateTime maxCreatedTime;

    public MenuSpec() {
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

    @Nullable
    @GenField(
            value = "菜单类型",
            order = 4,
            type = ItemType.SELECTABLE,
            dictEnName = "MENU_TYPE"
    )
    public DictConstants.MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(@Nullable DictConstants.MenuType menuType) {
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
    @GenField(
            value = "菜单名称",
            order = 0
    )
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    @GenField(
            value = "菜单路径",
            order = 2
    )
    public String getPath() {
        return path;
    }

    public void setPath(@Nullable String path) {
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
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Nullable
    public LocalDateTime getMinEditedTime() {
        return minEditedTime;
    }

    public void setMinEditedTime(@Nullable LocalDateTime minEditedTime) {
        this.minEditedTime = minEditedTime;
    }

    @Nullable
    public LocalDateTime getMaxEditedTime() {
        return maxEditedTime;
    }

    public void setMaxEditedTime(@Nullable LocalDateTime maxEditedTime) {
        this.maxEditedTime = maxEditedTime;
    }

    @Nullable
    public LocalDateTime getMinCreatedTime() {
        return minCreatedTime;
    }

    public void setMinCreatedTime(@Nullable LocalDateTime minCreatedTime) {
        this.minCreatedTime = minCreatedTime;
    }

    @Nullable
    public LocalDateTime getMaxCreatedTime() {
        return maxCreatedTime;
    }

    public void setMaxCreatedTime(@Nullable LocalDateTime maxCreatedTime) {
        this.maxCreatedTime = maxCreatedTime;
    }

    @Override
    public Class<Menu> entityType() {
        return Menu.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Menu, MenuTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.eq(new ImmutableProp[] { MenuProps.ORDER_NUM.unwrap() }, this.orderNum);
        __applier.eq(new ImmutableProp[] { MenuProps.MENU_TYPE.unwrap() }, this.menuType);
        __applier.eq(new ImmutableProp[] { MenuProps.ICON.unwrap() }, this.icon);
        __applier.like(new ImmutableProp[] { MenuProps.NAME.unwrap() }, this.name, true, false, false);
        __applier.like(new ImmutableProp[] { MenuProps.PATH.unwrap() }, this.path, true, false, false);
        __applier.like(new ImmutableProp[] { MenuProps.PARENT_ID.unwrap() }, this.parentId, true, false, false);
        __applier.like(new ImmutableProp[] { MenuProps.ID.unwrap() }, this.id, true, false, false);
        __applier.ge(MenuProps.EDITED_TIME.unwrap(), this.minEditedTime);
        __applier.le(MenuProps.EDITED_TIME.unwrap(), this.maxEditedTime);
        __applier.ge(MenuProps.CREATED_TIME.unwrap(), this.minCreatedTime);
        __applier.le(MenuProps.CREATED_TIME.unwrap(), this.maxCreatedTime);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(orderNum);
        hash = hash * 31 + Objects.hashCode(menuType);
        hash = hash * 31 + Objects.hashCode(icon);
        hash = hash * 31 + Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(path);
        hash = hash * 31 + Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(minEditedTime);
        hash = hash * 31 + Objects.hashCode(maxEditedTime);
        hash = hash * 31 + Objects.hashCode(minCreatedTime);
        hash = hash * 31 + Objects.hashCode(maxCreatedTime);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuSpec other = (MenuSpec) o;
        if (!Objects.equals(orderNum, other.orderNum)) {
            return false;
        }
        if (!Objects.equals(menuType, other.menuType)) {
            return false;
        }
        if (!Objects.equals(icon, other.icon)) {
            return false;
        }
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(path, other.path)) {
            return false;
        }
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(minEditedTime, other.minEditedTime)) {
            return false;
        }
        if (!Objects.equals(maxEditedTime, other.maxEditedTime)) {
            return false;
        }
        if (!Objects.equals(minCreatedTime, other.minCreatedTime)) {
            return false;
        }
        if (!Objects.equals(maxCreatedTime, other.maxCreatedTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuSpec").append('(');
        builder.append("orderNum=").append(orderNum);
        builder.append(", menuType=").append(menuType);
        builder.append(", icon=").append(icon);
        builder.append(", name=").append(name);
        builder.append(", path=").append(path);
        builder.append(", parentId=").append(parentId);
        builder.append(", id=").append(id);
        builder.append(", minEditedTime=").append(minEditedTime);
        builder.append(", maxEditedTime=").append(maxEditedTime);
        builder.append(", minCreatedTime=").append(minCreatedTime);
        builder.append(", maxCreatedTime=").append(maxCreatedTime);
        builder.append(')');
        return builder.toString();
    }
}
