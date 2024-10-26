package kaigee.top.dict.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.qifan.infrastructure.generator.core.GenField;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Objects;
import kaigee.top.infrastructure.jimmer.BaseEntityDraft;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserDraft;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.Visibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        type = Dict.class
)
public interface DictDraft extends Dict, BaseEntityDraft {
    DictDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DictDraft setId(String id);

    @OldChain
    DictDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    DictDraft setEditedTime(LocalDateTime editedTime);

    UserDraft editor();

    UserDraft editor(boolean autoCreate);

    @OldChain
    DictDraft setEditor(User editor);

    @NotNull
    String editorId();

    @OldChain
    DictDraft setEditorId(@NotNull String editorId);

    @OldChain
    DictDraft applyEditor(DraftConsumer<UserDraft> block);

    @OldChain
    DictDraft applyEditor(User base, DraftConsumer<UserDraft> block);

    UserDraft creator();

    UserDraft creator(boolean autoCreate);

    @OldChain
    DictDraft setCreator(User creator);

    @NotNull
    String creatorId();

    @OldChain
    DictDraft setCreatorId(@NotNull String creatorId);

    @OldChain
    DictDraft applyCreator(DraftConsumer<UserDraft> block);

    @OldChain
    DictDraft applyCreator(User base, DraftConsumer<UserDraft> block);

    @OldChain
    DictDraft setKeyId(Integer keyId);

    @OldChain
    DictDraft setKeyEnName(String keyEnName);

    @OldChain
    DictDraft setKeyName(String keyName);

    @OldChain
    DictDraft setDictId(Integer dictId);

    @OldChain
    DictDraft setDictName(String dictName);

    @OldChain
    DictDraft setDictEnName(String dictEnName);

    @OldChain
    DictDraft setOrderNum(Integer orderNum);

    @OldChain
    DictDraft setVisible(boolean visible);

