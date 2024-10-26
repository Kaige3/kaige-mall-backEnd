package kaigee.top.role.entity;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import kaigee.top.infrastructure.jimmer.BaseEntity;
import kaigee.top.user.root.entity.UserRoleRel;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;
import org.babyfish.jimmer.sql.OneToMany;

import java.util.List;

/**
 * Entity for table "role"
 */
@Entity
@GenEntity
public interface Role extends BaseEntity {


    @Key
    @GenField(value = "角色名称",order = 0)
    String name();

    @OneToMany(mappedBy = "role")
    List<UserRoleRel> users();
}

