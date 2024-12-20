package kaigee.top.user.root.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Objects;
import kaigee.top.infrastructure.jimmer.BaseEntityDraft;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleDraft;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.ManyToOne;
import org.jetbrains.annotations.NotNull;

@GeneratedBy(
        type = UserRoleRel.class
)
public interface UserRoleRelDraft extends UserRoleRel, BaseEntityDraft {
    UserRoleRelDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    UserRoleRelDraft setId(String id);

    @OldChain
    UserRoleRelDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    UserRoleRelDraft setEditedTime(LocalDateTime editedTime);

    UserDraft editor();

    UserDraft editor(boolean autoCreate);

    @OldChain
    UserRoleRelDraft setEditor(User editor);

    @NotNull
    String editorId();

    @OldChain
    UserRoleRelDraft setEditorId(@NotNull String editorId);

    @OldChain
    UserRoleRelDraft applyEditor(DraftConsumer<UserDraft> block);

    @OldChain
    UserRoleRelDraft applyEditor(User base, DraftConsumer<UserDraft> block);

    UserDraft creator();

    UserDraft creator(boolean autoCreate);

    @OldChain
    UserRoleRelDraft setCreator(User creator);

    @NotNull
    String creatorId();

    @OldChain
    UserRoleRelDraft setCreatorId(@NotNull String creatorId);

    @OldChain
    UserRoleRelDraft applyCreator(DraftConsumer<UserDraft> block);

    @OldChain
    UserRoleRelDraft applyCreator(User base, DraftConsumer<UserDraft> block);

    UserDraft user();

    UserDraft user(boolean autoCreate);

    @OldChain
    UserRoleRelDraft setUser(User user);

    @NotNull
    String userId();

    @OldChain
    UserRoleRelDraft setUserId(@NotNull String userId);

    @OldChain
    UserRoleRelDraft applyUser(DraftConsumer<UserDraft> block);

    @OldChain
    UserRoleRelDraft applyUser(User base, DraftConsumer<UserDraft> block);

    RoleDraft role();

    RoleDraft role(boolean autoCreate);

    @OldChain
    UserRoleRelDraft setRole(Role role);

    @NotNull
    String roleId();

    @OldChain
    UserRoleRelDraft setRoleId(@NotNull String roleId);

    @OldChain
    UserRoleRelDraft applyRole(DraftConsumer<RoleDraft> block);

    @OldChain
    UserRoleRelDraft applyRole(Role base, DraftConsumer<RoleDraft> block);

