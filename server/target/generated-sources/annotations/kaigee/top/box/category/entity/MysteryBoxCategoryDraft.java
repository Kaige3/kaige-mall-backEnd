package kaigee.top.box.category.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import jakarta.validation.constraints.Null;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
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
        type = MysteryBoxCategory.class
)
public interface MysteryBoxCategoryDraft extends MysteryBoxCategory, BaseEntityDraft {
    MysteryBoxCategoryDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    MysteryBoxCategoryDraft setId(String id);

    @OldChain
    MysteryBoxCategoryDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    MysteryBoxCategoryDraft setEditedTime(LocalDateTime editedTime);

    UserDraft editor();

    UserDraft editor(boolean autoCreate);

    @OldChain
    MysteryBoxCategoryDraft setEditor(User editor);

    @NotNull
    String editorId();

    @OldChain
    MysteryBoxCategoryDraft setEditorId(@NotNull String editorId);

    @OldChain
    MysteryBoxCategoryDraft applyEditor(DraftConsumer<UserDraft> block);

    @OldChain
    MysteryBoxCategoryDraft applyEditor(User base, DraftConsumer<UserDraft> block);

    UserDraft creator();

    UserDraft creator(boolean autoCreate);

    @OldChain
    MysteryBoxCategoryDraft setCreator(User creator);

    @NotNull
    String creatorId();

    @OldChain
    MysteryBoxCategoryDraft setCreatorId(@NotNull String creatorId);

    @OldChain
    MysteryBoxCategoryDraft applyCreator(DraftConsumer<UserDraft> block);

    @OldChain
    MysteryBoxCategoryDraft applyCreator(User base, DraftConsumer<UserDraft> block);

    @OldChain
    MysteryBoxCategoryDraft setName(String name);

    @OldChain
    MysteryBoxCategoryDraft setIcon(String icon);

    @OldChain
    MysteryBoxCategoryDraft setDescription(String description);

    @OldChain
    MysteryBoxCategoryDraft setSortOrder(Integer sortOrder);

