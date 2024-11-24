package kaigee.top.box.category.entity;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import jakarta.validation.constraints.Null;
import kaigee.top.infrastructure.jimmer.BaseEntity;
import org.babyfish.jimmer.sql.Entity;

/**
 * 盲盒类别
 */
@GenEntity
@Entity
public interface MysteryBoxCategory extends BaseEntity {




    /**
     * 类别名称
     */
    @Null
    @GenField(value = "类别名称",order = 0)
    String name();

    /**
     * 类别图标
     */
    @Null
    @GenField(value = "类别图标",type =ItemType.PICTURE ,order = 1)
    String icon();

    /**
     * 描述
     */
    @Null
    @GenField(value = "描述",order = 2)
    String description();

    /**
     * 排序号
     */
    @Null
    @GenField(value = "排序",order = 3)
    Integer sortOrder();
}