    @GeneratedBy(
            type = UserRoleRel.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_CREATED_TIME = 1;

        public static final int SLOT_EDITED_TIME = 2;

        public static final int SLOT_EDITOR = 3;

        public static final int SLOT_CREATOR = 4;

        public static final int SLOT_USER = 5;

        public static final int SLOT_ROLE = 6;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                UserRoleRel.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (UserRoleRel)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("createdTime", SLOT_CREATED_TIME)
            .redefine("editedTime", SLOT_EDITED_TIME)
            .redefine("editor", SLOT_EDITOR)
            .redefine("creator", SLOT_CREATOR)
            .keyReference(SLOT_USER, "user", ManyToOne.class, User.class, false)
            .keyReference(SLOT_ROLE, "role", ManyToOne.class, Role.class, false)
            .build();

        private Producer() {
        }

        public UserRoleRel produce(DraftConsumer<UserRoleRelDraft> block) {
            return produce(null, block);
        }

        public UserRoleRel produce(UserRoleRel base, DraftConsumer<UserRoleRelDraft> block) {
            return (UserRoleRel)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = UserRoleRel.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "createdTime", "editedTime", "editor", "creator", "user", "role"})
        public abstract static class Implementor implements UserRoleRel, ImmutableSpi {
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
                    case SLOT_USER:
                    		return user();
                    case SLOT_ROLE:
                    		return role();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\"");
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
                    case "user":
                    		return user();
                    case "role":
                    		return role();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\"");
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

            public final User getUser() {
                return user();
            }

            public final Role getRole() {
                return role();
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
                type = UserRoleRel.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            LocalDateTime __createdTimeValue;

            LocalDateTime __editedTimeValue;

            User __editorValue;

            User __creatorValue;

            User __userValue;

            Role __roleValue;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                if (__createdTimeValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "createdTime");
                }
                return __createdTimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                if (__editedTimeValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "editedTime");
                }
                return __editedTimeValue;
            }

            @Override
            @JsonIgnore
            public User editor() {
                if (__editorValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "editor");
                }
                return __editorValue;
            }

            @Override
            @JsonIgnore
            public User creator() {
                if (__creatorValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "creator");
                }
                return __creatorValue;
            }

            @Override
            @JsonIgnore
            public User user() {
                if (__userValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "user");
                }
                return __userValue;
            }

            @Override
            @JsonIgnore
            public Role role() {
                if (__roleValue == null) {
                    throw new UnloadedException(UserRoleRel.class, "role");
                }
                return __roleValue;
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
                    case SLOT_USER:
                    		return __userValue != null;
                    case SLOT_ROLE:
                    		return __roleValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\"");
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
                    case "user":
                    		return __userValue != null;
                    case "role":
                    		return __roleValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\"");
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
                    case SLOT_USER:
                    		return __visibility.visible(SLOT_USER);
                    case SLOT_ROLE:
                    		return __visibility.visible(SLOT_ROLE);
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
                    case "user":
                    		return __visibility.visible(SLOT_USER);
                    case "role":
                    		return __visibility.visible(SLOT_ROLE);
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
                if (__userValue != null) {
                    hash = 31 * hash + __userValue.hashCode();
                }
                if (__roleValue != null) {
                    hash = 31 * hash + __roleValue.hashCode();
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
                if (__userValue != null) {
                    hash = 31 * hash + System.identityHashCode(__userValue);
                }
                if (__roleValue != null) {
                    hash = 31 * hash + System.identityHashCode(__roleValue);
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
                if (__isVisible(PropId.byIndex(SLOT_USER)) != __other.__isVisible(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                boolean __userLoaded = __userValue != null;
                if (__userLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                if (__userLoaded && !Objects.equals(__userValue, __other.user())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE))) {
                    return false;
                }
                boolean __roleLoaded = __roleValue != null;
                if (__roleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE))) {
                    return false;
                }
                if (__roleLoaded && !Objects.equals(__roleValue, __other.role())) {
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
                if (__isVisible(PropId.byIndex(SLOT_USER)) != __other.__isVisible(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                boolean __userLoaded = __userValue != null;
                if (__userLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                if (__userLoaded && __userValue != __other.user()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE))) {
                    return false;
                }
                boolean __roleLoaded = __roleValue != null;
                if (__roleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE))) {
                    return false;
                }
                if (__roleLoaded && __roleValue != __other.role()) {
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
                type = UserRoleRel.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, UserRoleRelDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private UserRoleRel __resolved;

            DraftImpl(DraftContext ctx, UserRoleRel base) {
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
            public UserRoleRelDraft setId(String id) {
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
            public UserRoleRelDraft setCreatedTime(LocalDateTime createdTime) {
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
            public UserRoleRelDraft setEditedTime(LocalDateTime editedTime) {
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
            public UserRoleRelDraft setEditor(User editor) {
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
            public UserRoleRelDraft setEditorId(@NotNull String editorId) {
                editor(true).setId(Objects.requireNonNull(editorId, "\"editor\" cannot be null"));
                return this;
            }

            @Override
            public UserRoleRelDraft applyEditor(DraftConsumer<UserDraft> block) {
                applyEditor(null, block);
                return this;
            }

            @Override
            public UserRoleRelDraft applyEditor(User base, DraftConsumer<UserDraft> block) {
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
            public UserRoleRelDraft setCreator(User creator) {
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
            public UserRoleRelDraft setCreatorId(@NotNull String creatorId) {
                creator(true).setId(Objects.requireNonNull(creatorId, "\"creator\" cannot be null"));
                return this;
            }

            @Override
            public UserRoleRelDraft applyCreator(DraftConsumer<UserDraft> block) {
                applyCreator(null, block);
                return this;
            }

            @Override
            public UserRoleRelDraft applyCreator(User base, DraftConsumer<UserDraft> block) {
                setCreator(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public UserDraft user() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).user());
            }

            @Override
            public UserDraft user(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_USER)))) {
                    setUser(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).user());
            }

            @Override
            public UserRoleRelDraft setUser(User user) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (user == null) {
                    throw new IllegalArgumentException(
                        "'user' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__userValue = user;
                return this;
            }

            @NotNull
            @Override
            public String userId() {
                return user().id();
            }

            @OldChain
            @Override
            public UserRoleRelDraft setUserId(@NotNull String userId) {
                user(true).setId(Objects.requireNonNull(userId, "\"user\" cannot be null"));
                return this;
            }

            @Override
            public UserRoleRelDraft applyUser(DraftConsumer<UserDraft> block) {
                applyUser(null, block);
                return this;
            }

            @Override
            public UserRoleRelDraft applyUser(User base, DraftConsumer<UserDraft> block) {
                setUser(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public RoleDraft role() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).role());
            }

            @Override
            public RoleDraft role(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_ROLE)))) {
                    setRole(RoleDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).role());
            }

            @Override
            public UserRoleRelDraft setRole(Role role) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (role == null) {
                    throw new IllegalArgumentException(
                        "'role' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleValue = role;
                return this;
            }

            @NotNull
            @Override
            public String roleId() {
                return role().id();
            }

            @OldChain
            @Override
            public UserRoleRelDraft setRoleId(@NotNull String roleId) {
                role(true).setId(Objects.requireNonNull(roleId, "\"role\" cannot be null"));
                return this;
            }

            @Override
            public UserRoleRelDraft applyRole(DraftConsumer<RoleDraft> block) {
                applyRole(null, block);
                return this;
            }

            @Override
            public UserRoleRelDraft applyRole(Role base, DraftConsumer<RoleDraft> block) {
                setRole(RoleDraft.$.produce(base, block));
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
                    case SLOT_USER:
                    		setUser((User)value);break;
                    case SLOT_ROLE:
                    		setRole((Role)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\"");
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
                    case "user":
                    		setUser((User)value);break;
                    case "role":
                    		setRole((Role)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\"");
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
                    __modified().__visibility = __visibility = Visibility.of(7);
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
                    case SLOT_USER:
                    		__visibility.show(SLOT_USER, visible);break;
                    case SLOT_ROLE:
                    		__visibility.show(SLOT_ROLE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(7);
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
                    case "user":
                    		__visibility.show(SLOT_USER, visible);break;
                    case "role":
                    		__visibility.show(SLOT_ROLE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + 
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
                    case SLOT_USER:
                    		__modified().__userValue = null;break;
                    case SLOT_ROLE:
                    		__modified().__roleValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    case "user":
                    		__modified().__userValue = null;break;
                    case "role":
                    		__modified().__roleValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.UserRoleRel\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_USER))) {
                            User oldValue = base.user();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setUser(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_ROLE))) {
                            Role oldValue = base.role();
                            Role newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setRole(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__editorValue = __ctx.resolveObject(__tmpModified.__editorValue);
                        __tmpModified.__creatorValue = __ctx.resolveObject(__tmpModified.__creatorValue);
                        __tmpModified.__userValue = __ctx.resolveObject(__tmpModified.__userValue);
                        __tmpModified.__roleValue = __ctx.resolveObject(__tmpModified.__roleValue);
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
            type = UserRoleRel.class
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

        public Builder user(User user) {
            if (user != null) {
                __draft.setUser(user);
            }
            return this;
        }

        public Builder role(Role role) {
            if (role != null) {
                __draft.setRole(role);
            }
            return this;
        }

        public UserRoleRel build() {
            return (UserRoleRel)__draft.__modified();
        }
    }
}