    @GeneratedBy(
            type = MysteryBoxCategory.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_CREATED_TIME = 1;

        public static final int SLOT_EDITED_TIME = 2;

        public static final int SLOT_EDITOR = 3;

        public static final int SLOT_CREATOR = 4;

        public static final int SLOT_NAME = 5;

        public static final int SLOT_ICON = 6;

        public static final int SLOT_DESCRIPTION = 7;

        public static final int SLOT_SORT_ORDER = 8;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                MysteryBoxCategory.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (MysteryBoxCategory)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("createdTime", SLOT_CREATED_TIME)
            .redefine("editedTime", SLOT_EDITED_TIME)
            .redefine("editor", SLOT_EDITOR)
            .redefine("creator", SLOT_CREATOR)
            .add(SLOT_NAME, "name", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_ICON, "icon", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_DESCRIPTION, "description", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_SORT_ORDER, "sortOrder", ImmutablePropCategory.SCALAR, Integer.class, true)
            .build();

        private Producer() {
        }

        public MysteryBoxCategory produce(DraftConsumer<MysteryBoxCategoryDraft> block) {
            return produce(null, block);
        }

        public MysteryBoxCategory produce(MysteryBoxCategory base,
                DraftConsumer<MysteryBoxCategoryDraft> block) {
            return (MysteryBoxCategory)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = MysteryBoxCategory.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "createdTime", "editedTime", "editor", "creator", "name", "icon", "description", "sortOrder"})
        public abstract static class Implementor implements MysteryBoxCategory, ImmutableSpi {
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
                    case SLOT_NAME:
                    		return name();
                    case SLOT_ICON:
                    		return icon();
                    case SLOT_DESCRIPTION:
                    		return description();
                    case SLOT_SORT_ORDER:
                    		return sortOrder();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\"");
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
                    case "name":
                    		return name();
                    case "icon":
                    		return icon();
                    case "description":
                    		return description();
                    case "sortOrder":
                    		return sortOrder();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\"");
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

            @Null
            @GenField(
                    value = "类别名称",
                    order = 0
            )
            public final String getName() {
                return name();
            }

            @Null
            @GenField(
                    value = "类别图标",
                    type = ItemType.PICTURE,
                    order = 1
            )
            public final String getIcon() {
                return icon();
            }

            @Null
            @GenField(
                    value = "描述",
                    order = 2
            )
            public final String getDescription() {
                return description();
            }

            @Null
            @GenField(
                    value = "排序",
                    order = 3
            )
            public final Integer getSortOrder() {
                return sortOrder();
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
                type = MysteryBoxCategory.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            LocalDateTime __createdTimeValue;

            LocalDateTime __editedTimeValue;

            User __editorValue;

            User __creatorValue;

            String __nameValue;

            boolean __nameLoaded = false;

            String __iconValue;

            boolean __iconLoaded = false;

            String __descriptionValue;

            boolean __descriptionLoaded = false;

            Integer __sortOrderValue;

            boolean __sortOrderLoaded = false;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(MysteryBoxCategory.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                if (__createdTimeValue == null) {
                    throw new UnloadedException(MysteryBoxCategory.class, "createdTime");
                }
                return __createdTimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                if (__editedTimeValue == null) {
                    throw new UnloadedException(MysteryBoxCategory.class, "editedTime");
                }
                return __editedTimeValue;
            }

            @Override
            @JsonIgnore
            public User editor() {
                if (__editorValue == null) {
                    throw new UnloadedException(MysteryBoxCategory.class, "editor");
                }
                return __editorValue;
            }

            @Override
            @JsonIgnore
            public User creator() {
                if (__creatorValue == null) {
                    throw new UnloadedException(MysteryBoxCategory.class, "creator");
                }
                return __creatorValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String name() {
                if (!__nameLoaded) {
                    throw new UnloadedException(MysteryBoxCategory.class, "name");
                }
                return __nameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String icon() {
                if (!__iconLoaded) {
                    throw new UnloadedException(MysteryBoxCategory.class, "icon");
                }
                return __iconValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String description() {
                if (!__descriptionLoaded) {
                    throw new UnloadedException(MysteryBoxCategory.class, "description");
                }
                return __descriptionValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer sortOrder() {
                if (!__sortOrderLoaded) {
                    throw new UnloadedException(MysteryBoxCategory.class, "sortOrder");
                }
                return __sortOrderValue;
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
                    case SLOT_NAME:
                    		return __nameLoaded;
                    case SLOT_ICON:
                    		return __iconLoaded;
                    case SLOT_DESCRIPTION:
                    		return __descriptionLoaded;
                    case SLOT_SORT_ORDER:
                    		return __sortOrderLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\"");
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
                    case "name":
                    		return __nameLoaded;
                    case "icon":
                    		return __iconLoaded;
                    case "description":
                    		return __descriptionLoaded;
                    case "sortOrder":
                    		return __sortOrderLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\"");
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
                    case SLOT_NAME:
                    		return __visibility.visible(SLOT_NAME);
                    case SLOT_ICON:
                    		return __visibility.visible(SLOT_ICON);
                    case SLOT_DESCRIPTION:
                    		return __visibility.visible(SLOT_DESCRIPTION);
                    case SLOT_SORT_ORDER:
                    		return __visibility.visible(SLOT_SORT_ORDER);
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
                    case "name":
                    		return __visibility.visible(SLOT_NAME);
                    case "icon":
                    		return __visibility.visible(SLOT_ICON);
                    case "description":
                    		return __visibility.visible(SLOT_DESCRIPTION);
                    case "sortOrder":
                    		return __visibility.visible(SLOT_SORT_ORDER);
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
                if (__nameLoaded && __nameValue != null) {
                    hash = 31 * hash + __nameValue.hashCode();
                }
                if (__iconLoaded && __iconValue != null) {
                    hash = 31 * hash + __iconValue.hashCode();
                }
                if (__descriptionLoaded && __descriptionValue != null) {
                    hash = 31 * hash + __descriptionValue.hashCode();
                }
                if (__sortOrderLoaded && __sortOrderValue != null) {
                    hash = 31 * hash + __sortOrderValue.hashCode();
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
                if (__nameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__nameValue);
                }
                if (__iconLoaded) {
                    hash = 31 * hash + System.identityHashCode(__iconValue);
                }
                if (__descriptionLoaded) {
                    hash = 31 * hash + System.identityHashCode(__descriptionValue);
                }
                if (__sortOrderLoaded) {
                    hash = 31 * hash + System.identityHashCode(__sortOrderValue);
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
                if (__isVisible(PropId.byIndex(SLOT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                boolean __nameLoaded = this.__nameLoaded;
                if (__nameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                if (__nameLoaded && !Objects.equals(__nameValue, __other.name())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ICON)) != __other.__isVisible(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                boolean __iconLoaded = this.__iconLoaded;
                if (__iconLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                if (__iconLoaded && !Objects.equals(__iconValue, __other.icon())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DESCRIPTION)) != __other.__isVisible(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                boolean __descriptionLoaded = this.__descriptionLoaded;
                if (__descriptionLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                if (__descriptionLoaded && !Objects.equals(__descriptionValue, __other.description())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SORT_ORDER)) != __other.__isVisible(PropId.byIndex(SLOT_SORT_ORDER))) {
                    return false;
                }
                boolean __sortOrderLoaded = this.__sortOrderLoaded;
                if (__sortOrderLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SORT_ORDER))) {
                    return false;
                }
                if (__sortOrderLoaded && !Objects.equals(__sortOrderValue, __other.sortOrder())) {
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
                if (__isVisible(PropId.byIndex(SLOT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                boolean __nameLoaded = this.__nameLoaded;
                if (__nameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                if (__nameLoaded && __nameValue != __other.name()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ICON)) != __other.__isVisible(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                boolean __iconLoaded = this.__iconLoaded;
                if (__iconLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ICON))) {
                    return false;
                }
                if (__iconLoaded && __iconValue != __other.icon()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DESCRIPTION)) != __other.__isVisible(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                boolean __descriptionLoaded = this.__descriptionLoaded;
                if (__descriptionLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                if (__descriptionLoaded && __descriptionValue != __other.description()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SORT_ORDER)) != __other.__isVisible(PropId.byIndex(SLOT_SORT_ORDER))) {
                    return false;
                }
                boolean __sortOrderLoaded = this.__sortOrderLoaded;
                if (__sortOrderLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SORT_ORDER))) {
                    return false;
                }
                if (__sortOrderLoaded && __sortOrderValue != __other.sortOrder()) {
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
                type = MysteryBoxCategory.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, MysteryBoxCategoryDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private MysteryBoxCategory __resolved;

            DraftImpl(DraftContext ctx, MysteryBoxCategory base) {
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
            public MysteryBoxCategoryDraft setId(String id) {
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
            public MysteryBoxCategoryDraft setCreatedTime(LocalDateTime createdTime) {
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
            public MysteryBoxCategoryDraft setEditedTime(LocalDateTime editedTime) {
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
            public MysteryBoxCategoryDraft setEditor(User editor) {
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
            public MysteryBoxCategoryDraft setEditorId(@NotNull String editorId) {
                editor(true).setId(Objects.requireNonNull(editorId, "\"editor\" cannot be null"));
                return this;
            }

            @Override
            public MysteryBoxCategoryDraft applyEditor(DraftConsumer<UserDraft> block) {
                applyEditor(null, block);
                return this;
            }

            @Override
            public MysteryBoxCategoryDraft applyEditor(User base, DraftConsumer<UserDraft> block) {
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
            public MysteryBoxCategoryDraft setCreator(User creator) {
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
            public MysteryBoxCategoryDraft setCreatorId(@NotNull String creatorId) {
                creator(true).setId(Objects.requireNonNull(creatorId, "\"creator\" cannot be null"));
                return this;
            }

            @Override
            public MysteryBoxCategoryDraft applyCreator(DraftConsumer<UserDraft> block) {
                applyCreator(null, block);
                return this;
            }

            @Override
            public MysteryBoxCategoryDraft applyCreator(User base, DraftConsumer<UserDraft> block) {
                setCreator(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String name() {
                return (__modified!= null ? __modified : __base).name();
            }

            @Override
            public MysteryBoxCategoryDraft setName(String name) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__nameValue = name;
                __tmpModified.__nameLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String icon() {
                return (__modified!= null ? __modified : __base).icon();
            }

            @Override
            public MysteryBoxCategoryDraft setIcon(String icon) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__iconValue = icon;
                __tmpModified.__iconLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String description() {
                return (__modified!= null ? __modified : __base).description();
            }

            @Override
            public MysteryBoxCategoryDraft setDescription(String description) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__descriptionValue = description;
                __tmpModified.__descriptionLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer sortOrder() {
                return (__modified!= null ? __modified : __base).sortOrder();
            }

            @Override
            public MysteryBoxCategoryDraft setSortOrder(Integer sortOrder) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__sortOrderValue = sortOrder;
                __tmpModified.__sortOrderLoaded = true;
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
                    case SLOT_NAME:
                    		setName((String)value);break;
                    case SLOT_ICON:
                    		setIcon((String)value);break;
                    case SLOT_DESCRIPTION:
                    		setDescription((String)value);break;
                    case SLOT_SORT_ORDER:
                    		setSortOrder((Integer)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\"");
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
                    case "name":
                    		setName((String)value);break;
                    case "icon":
                    		setIcon((String)value);break;
                    case "description":
                    		setDescription((String)value);break;
                    case "sortOrder":
                    		setSortOrder((Integer)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\"");
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
                    __modified().__visibility = __visibility = Visibility.of(9);
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
                    case SLOT_NAME:
                    		__visibility.show(SLOT_NAME, visible);break;
                    case SLOT_ICON:
                    		__visibility.show(SLOT_ICON, visible);break;
                    case SLOT_DESCRIPTION:
                    		__visibility.show(SLOT_DESCRIPTION, visible);break;
                    case SLOT_SORT_ORDER:
                    		__visibility.show(SLOT_SORT_ORDER, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(9);
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
                    case "name":
                    		__visibility.show(SLOT_NAME, visible);break;
                    case "icon":
                    		__visibility.show(SLOT_ICON, visible);break;
                    case "description":
                    		__visibility.show(SLOT_DESCRIPTION, visible);break;
                    case "sortOrder":
                    		__visibility.show(SLOT_SORT_ORDER, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + 
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
                    case SLOT_NAME:
                    		__modified().__nameLoaded = false;break;
                    case SLOT_ICON:
                    		__modified().__iconLoaded = false;break;
                    case SLOT_DESCRIPTION:
                    		__modified().__descriptionLoaded = false;break;
                    case SLOT_SORT_ORDER:
                    		__modified().__sortOrderLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    case "name":
                    		__modified().__nameLoaded = false;break;
                    case "icon":
                    		__modified().__iconLoaded = false;break;
                    case "description":
                    		__modified().__descriptionLoaded = false;break;
                    case "sortOrder":
                    		__modified().__sortOrderLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.box.category.entity.MysteryBoxCategory\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
            type = MysteryBoxCategory.class
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

        @Null
        @GenField(
                value = "类别名称",
                order = 0
        )
        public Builder name(String name) {
            __draft.setName(name);
            return this;
        }

        @Null
        @GenField(
                value = "类别图标",
                type = ItemType.PICTURE,
                order = 1
        )
        public Builder icon(String icon) {
            __draft.setIcon(icon);
            return this;
        }

        @Null
        @GenField(
                value = "描述",
                order = 2
        )
        public Builder description(String description) {
            __draft.setDescription(description);
            return this;
        }

        @Null
        @GenField(
                value = "排序",
                order = 3
        )
        public Builder sortOrder(Integer sortOrder) {
            __draft.setSortOrder(sortOrder);
            return this;
        }

        public MysteryBoxCategory build() {
            return (MysteryBoxCategory)__draft.__modified();
        }
    }
}
