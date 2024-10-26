package kaigee.top.dict.entity;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import kaigee.top.infrastructure.jimmer.BaseEntity;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;

/**
 * Entity for table "dict"
 */
@Entity
@GenEntity
public interface Dict extends BaseEntity {


    @Key
    @GenField(value = "值编号", order = -1)
    Integer keyId();

    @GenField(value = "值英文名称", order = 1)
    String keyEnName();

    @GenField(value = "值名称", order = 0)
    String keyName();

    @Key
    @GenField(value = "字典编号", order = 2)
    Integer dictId();

    @GenField(value = "字典名称", order = 3)
    String dictName();

    @GenField(value = "字段英文名称", order = 4)
    String dictEnName();

    @GenField(value = "排序号", order = 5)
    Integer orderNum();

    /**
     * 是否可见
     */
    @GenField(value = "是否可见", order = 6)
    boolean visible();
}

