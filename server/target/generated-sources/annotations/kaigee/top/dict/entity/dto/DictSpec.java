package kaigee.top.dict.entity.dto;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Objects;
import kaigee.top.dict.entity.Dict;
import kaigee.top.dict.entity.DictProps;
import kaigee.top.dict.entity.DictTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/dict/entity/Dict.dto"
)
@GenEntity
public class DictSpec implements JSpecification<Dict, DictTable> {
    private Integer keyId;

    private Integer dictId;

    private Integer orderNum;

    private Boolean visible;

    private String dictName;

    private String keyName;

    private String dictEnName;

    private String keyEnName;

    private String id;

    private LocalDateTime minEditedTime;

    private LocalDateTime maxEditedTime;

    private LocalDateTime minCreatedTime;

    private LocalDateTime maxCreatedTime;

    public DictSpec() {
    }

    @Nullable
    @GenField(
            value = "值编号",
            order = -1
    )
    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(@Nullable Integer keyId) {
        this.keyId = keyId;
    }

    @Nullable
    @GenField(
            value = "字典编号",
            order = 2
    )
    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(@Nullable Integer dictId) {
        this.dictId = dictId;
    }

    @Nullable
    @GenField(
            value = "排序号",
            order = 5
    )
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(@Nullable Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Nullable
    @GenField(
            value = "是否可见",
            order = 6
    )
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(@Nullable Boolean visible) {
        this.visible = visible;
    }

    @Nullable
    @GenField(
            value = "字典名称",
            order = 3
    )
    public String getDictName() {
        return dictName;
    }

    public void setDictName(@Nullable String dictName) {
        this.dictName = dictName;
    }

    @Nullable
    @GenField(
            value = "值名称",
            order = 0
    )
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(@Nullable String keyName) {
        this.keyName = keyName;
    }

    @Nullable
    @GenField(
            value = "字段英文名称",
            order = 4
    )
    public String getDictEnName() {
        return dictEnName;
    }

    public void setDictEnName(@Nullable String dictEnName) {
        this.dictEnName = dictEnName;
    }

    @Nullable
    @GenField(
            value = "值英文名称",
            order = 1
    )
    public String getKeyEnName() {
        return keyEnName;
    }

    public void setKeyEnName(@Nullable String keyEnName) {
        this.keyEnName = keyEnName;
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
    public Class<Dict> entityType() {
        return Dict.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Dict, DictTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.eq(new ImmutableProp[] { DictProps.KEY_ID.unwrap() }, this.keyId);
        __applier.eq(new ImmutableProp[] { DictProps.DICT_ID.unwrap() }, this.dictId);
        __applier.eq(new ImmutableProp[] { DictProps.ORDER_NUM.unwrap() }, this.orderNum);
        __applier.eq(new ImmutableProp[] { DictProps.VISIBLE.unwrap() }, this.visible);
        __applier.like(new ImmutableProp[] { DictProps.DICT_NAME.unwrap() }, this.dictName, true, false, false);
        __applier.like(new ImmutableProp[] { DictProps.KEY_NAME.unwrap() }, this.keyName, true, false, false);
        __applier.like(new ImmutableProp[] { DictProps.DICT_EN_NAME.unwrap() }, this.dictEnName, true, false, false);
        __applier.like(new ImmutableProp[] { DictProps.KEY_EN_NAME.unwrap() }, this.keyEnName, true, false, false);
        __applier.like(new ImmutableProp[] { DictProps.ID.unwrap() }, this.id, true, false, false);
        __applier.ge(DictProps.EDITED_TIME.unwrap(), this.minEditedTime);
        __applier.le(DictProps.EDITED_TIME.unwrap(), this.maxEditedTime);
        __applier.ge(DictProps.CREATED_TIME.unwrap(), this.minCreatedTime);
        __applier.le(DictProps.CREATED_TIME.unwrap(), this.maxCreatedTime);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(keyId);
        hash = hash * 31 + Objects.hashCode(dictId);
        hash = hash * 31 + Objects.hashCode(orderNum);
        hash = hash * 31 + Objects.hashCode(visible);
        hash = hash * 31 + Objects.hashCode(dictName);
        hash = hash * 31 + Objects.hashCode(keyName);
        hash = hash * 31 + Objects.hashCode(dictEnName);
        hash = hash * 31 + Objects.hashCode(keyEnName);
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
        DictSpec other = (DictSpec) o;
        if (!Objects.equals(keyId, other.keyId)) {
            return false;
        }
        if (!Objects.equals(dictId, other.dictId)) {
            return false;
        }
        if (!Objects.equals(orderNum, other.orderNum)) {
            return false;
        }
        if (!Objects.equals(visible, other.visible)) {
            return false;
        }
        if (!Objects.equals(dictName, other.dictName)) {
            return false;
        }
        if (!Objects.equals(keyName, other.keyName)) {
            return false;
        }
        if (!Objects.equals(dictEnName, other.dictEnName)) {
            return false;
        }
        if (!Objects.equals(keyEnName, other.keyEnName)) {
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
        builder.append("DictSpec").append('(');
        builder.append("keyId=").append(keyId);
        builder.append(", dictId=").append(dictId);
        builder.append(", orderNum=").append(orderNum);
        builder.append(", visible=").append(visible);
        builder.append(", dictName=").append(dictName);
        builder.append(", keyName=").append(keyName);
        builder.append(", dictEnName=").append(dictEnName);
        builder.append(", keyEnName=").append(keyEnName);
        builder.append(", id=").append(id);
        builder.append(", minEditedTime=").append(minEditedTime);
        builder.append(", maxEditedTime=").append(maxEditedTime);
        builder.append(", minCreatedTime=").append(minCreatedTime);
        builder.append(", maxCreatedTime=").append(maxCreatedTime);
        builder.append(')');
        return builder.toString();
    }
}
