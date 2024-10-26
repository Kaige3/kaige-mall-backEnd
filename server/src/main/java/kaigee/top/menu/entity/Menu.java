package kaigee.top.menu.entity;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import jakarta.validation.constraints.Null;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.infrastructure.jimmer.BaseEntity;
import kaigee.top.role.entity.RoleMenuRel;
import org.babyfish.jimmer.sql.*;


import java.util.List;

/**
 * Entity for table "menu"
 */
@Entity
@GenEntity
public interface Menu extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY
//    )
//    String id();



    @GenField(value = "菜单名称",order = 0)
    String name();

    @GenField(value = "菜单路径",order = 2)
    String path();

    @Null
    @GenField(value = "父级菜单",order = 1)
    String parentId();

@GenField(value = "排序",order = 3)
    Integer orderNum();


    @GenField(value = "菜单类型",order = 4,type = ItemType.SELECTABLE,dictEnName = DictConstants.MENU_TYPE)
    DictConstants.MenuType menuType();


    @Null
    @GenField(value = "图标",order = 5,type = ItemType.PICTURE)
    String icon();

    @OneToMany(mappedBy = "menu")
    List<RoleMenuRel> roles();
//    @Null
//    Object visible();
}

