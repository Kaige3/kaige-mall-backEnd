package kaigee.top.box.category.entity.dto;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import kaigee.top.box.category.entity.MysteryBoxCategory;
import kaigee.top.box.category.entity.MysteryBoxCategoryDraft;
import kaigee.top.box.category.entity.MysteryBoxCategoryFetcher;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 盲盒类别
 */
@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/box/category/entity/MysteryBoxCategory.dto"
)
@GenEntity
public class MysteryBoxCategoryInput implements Input<MysteryBoxCategory> {
    public static final DtoMetadata<MysteryBoxCategory, MysteryBoxCategoryInput> METADATA = 
        new DtoMetadata<MysteryBoxCategory, MysteryBoxCategoryInput>(
            MysteryBoxCategoryFetcher.$
                .name()
                .icon()
                .description()
                .sortOrder(),
            MysteryBoxCategoryInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MysteryBoxCategoryDraft.Producer.SLOT_ID }
    );

    private String name;

    private String icon;

    private String description;

    private Integer sortOrder;

    private String id;

    public MysteryBoxCategoryInput() {
    }

    public MysteryBoxCategoryInput(@NotNull MysteryBoxCategory base) {
        this.name = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MysteryBoxCategoryDraft.Producer.SLOT_NAME)) ? base.name() : null;
        this.icon = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MysteryBoxCategoryDraft.Producer.SLOT_ICON)) ? base.icon() : null;
        this.description = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MysteryBoxCategoryDraft.Producer.SLOT_DESCRIPTION)) ? base.description() : null;
        this.sortOrder = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MysteryBoxCategoryDraft.Producer.SLOT_SORT_ORDER)) ? base.sortOrder() : null;
        this.id = ID_ACCESSOR.get(base);
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

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Override
    public MysteryBoxCategory toEntity() {
        return MysteryBoxCategoryDraft.$.produce(__draft -> {
            __draft.setName(name);
            __draft.setIcon(icon);
            __draft.setDescription(description);
            __draft.setSortOrder(sortOrder);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(icon);
        hash = hash * 31 + Objects.hashCode(description);
        hash = hash * 31 + Objects.hashCode(sortOrder);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MysteryBoxCategoryInput other = (MysteryBoxCategoryInput) o;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(icon, other.icon)) {
            return false;
        }
        if (!Objects.equals(description, other.description)) {
            return false;
        }
        if (!Objects.equals(sortOrder, other.sortOrder)) {
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
        builder.append("MysteryBoxCategoryInput").append('(');
        builder.append("name=").append(name);
        builder.append(", icon=").append(icon);
        builder.append(", description=").append(description);
        builder.append(", sortOrder=").append(sortOrder);
        builder.append(", id=").append(id);
        builder.append(')');
        return builder.toString();
    }
}
