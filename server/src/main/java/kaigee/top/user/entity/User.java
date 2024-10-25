package kaigee.top.user.entity;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import jakarta.validation.constraints.Null;
import kaigee.top.infrastructure.jimmer.BaseDateTime;
import kaigee.top.infrastructure.jimmer.UUIDIdGenerator;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.GeneratedValue;
import org.babyfish.jimmer.sql.Id;
import org.babyfish.jimmer.sql.Key;

/**
 * Entity for table "user"
 */
@Entity
@GenEntity
public interface User extends BaseDateTime {

    @Id
    @GeneratedValue(generatorType = UUIDIdGenerator.class
    )
    String id();

//    @Null
//    Object createdTime();
//
//    @Null
//    Object editedTime();

    @Null
    @GenField(value = "昵称", order = 2)
    String nickname();

    @Null
    @GenField(value = "头像", order = 3,type = ItemType.PICTURE)
    String avatar();

    @Null
    @GenField(value = "性别", order = 4)
    String gender();

    @Key
    @GenField(value = "手机号", order = 0)
    String phone();

    @GenField(value = "密码", order = 1)
    String password();

    /**
     * 用户状态
     */
    String status();
}

