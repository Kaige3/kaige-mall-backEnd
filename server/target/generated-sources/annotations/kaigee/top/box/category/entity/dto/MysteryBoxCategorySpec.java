package kaigee.top.box.category.entity.dto;

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
import kaigee.top.box.category.entity.MysteryBoxCategory;
import kaigee.top.box.category.entity.MysteryBoxCategoryProps;
import kaigee.top.box.category.entity.MysteryBoxCategoryTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;

/**
 * 盲盒类别
 */
@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/box/category/entity/MysteryBoxCategory.dto"
)
@GenEntity
public class MysteryBoxCategorySpec implements JSpecification<MysteryBoxCategory, MysteryBoxCategoryTable> {
    private Integer sortOrder;

    private String name;

    private String description;

    private String icon;

    private String id;

    private LocalDateTime minCreatedTime;

    private LocalDateTime maxCreatedTime;

    private LocalDateTime minEditedTime;

    private LocalDateTime maxEditedTime;

    public MysteryBoxCategorySpec() {
    }

    /**
     * 排序号
     */
    @Nullable
    @GenField(
            value = "排序",
            order = 3
    )
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(@Nullable Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 类别名称
     */
    @Nullable
    @GenField(
            value = "类别名称",
            order = 0
    )
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * 描述
     */
    @Nullable
    @GenField(
            value = "描述",
            order = 2
    )
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    /**
     * 类别图标
     */
    @Nullable
    @GenField(
            value = "类别图标",
            type = ItemType.PICTURE,
            order = 1
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

    @Override
    public Class<MysteryBoxCategory> entityType() {
        return MysteryBoxCategory.class;
    }

    @Override
    public void applyTo(SpecificationArgs<MysteryBoxCategory, MysteryBoxCategoryTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.eq(new ImmutableProp[] { MysteryBoxCategoryProps.SORT_ORDER.unwrap() }, this.sortOrder);
        __applier.like(new ImmutableProp[] { MysteryBoxCategoryProps.NAME.unwrap() }, this.name, true, false, false);
        __applier.like(new ImmutableProp[] { MysteryBoxCategoryProps.DESCRIPTION.unwrap() }, this.description, true, false, false);
        __applier.like(new ImmutableProp[] { MysteryBoxCategoryProps.ICON.unwrap() }, this.icon, true, false, false);
        __applier.like(new ImmutableProp[] { MysteryBoxCategoryProps.ID.unwrap() }, this.id, true, false, false);
        __applier.ge(MysteryBoxCategoryProps.CREATED_TIME.unwrap(), this.minCreatedTime);
        __applier.le(MysteryBoxCategoryProps.CREATED_TIME.unwrap(), this.maxCreatedTime);
        __applier.ge(MysteryBoxCategoryProps.EDITED_TIME.unwrap(), this.minEditedTime);
        __applier.le(MysteryBoxCategoryProps.EDITED_TIME.unwrap(), this.maxEditedTime);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(sortOrder);
        hash = hash * 31 + Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(description);
        hash = hash * 31 + Objects.hashCode(icon);
        hash = hash * 31 + Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(minCreatedTime);
        hash = hash * 31 + Objects.hashCode(maxCreatedTime);
        hash = hash * 31 + Objects.hashCode(minEditedTime);
        hash = hash * 31 + Objects.hashCode(maxEditedTime);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MysteryBoxCategorySpec other = (MysteryBoxCategorySpec) o;
        if (!Objects.equals(sortOrder, other.sortOrder)) {
            return false;
        }
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(description, other.description)) {
            return false;
        }
        if (!Objects.equals(icon, other.icon)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(minCreatedTime, other.minCreatedTime)) {
            return false;
        }
        if (!Objects.equals(maxCreatedTime, other.maxCreatedTime)) {
            return false;
        }
        if (!Objects.equals(minEditedTime, other.minEditedTime)) {
            return false;
        }
        if (!Objects.equals(maxEditedTime, other.maxEditedTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MysteryBoxCategorySpec").append('(');
        builder.append("sortOrder=").append(sortOrder);
        builder.append(", name=").append(name);
        builder.append(", description=").append(description);
        builder.append(", icon=").append(icon);
        builder.append(", id=").append(id);
        builder.append(", minCreatedTime=").append(minCreatedTime);
        builder.append(", maxCreatedTime=").append(maxCreatedTime);
        builder.append(", minEditedTime=").append(minEditedTime);
        builder.append(", maxEditedTime=").append(maxEditedTime);
        builder.append(')');
        return builder.toString();
    }
}
