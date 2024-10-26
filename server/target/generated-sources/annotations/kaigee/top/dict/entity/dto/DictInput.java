package kaigee.top.dict.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import kaigee.top.dict.entity.Dict;
import kaigee.top.dict.entity.DictDraft;
import kaigee.top.dict.entity.DictFetcher;
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
        file = "<server>/src/main/dto/kaigee/top/dict/entity/Dict.dto"
)
@JsonDeserialize(
        builder = DictInput.Builder.class
)
@GenEntity
public class DictInput implements Input<Dict> {
    public static final DtoMetadata<Dict, DictInput> METADATA = 
        new DtoMetadata<Dict, DictInput>(
            DictFetcher.$
                .keyId()
                .keyEnName()
                .keyName()
                .dictId()
                .dictName()
                .dictEnName()
                .orderNum()
                .visible(),
            DictInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { DictDraft.Producer.SLOT_ID }
    );

    private Integer keyId;

    @FixedInputField
    private String keyEnName;

    @FixedInputField
    private String keyName;

    private Integer dictId;

    @FixedInputField
    private String dictName;

    @FixedInputField
    private String dictEnName;

    private Integer orderNum;

    @FixedInputField
    private Boolean visible;

    private String id;

    public DictInput() {
    }

    public DictInput(@NotNull Dict base) {
        this.keyId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDraft.Producer.SLOT_KEY_ID)) ? base.keyId() : null;
        this.keyEnName = base.keyEnName();
        this.keyName = base.keyName();
        this.dictId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDraft.Producer.SLOT_DICT_ID)) ? base.dictId() : null;
        this.dictName = base.dictName();
        this.dictEnName = base.dictEnName();
        this.orderNum = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDraft.Producer.SLOT_ORDER_NUM)) ? base.orderNum() : null;
        this.visible = base.visible();
        this.id = ID_ACCESSOR.get(base);
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

    @NotNull
    @GenField(
            value = "值英文名称",
            order = 1
    )
    public String getKeyEnName() {
        if (keyEnName == null) {
            throw new IllegalStateException("The property \"keyEnName\" is not specified");
        }
        return keyEnName;
    }

    public void setKeyEnName(@NotNull String keyEnName) {
        this.keyEnName = keyEnName;
    }

    @NotNull
    @GenField(
            value = "值名称",
            order = 0
    )
    public String getKeyName() {
        if (keyName == null) {
            throw new IllegalStateException("The property \"keyName\" is not specified");
        }
        return keyName;
    }

    public void setKeyName(@NotNull String keyName) {
        this.keyName = keyName;
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

    @NotNull
    @GenField(
            value = "字典名称",
            order = 3
    )
    public String getDictName() {
        if (dictName == null) {
            throw new IllegalStateException("The property \"dictName\" is not specified");
        }
        return dictName;
    }

    public void setDictName(@NotNull String dictName) {
        this.dictName = dictName;
    }

    @NotNull
    @GenField(
            value = "字段英文名称",
            order = 4
    )
    public String getDictEnName() {
        if (dictEnName == null) {
            throw new IllegalStateException("The property \"dictEnName\" is not specified");
        }
        return dictEnName;
    }

    public void setDictEnName(@NotNull String dictEnName) {
        this.dictEnName = dictEnName;
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

    @GenField(
            value = "是否可见",
            order = 6
    )
    public boolean isVisible() {
        if (visible == null) {
            throw new IllegalStateException("The property \"visible\" is not specified");
        }
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Override
    public Dict toEntity() {
        return DictDraft.$.produce(__draft -> {
            __draft.setKeyId(keyId);
            __draft.setKeyEnName(keyEnName);
            __draft.setKeyName(keyName);
            __draft.setDictId(dictId);
            __draft.setDictName(dictName);
            __draft.setDictEnName(dictEnName);
            __draft.setOrderNum(orderNum);
            __draft.setVisible(visible);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(keyId);
        hash = hash * 31 + Objects.hashCode(keyEnName);
        hash = hash * 31 + Objects.hashCode(keyName);
        hash = hash * 31 + Objects.hashCode(dictId);
        hash = hash * 31 + Objects.hashCode(dictName);
        hash = hash * 31 + Objects.hashCode(dictEnName);
        hash = hash * 31 + Objects.hashCode(orderNum);
        hash = hash * 31 + Boolean.hashCode(visible);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictInput other = (DictInput) o;
        if (!Objects.equals(keyId, other.keyId)) {
            return false;
        }
        if (!Objects.equals(keyEnName, other.keyEnName)) {
            return false;
        }
        if (!Objects.equals(keyName, other.keyName)) {
            return false;
        }
        if (!Objects.equals(dictId, other.dictId)) {
            return false;
        }
        if (!Objects.equals(dictName, other.dictName)) {
            return false;
        }
        if (!Objects.equals(dictEnName, other.dictEnName)) {
            return false;
        }
        if (!Objects.equals(orderNum, other.orderNum)) {
            return false;
        }
        if (visible != other.visible) {
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
        builder.append("DictInput").append('(');
        builder.append("keyId=").append(keyId);
        builder.append(", keyEnName=").append(keyEnName);
        builder.append(", keyName=").append(keyName);
        builder.append(", dictId=").append(dictId);
        builder.append(", dictName=").append(dictName);
        builder.append(", dictEnName=").append(dictEnName);
        builder.append(", orderNum=").append(orderNum);
        builder.append(", visible=").append(visible);
        builder.append(", id=").append(id);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private Integer keyId;

        private String keyEnName;

        private String keyName;

        private Integer dictId;

        private String dictName;

        private String dictEnName;

        private Integer orderNum;

        private Boolean visible;

        private String id;

        public Builder keyId(Integer keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder keyEnName(String keyEnName) {
            this.keyEnName = Objects.requireNonNull(keyEnName, "The property \"keyEnName\" cannot be null");
            return this;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName, "The property \"keyName\" cannot be null");
            return this;
        }

        public Builder dictId(Integer dictId) {
            this.dictId = dictId;
            return this;
        }

        public Builder dictName(String dictName) {
            this.dictName = Objects.requireNonNull(dictName, "The property \"dictName\" cannot be null");
            return this;
        }

        public Builder dictEnName(String dictEnName) {
            this.dictEnName = Objects.requireNonNull(dictEnName, "The property \"dictEnName\" cannot be null");
            return this;
        }

        public Builder orderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }

        public Builder visible(boolean visible) {
            this.visible = Objects.requireNonNull(visible, "The property \"visible\" cannot be null");
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public DictInput build() {
            DictInput _input = new DictInput();
            _input.setKeyId(keyId);
            if (keyEnName == null) {
                throw Input.unknownNonNullProperty(DictInput.class, "keyEnName");
            }
            _input.setKeyEnName(keyEnName);
            if (keyName == null) {
                throw Input.unknownNonNullProperty(DictInput.class, "keyName");
            }
            _input.setKeyName(keyName);
            _input.setDictId(dictId);
            if (dictName == null) {
                throw Input.unknownNonNullProperty(DictInput.class, "dictName");
            }
            _input.setDictName(dictName);
            if (dictEnName == null) {
                throw Input.unknownNonNullProperty(DictInput.class, "dictEnName");
            }
            _input.setDictEnName(dictEnName);
            _input.setOrderNum(orderNum);
            if (visible == null) {
                throw Input.unknownNonNullProperty(DictInput.class, "visible");
            }
            _input.setVisible(visible);
            _input.setId(id);
            return _input;
        }
    }
}