    @GeneratedBy(
            type = Dict.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_CREATED_TIME = 1;

        public static final int SLOT_EDITED_TIME = 2;

        public static final int SLOT_EDITOR = 3;

        public static final int SLOT_CREATOR = 4;

        public static final int SLOT_KEY_ID = 5;

        public static final int SLOT_KEY_EN_NAME = 6;

        public static final int SLOT_KEY_NAME = 7;

        public static final int SLOT_DICT_ID = 8;

        public static final int SLOT_DICT_NAME = 9;

        public static final int SLOT_DICT_EN_NAME = 10;

        public static final int SLOT_ORDER_NUM = 11;

        public static final int SLOT_VISIBLE = 12;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                Dict.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Dict)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("createdTime", SLOT_CREATED_TIME)
            .redefine("editedTime", SLOT_EDITED_TIME)
            .redefine("editor", SLOT_EDITOR)
            .redefine("creator", SLOT_CREATOR)
            .key(SLOT_KEY_ID, "keyId", Integer.class, true)
            .add(SLOT_KEY_EN_NAME, "keyEnName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_KEY_NAME, "keyName", ImmutablePropCategory.SCALAR, String.class, false)
            .key(SLOT_DICT_ID, "dictId", Integer.class, true)
            .add(SLOT_DICT_NAME, "dictName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_DICT_EN_NAME, "dictEnName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_ORDER_NUM, "orderNum", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(SLOT_VISIBLE, "visible", ImmutablePropCategory.SCALAR, boolean.class, false)
            .build();

        private Producer() {
        }

        public Dict produce(DraftConsumer<DictDraft> block) {
            return produce(null, block);
        }

        public Dict produce(Dict base, DraftConsumer<DictDraft> block) {
            return (Dict)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = Dict.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "createdTime", "editedTime", "editor", "creator", "keyId", "keyEnName", "keyName", "dictId", "dictName", "dictEnName", "orderNum", "visible"})
        public abstract static class Implementor implements Dict, ImmutableSpi {
            @Override
            public final Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_CREATED_TIME:
                    		return createdTime();
                    case SLOT_EDITED_TIME:
                    		return editedTime();
                    case SLOT_EDITOR:
                    		return editor();
                    case SLOT_CREATOR:
                    		return creator();
                    case SLOT_KEY_ID:
                    		return keyId();
                    case SLOT_KEY_EN_NAME:
                    		return keyEnName();
                    case SLOT_KEY_NAME:
                    		return keyName();
                    case SLOT_DICT_ID:
                    		return dictId();
                    case SLOT_DICT_NAME:
                    		return dictName();
                    case SLOT_DICT_EN_NAME:
                    		return dictEnName();
                    case SLOT_ORDER_NUM:
                    		return orderNum();
                    case SLOT_VISIBLE:
                    		return (Boolean)visible();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "createdTime":
                    		return createdTime();
                    case "editedTime":
                    		return editedTime();
                    case "editor":
                    		return editor();
                    case "creator":
                    		return creator();
                    case "keyId":
                    		return keyId();
                    case "keyEnName":
                    		return keyEnName();
                    case "keyName":
                    		return keyName();
                    case "dictId":
                    		return dictId();
                    case "dictName":
                    		return dictName();
                    case "dictEnName":
                    		return dictEnName();
                    case "orderNum":
                    		return orderNum();
                    case "visible":
                    		return (Boolean)visible();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\"");
                }
            }

            public final String getId() {
                return id();
            }

            public final LocalDateTime getCreatedTime() {
                return createdTime();
            }

            public final LocalDateTime getEditedTime() {
                return editedTime();
            }

            public final User getEditor() {
                return editor();
            }

            public final User getCreator() {
                return creator();
            }

            @GenField(
                    value = "值编号",
                    order = -1
            )
            public final Integer getKeyId() {
                return keyId();
            }

            @GenField(
                    value = "值英文名称",
                    order = 1
            )
            public final String getKeyEnName() {
                return keyEnName();
            }

            @GenField(
                    value = "值名称",
                    order = 0
            )
            public final String getKeyName() {
                return keyName();
            }

            @GenField(
                    value = "字典编号",
                    order = 2
            )
            public final Integer getDictId() {
                return dictId();
            }

            @GenField(
                    value = "字典名称",
                    order = 3
            )
            public final String getDictName() {
                return dictName();
            }

            @GenField(
                    value = "字段英文名称",
                    order = 4
            )
            public final String getDictEnName() {
                return dictEnName();
            }

            @GenField(
                    value = "排序号",
                    order = 5
            )
            public final Integer getOrderNum() {
                return orderNum();
            }

            @GenField(
                    value = "是否可见",
                    order = 6
            )
            public final boolean isVisible() {
                return visible();
            }

            @Override
            public final ImmutableType __type() {
                return TYPE;
            }

            public final int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = Dict.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            LocalDateTime __createdTimeValue;

            LocalDateTime __editedTimeValue;

            User __editorValue;

            User __creatorValue;

            Integer __keyIdValue;

            boolean __keyIdLoaded = false;

            String __keyEnNameValue;

            String __keyNameValue;

            Integer __dictIdValue;

            boolean __dictIdLoaded = false;

            String __dictNameValue;

            String __dictEnNameValue;

            Integer __orderNumValue;

            boolean __orderNumLoaded = false;

            boolean __visibleValue;

            boolean __visibleLoaded = false;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Dict.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                if (__createdTimeValue == null) {
                    throw new UnloadedException(Dict.class, "createdTime");
                }
                return __createdTimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                if (__editedTimeValue == null) {
                    throw new UnloadedException(Dict.class, "editedTime");
                }
                return __editedTimeValue;
            }

            @Override
            @JsonIgnore
            public User editor() {
                if (__editorValue == null) {
                    throw new UnloadedException(Dict.class, "editor");
                }
                return __editorValue;
            }

            @Override
            @JsonIgnore
            public User creator() {
                if (__creatorValue == null) {
                    throw new UnloadedException(Dict.class, "creator");
                }
                return __creatorValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer keyId() {
                if (!__keyIdLoaded) {
                    throw new UnloadedException(Dict.class, "keyId");
                }
                return __keyIdValue;
            }

            @Override
            @JsonIgnore
            public String keyEnName() {
                if (__keyEnNameValue == null) {
                    throw new UnloadedException(Dict.class, "keyEnName");
                }
                return __keyEnNameValue;
            }

            @Override
            @JsonIgnore
            public String keyName() {
                if (__keyNameValue == null) {
                    throw new UnloadedException(Dict.class, "keyName");
                }
                return __keyNameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer dictId() {
                if (!__dictIdLoaded) {
                    throw new UnloadedException(Dict.class, "dictId");
                }
                return __dictIdValue;
            }

            @Override
            @JsonIgnore
            public String dictName() {
                if (__dictNameValue == null) {
                    throw new UnloadedException(Dict.class, "dictName");
                }
                return __dictNameValue;
            }

            @Override
            @JsonIgnore
            public String dictEnName() {
                if (__dictEnNameValue == null) {
                    throw new UnloadedException(Dict.class, "dictEnName");
                }
                return __dictEnNameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer orderNum() {
                if (!__orderNumLoaded) {
                    throw new UnloadedException(Dict.class, "orderNum");
                }
                return __orderNumValue;
            }

            @Override
            @JsonIgnore
            public boolean visible() {
                if (!__visibleLoaded) {
                    throw new UnloadedException(Dict.class, "visible");
                }
                return __visibleValue;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_ID:
                    		return __idValue != null;
                    case SLOT_CREATED_TIME:
                    		return __createdTimeValue != null;
                    case SLOT_EDITED_TIME:
                    		return __editedTimeValue != null;
                    case SLOT_EDITOR:
                    		return __editorValue != null;
                    case SLOT_CREATOR:
                    		return __creatorValue != null;
                    case SLOT_KEY_ID:
                    		return __keyIdLoaded;
                    case SLOT_KEY_EN_NAME:
                    		return __keyEnNameValue != null;
                    case SLOT_KEY_NAME:
                    		return __keyNameValue != null;
                    case SLOT_DICT_ID:
                    		return __dictIdLoaded;
                    case SLOT_DICT_NAME:
                    		return __dictNameValue != null;
                    case SLOT_DICT_EN_NAME:
                    		return __dictEnNameValue != null;
                    case SLOT_ORDER_NUM:
                    		return __orderNumLoaded;
                    case SLOT_VISIBLE:
                    		return __visibleLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "createdTime":
                    		return __createdTimeValue != null;
                    case "editedTime":
                    		return __editedTimeValue != null;
                    case "editor":
                    		return __editorValue != null;
                    case "creator":
                    		return __creatorValue != null;
                    case "keyId":
                    		return __keyIdLoaded;
                    case "keyEnName":
                    		return __keyEnNameValue != null;
                    case "keyName":
                    		return __keyNameValue != null;
                    case "dictId":
                    		return __dictIdLoaded;
                    case "dictName":
                    		return __dictNameValue != null;
                    case "dictEnName":
                    		return __dictEnNameValue != null;
                    case "orderNum":
                    		return __orderNumLoaded;
                    case "visible":
                    		return __visibleLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
                    case SLOT_CREATED_TIME:
                    		return __visibility.visible(SLOT_CREATED_TIME);
                    case SLOT_EDITED_TIME:
                    		return __visibility.visible(SLOT_EDITED_TIME);
                    case SLOT_EDITOR:
                    		return __visibility.visible(SLOT_EDITOR);
                    case SLOT_CREATOR:
                    		return __visibility.visible(SLOT_CREATOR);
                    case SLOT_KEY_ID:
                    		return __visibility.visible(SLOT_KEY_ID);
                    case SLOT_KEY_EN_NAME:
                    		return __visibility.visible(SLOT_KEY_EN_NAME);
                    case SLOT_KEY_NAME:
                    		return __visibility.visible(SLOT_KEY_NAME);
                    case SLOT_DICT_ID:
                    		return __visibility.visible(SLOT_DICT_ID);
                    case SLOT_DICT_NAME:
                    		return __visibility.visible(SLOT_DICT_NAME);
                    case SLOT_DICT_EN_NAME:
                    		return __visibility.visible(SLOT_DICT_EN_NAME);
                    case SLOT_ORDER_NUM:
                    		return __visibility.visible(SLOT_ORDER_NUM);
                    case SLOT_VISIBLE:
                    		return __visibility.visible(SLOT_VISIBLE);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "id":
                    		return __visibility.visible(SLOT_ID);
                    case "createdTime":
                    		return __visibility.visible(SLOT_CREATED_TIME);
                    case "editedTime":
                    		return __visibility.visible(SLOT_EDITED_TIME);
                    case "editor":
                    		return __visibility.visible(SLOT_EDITOR);
                    case "creator":
                    		return __visibility.visible(SLOT_CREATOR);
                    case "keyId":
                    		return __visibility.visible(SLOT_KEY_ID);
                    case "keyEnName":
                    		return __visibility.visible(SLOT_KEY_EN_NAME);
                    case "keyName":
                    		return __visibility.visible(SLOT_KEY_NAME);
                    case "dictId":
                    		return __visibility.visible(SLOT_DICT_ID);
                    case "dictName":
                    		return __visibility.visible(SLOT_DICT_NAME);
                    case "dictEnName":
                    		return __visibility.visible(SLOT_DICT_EN_NAME);
                    case "orderNum":
                    		return __visibility.visible(SLOT_ORDER_NUM);
                    case "visible":
                    		return __visibility.visible(SLOT_VISIBLE);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + __idValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__createdTimeValue != null) {
                    hash = 31 * hash + __createdTimeValue.hashCode();
                }
                if (__editedTimeValue != null) {
                    hash = 31 * hash + __editedTimeValue.hashCode();
                }
                if (__editorValue != null) {
                    hash = 31 * hash + __editorValue.hashCode();
                }
                if (__creatorValue != null) {
                    hash = 31 * hash + __creatorValue.hashCode();
                }
                if (__keyIdLoaded && __keyIdValue != null) {
                    hash = 31 * hash + __keyIdValue.hashCode();
                }
                if (__keyEnNameValue != null) {
                    hash = 31 * hash + __keyEnNameValue.hashCode();
                }
                if (__keyNameValue != null) {
                    hash = 31 * hash + __keyNameValue.hashCode();
                }
                if (__dictIdLoaded && __dictIdValue != null) {
                    hash = 31 * hash + __dictIdValue.hashCode();
                }
                if (__dictNameValue != null) {
                    hash = 31 * hash + __dictNameValue.hashCode();
                }
                if (__dictEnNameValue != null) {
                    hash = 31 * hash + __dictEnNameValue.hashCode();
                }
                if (__orderNumLoaded && __orderNumValue != null) {
                    hash = 31 * hash + __orderNumValue.hashCode();
                }
                if (__visibleLoaded) {
                    hash = 31 * hash + Boolean.hashCode(__visibleValue);
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__createdTimeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createdTimeValue);
                }
                if (__editedTimeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__editedTimeValue);
                }
                if (__editorValue != null) {
                    hash = 31 * hash + System.identityHashCode(__editorValue);
                }
                if (__creatorValue != null) {
                    hash = 31 * hash + System.identityHashCode(__creatorValue);
                }
                if (__keyIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(__keyIdValue);
                }
                if (__keyEnNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__keyEnNameValue);
                }
                if (__keyNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__keyNameValue);
                }
                if (__dictIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(__dictIdValue);
                }
                if (__dictNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__dictNameValue);
                }
                if (__dictEnNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__dictEnNameValue);
                }
                if (__orderNumLoaded) {
                    hash = 31 * hash + System.identityHashCode(__orderNumValue);
                }
                if (__visibleLoaded) {
                    hash = 31 * hash + Boolean.hashCode(__visibleValue);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__idValue, __other.id());
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                boolean __createdTimeLoaded = __createdTimeValue != null;
                if (__createdTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                if (__createdTimeLoaded && !Objects.equals(__createdTimeValue, __other.createdTime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                boolean __editedTimeLoaded = __editedTimeValue != null;
                if (__editedTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                if (__editedTimeLoaded && !Objects.equals(__editedTimeValue, __other.editedTime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITOR)) != __other.__isVisible(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                boolean __editorLoaded = __editorValue != null;
                if (__editorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                if (__editorLoaded && !Objects.equals(__editorValue, __other.editor())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATOR)) != __other.__isVisible(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                boolean __creatorLoaded = __creatorValue != null;
                if (__creatorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                if (__creatorLoaded && !Objects.equals(__creatorValue, __other.creator())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_KEY_ID)) != __other.__isVisible(PropId.byIndex(SLOT_KEY_ID))) {
                    return false;
                }
                boolean __keyIdLoaded = this.__keyIdLoaded;
                if (__keyIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_KEY_ID))) {
                    return false;
                }
                if (__keyIdLoaded && !Objects.equals(__keyIdValue, __other.keyId())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_KEY_EN_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_KEY_EN_NAME))) {
                    return false;
                }
                boolean __keyEnNameLoaded = __keyEnNameValue != null;
                if (__keyEnNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_KEY_EN_NAME))) {
                    return false;
                }
                if (__keyEnNameLoaded && !Objects.equals(__keyEnNameValue, __other.keyEnName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_KEY_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_KEY_NAME))) {
                    return false;
                }
                boolean __keyNameLoaded = __keyNameValue != null;
                if (__keyNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_KEY_NAME))) {
                    return false;
                }
                if (__keyNameLoaded && !Objects.equals(__keyNameValue, __other.keyName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_ID))) {
                    return false;
                }
                boolean __dictIdLoaded = this.__dictIdLoaded;
                if (__dictIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_ID))) {
                    return false;
                }
                if (__dictIdLoaded && !Objects.equals(__dictIdValue, __other.dictId())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                boolean __dictNameLoaded = __dictNameValue != null;
                if (__dictNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                if (__dictNameLoaded && !Objects.equals(__dictNameValue, __other.dictName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_EN_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_EN_NAME))) {
                    return false;
                }
                boolean __dictEnNameLoaded = __dictEnNameValue != null;
                if (__dictEnNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_EN_NAME))) {
                    return false;
                }
                if (__dictEnNameLoaded && !Objects.equals(__dictEnNameValue, __other.dictEnName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ORDER_NUM)) != __other.__isVisible(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                boolean __orderNumLoaded = this.__orderNumLoaded;
                if (__orderNumLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                if (__orderNumLoaded && !Objects.equals(__orderNumValue, __other.orderNum())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_VISIBLE)) != __other.__isVisible(PropId.byIndex(SLOT_VISIBLE))) {
                    return false;
                }
                boolean __visibleLoaded = this.__visibleLoaded;
                if (__visibleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_VISIBLE))) {
                    return false;
                }
                if (__visibleLoaded && __visibleValue != __other.visible()) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded && __idValue != __other.id()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                boolean __createdTimeLoaded = __createdTimeValue != null;
                if (__createdTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATED_TIME))) {
                    return false;
                }
                if (__createdTimeLoaded && __createdTimeValue != __other.createdTime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITED_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                boolean __editedTimeLoaded = __editedTimeValue != null;
                if (__editedTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITED_TIME))) {
                    return false;
                }
                if (__editedTimeLoaded && __editedTimeValue != __other.editedTime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EDITOR)) != __other.__isVisible(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                boolean __editorLoaded = __editorValue != null;
                if (__editorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EDITOR))) {
                    return false;
                }
                if (__editorLoaded && __editorValue != __other.editor()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATOR)) != __other.__isVisible(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                boolean __creatorLoaded = __creatorValue != null;
                if (__creatorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATOR))) {
                    return false;
                }
                if (__creatorLoaded && __creatorValue != __other.creator()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_KEY_ID)) != __other.__isVisible(PropId.byIndex(SLOT_KEY_ID))) {
                    return false;
                }
                boolean __keyIdLoaded = this.__keyIdLoaded;
                if (__keyIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_KEY_ID))) {
                    return false;
                }
                if (__keyIdLoaded && __keyIdValue != __other.keyId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_KEY_EN_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_KEY_EN_NAME))) {
                    return false;
                }
                boolean __keyEnNameLoaded = __keyEnNameValue != null;
                if (__keyEnNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_KEY_EN_NAME))) {
                    return false;
                }
                if (__keyEnNameLoaded && __keyEnNameValue != __other.keyEnName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_KEY_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_KEY_NAME))) {
                    return false;
                }
                boolean __keyNameLoaded = __keyNameValue != null;
                if (__keyNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_KEY_NAME))) {
                    return false;
                }
                if (__keyNameLoaded && __keyNameValue != __other.keyName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_ID))) {
                    return false;
                }
                boolean __dictIdLoaded = this.__dictIdLoaded;
                if (__dictIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_ID))) {
                    return false;
                }
                if (__dictIdLoaded && __dictIdValue != __other.dictId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                boolean __dictNameLoaded = __dictNameValue != null;
                if (__dictNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                if (__dictNameLoaded && __dictNameValue != __other.dictName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_EN_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_EN_NAME))) {
                    return false;
                }
                boolean __dictEnNameLoaded = __dictEnNameValue != null;
                if (__dictEnNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_EN_NAME))) {
                    return false;
                }
                if (__dictEnNameLoaded && __dictEnNameValue != __other.dictEnName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ORDER_NUM)) != __other.__isVisible(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                boolean __orderNumLoaded = this.__orderNumLoaded;
                if (__orderNumLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ORDER_NUM))) {
                    return false;
                }
                if (__orderNumLoaded && __orderNumValue != __other.orderNum()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_VISIBLE)) != __other.__isVisible(PropId.byIndex(SLOT_VISIBLE))) {
                    return false;
                }
                boolean __visibleLoaded = this.__visibleLoaded;
                if (__visibleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_VISIBLE))) {
                    return false;
                }
                if (__visibleLoaded && __visibleValue != __other.visible()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        @GeneratedBy(
                type = Dict.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, DictDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private Dict __resolved;

            DraftImpl(DraftContext ctx, Dict base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public DictDraft setId(String id) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__idValue = id;
                return this;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                return (__modified!= null ? __modified : __base).createdTime();
            }

            @Override
            public DictDraft setCreatedTime(LocalDateTime createdTime) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (createdTime == null) {
                    throw new IllegalArgumentException(
                        "'createdTime' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createdTimeValue = createdTime;
                return this;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                return (__modified!= null ? __modified : __base).editedTime();
            }

            @Override
            public DictDraft setEditedTime(LocalDateTime editedTime) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (editedTime == null) {
                    throw new IllegalArgumentException(
                        "'editedTime' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__editedTimeValue = editedTime;
                return this;
            }

            @Override
            @JsonIgnore
            public UserDraft editor() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).editor());
            }

            @Override
            public UserDraft editor(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_EDITOR)))) {
                    setEditor(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).editor());
            }

            @Override
            public DictDraft setEditor(User editor) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (editor == null) {
                    throw new IllegalArgumentException(
                        "'editor' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__editorValue = editor;
                return this;
            }

            @NotNull
            @Override
            public String editorId() {
                return editor().id();
            }

            @OldChain
            @Override
            public DictDraft setEditorId(@NotNull String editorId) {
                editor(true).setId(Objects.requireNonNull(editorId, "\"editor\" cannot be null"));
                return this;
            }

            @Override
            public DictDraft applyEditor(DraftConsumer<UserDraft> block) {
                applyEditor(null, block);
                return this;
            }

            @Override
            public DictDraft applyEditor(User base, DraftConsumer<UserDraft> block) {
                setEditor(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public UserDraft creator() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).creator());
            }

            @Override
            public UserDraft creator(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_CREATOR)))) {
                    setCreator(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).creator());
            }

            @Override
            public DictDraft setCreator(User creator) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (creator == null) {
                    throw new IllegalArgumentException(
                        "'creator' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__creatorValue = creator;
                return this;
            }

            @NotNull
            @Override
            public String creatorId() {
                return creator().id();
            }

            @OldChain
            @Override
            public DictDraft setCreatorId(@NotNull String creatorId) {
                creator(true).setId(Objects.requireNonNull(creatorId, "\"creator\" cannot be null"));
                return this;
            }

            @Override
            public DictDraft applyCreator(DraftConsumer<UserDraft> block) {
                applyCreator(null, block);
                return this;
            }

            @Override
            public DictDraft applyCreator(User base, DraftConsumer<UserDraft> block) {
                setCreator(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer keyId() {
                return (__modified!= null ? __modified : __base).keyId();
            }

            @Override
            public DictDraft setKeyId(Integer keyId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__keyIdValue = keyId;
                __tmpModified.__keyIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String keyEnName() {
                return (__modified!= null ? __modified : __base).keyEnName();
            }

            @Override
            public DictDraft setKeyEnName(String keyEnName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (keyEnName == null) {
                    throw new IllegalArgumentException(
                        "'keyEnName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__keyEnNameValue = keyEnName;
                return this;
            }

            @Override
            @JsonIgnore
            public String keyName() {
                return (__modified!= null ? __modified : __base).keyName();
            }

            @Override
            public DictDraft setKeyName(String keyName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (keyName == null) {
                    throw new IllegalArgumentException(
                        "'keyName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__keyNameValue = keyName;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer dictId() {
                return (__modified!= null ? __modified : __base).dictId();
            }

            @Override
            public DictDraft setDictId(Integer dictId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictIdValue = dictId;
                __tmpModified.__dictIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String dictName() {
                return (__modified!= null ? __modified : __base).dictName();
            }

            @Override
            public DictDraft setDictName(String dictName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (dictName == null) {
                    throw new IllegalArgumentException(
                        "'dictName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictNameValue = dictName;
                return this;
            }

            @Override
            @JsonIgnore
            public String dictEnName() {
                return (__modified!= null ? __modified : __base).dictEnName();
            }

            @Override
            public DictDraft setDictEnName(String dictEnName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (dictEnName == null) {
                    throw new IllegalArgumentException(
                        "'dictEnName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictEnNameValue = dictEnName;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer orderNum() {
                return (__modified!= null ? __modified : __base).orderNum();
            }

            @Override
            public DictDraft setOrderNum(Integer orderNum) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__orderNumValue = orderNum;
                __tmpModified.__orderNumLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public boolean visible() {
                return (__modified!= null ? __modified : __base).visible();
            }

            @Override
            public DictDraft setVisible(boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__visibleValue = visible;
                __tmpModified.__visibleLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_CREATED_TIME:
                    		setCreatedTime((LocalDateTime)value);break;
                    case SLOT_EDITED_TIME:
                    		setEditedTime((LocalDateTime)value);break;
                    case SLOT_EDITOR:
                    		setEditor((User)value);break;
                    case SLOT_CREATOR:
                    		setCreator((User)value);break;
                    case SLOT_KEY_ID:
                    		setKeyId((Integer)value);break;
                    case SLOT_KEY_EN_NAME:
                    		setKeyEnName((String)value);break;
                    case SLOT_KEY_NAME:
                    		setKeyName((String)value);break;
                    case SLOT_DICT_ID:
                    		setDictId((Integer)value);break;
                    case SLOT_DICT_NAME:
                    		setDictName((String)value);break;
                    case SLOT_DICT_EN_NAME:
                    		setDictEnName((String)value);break;
                    case SLOT_ORDER_NUM:
                    		setOrderNum((Integer)value);break;
                    case SLOT_VISIBLE:
                    		if (value == null) throw new IllegalArgumentException("'visible' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setVisible((Boolean)value);
                            break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "createdTime":
                    		setCreatedTime((LocalDateTime)value);break;
                    case "editedTime":
                    		setEditedTime((LocalDateTime)value);break;
                    case "editor":
                    		setEditor((User)value);break;
                    case "creator":
                    		setCreator((User)value);break;
                    case "keyId":
                    		setKeyId((Integer)value);break;
                    case "keyEnName":
                    		setKeyEnName((String)value);break;
                    case "keyName":
                    		setKeyName((String)value);break;
                    case "dictId":
                    		setDictId((Integer)value);break;
                    case "dictName":
                    		setDictName((String)value);break;
                    case "dictEnName":
                    		setDictEnName((String)value);break;
                    case "orderNum":
                    		setOrderNum((Integer)value);break;
                    case "visible":
                    		if (value == null) throw new IllegalArgumentException("'visible' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setVisible((Boolean)value);
                            break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(13);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_CREATED_TIME:
                    		__visibility.show(SLOT_CREATED_TIME, visible);break;
                    case SLOT_EDITED_TIME:
                    		__visibility.show(SLOT_EDITED_TIME, visible);break;
                    case SLOT_EDITOR:
                    		__visibility.show(SLOT_EDITOR, visible);break;
                    case SLOT_CREATOR:
                    		__visibility.show(SLOT_CREATOR, visible);break;
                    case SLOT_KEY_ID:
                    		__visibility.show(SLOT_KEY_ID, visible);break;
                    case SLOT_KEY_EN_NAME:
                    		__visibility.show(SLOT_KEY_EN_NAME, visible);break;
                    case SLOT_KEY_NAME:
                    		__visibility.show(SLOT_KEY_NAME, visible);break;
                    case SLOT_DICT_ID:
                    		__visibility.show(SLOT_DICT_ID, visible);break;
                    case SLOT_DICT_NAME:
                    		__visibility.show(SLOT_DICT_NAME, visible);break;
                    case SLOT_DICT_EN_NAME:
                    		__visibility.show(SLOT_DICT_EN_NAME, visible);break;
                    case SLOT_ORDER_NUM:
                    		__visibility.show(SLOT_ORDER_NUM, visible);break;
                    case SLOT_VISIBLE:
                    		__visibility.show(SLOT_VISIBLE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"kaigee.top.dict.entity.Dict\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(13);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "createdTime":
                    		__visibility.show(SLOT_CREATED_TIME, visible);break;
                    case "editedTime":
                    		__visibility.show(SLOT_EDITED_TIME, visible);break;
                    case "editor":
                    		__visibility.show(SLOT_EDITOR, visible);break;
                    case "creator":
                    		__visibility.show(SLOT_CREATOR, visible);break;
                    case "keyId":
                    		__visibility.show(SLOT_KEY_ID, visible);break;
                    case "keyEnName":
                    		__visibility.show(SLOT_KEY_EN_NAME, visible);break;
                    case "keyName":
                    		__visibility.show(SLOT_KEY_NAME, visible);break;
                    case "dictId":
                    		__visibility.show(SLOT_DICT_ID, visible);break;
                    case "dictName":
                    		__visibility.show(SLOT_DICT_NAME, visible);break;
                    case "dictEnName":
                    		__visibility.show(SLOT_DICT_EN_NAME, visible);break;
                    case "orderNum":
                    		__visibility.show(SLOT_ORDER_NUM, visible);break;
                    case "visible":
                    		__visibility.show(SLOT_VISIBLE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_CREATED_TIME:
                    		__modified().__createdTimeValue = null;break;
                    case SLOT_EDITED_TIME:
                    		__modified().__editedTimeValue = null;break;
                    case SLOT_EDITOR:
                    		__modified().__editorValue = null;break;
                    case SLOT_CREATOR:
                    		__modified().__creatorValue = null;break;
                    case SLOT_KEY_ID:
                    		__modified().__keyIdLoaded = false;break;
                    case SLOT_KEY_EN_NAME:
                    		__modified().__keyEnNameValue = null;break;
                    case SLOT_KEY_NAME:
                    		__modified().__keyNameValue = null;break;
                    case SLOT_DICT_ID:
                    		__modified().__dictIdLoaded = false;break;
                    case SLOT_DICT_NAME:
                    		__modified().__dictNameValue = null;break;
                    case SLOT_DICT_EN_NAME:
                    		__modified().__dictEnNameValue = null;break;
                    case SLOT_ORDER_NUM:
                    		__modified().__orderNumLoaded = false;break;
                    case SLOT_VISIBLE:
                    		__modified().__visibleLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "createdTime":
                    		__modified().__createdTimeValue = null;break;
                    case "editedTime":
                    		__modified().__editedTimeValue = null;break;
                    case "editor":
                    		__modified().__editorValue = null;break;
                    case "creator":
                    		__modified().__creatorValue = null;break;
                    case "keyId":
                    		__modified().__keyIdLoaded = false;break;
                    case "keyEnName":
                    		__modified().__keyEnNameValue = null;break;
                    case "keyName":
                    		__modified().__keyNameValue = null;break;
                    case "dictId":
                    		__modified().__dictIdLoaded = false;break;
                    case "dictName":
                    		__modified().__dictNameValue = null;break;
                    case "dictEnName":
                    		__modified().__dictEnNameValue = null;break;
                    case "orderNum":
                    		__modified().__orderNumLoaded = false;break;
                    case "visible":
                    		__modified().__visibleLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.dict.entity.Dict\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolved != null) {
                    return __resolved;
                }
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_EDITOR))) {
                            User oldValue = base.editor();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setEditor(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_CREATOR))) {
                            User oldValue = base.creator();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setCreator(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__editorValue = __ctx.resolveObject(__tmpModified.__editorValue);
                        __tmpModified.__creatorValue = __ctx.resolveObject(__tmpModified.__creatorValue);
                    }
                    if (__base != null && __tmpModified == null) {
                        this.__resolved = base;
                        return base;
                    }
                    this.__resolved = __tmpModified;
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            @Override
            public boolean __isResolved() {
                return __resolved != null;
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = Dict.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        public Builder createdTime(LocalDateTime createdTime) {
            if (createdTime != null) {
                __draft.setCreatedTime(createdTime);
            }
            return this;
        }

        public Builder editedTime(LocalDateTime editedTime) {
            if (editedTime != null) {
                __draft.setEditedTime(editedTime);
            }
            return this;
        }

        public Builder editor(User editor) {
            if (editor != null) {
                __draft.setEditor(editor);
            }
            return this;
        }

        public Builder creator(User creator) {
            if (creator != null) {
                __draft.setCreator(creator);
            }
            return this;
        }

        @GenField(
                value = "值编号",
                order = -1
        )
        public Builder keyId(Integer keyId) {
            __draft.setKeyId(keyId);
            return this;
        }

        @GenField(
                value = "值英文名称",
                order = 1
        )
        public Builder keyEnName(String keyEnName) {
            if (keyEnName != null) {
                __draft.setKeyEnName(keyEnName);
            }
            return this;
        }

        @GenField(
                value = "值名称",
                order = 0
        )
        public Builder keyName(String keyName) {
            if (keyName != null) {
                __draft.setKeyName(keyName);
            }
            return this;
        }

        @GenField(
                value = "字典编号",
                order = 2
        )
        public Builder dictId(Integer dictId) {
            __draft.setDictId(dictId);
            return this;
        }

        @GenField(
                value = "字典名称",
                order = 3
        )
        public Builder dictName(String dictName) {
            if (dictName != null) {
                __draft.setDictName(dictName);
            }
            return this;
        }

        @GenField(
                value = "字段英文名称",
                order = 4
        )
        public Builder dictEnName(String dictEnName) {
            if (dictEnName != null) {
                __draft.setDictEnName(dictEnName);
            }
            return this;
        }

        @GenField(
                value = "排序号",
                order = 5
        )
        public Builder orderNum(Integer orderNum) {
            __draft.setOrderNum(orderNum);
            return this;
        }

        @GenField(
                value = "是否可见",
                order = 6
        )
        public Builder visible(Boolean visible) {
            if (visible != null) {
                __draft.setVisible(visible);
            }
            return this;
        }

        public Dict build() {
            return (Dict)__draft.__modified();
        }
    }
}
