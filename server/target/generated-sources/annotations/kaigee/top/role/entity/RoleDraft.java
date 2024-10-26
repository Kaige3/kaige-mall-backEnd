package kaigee.top.role.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.qifan.infrastructure.generator.core.GenField;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kaigee.top.infrastructure.jimmer.BaseEntityDraft;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserDraft;
import kaigee.top.user.root.entity.UserRoleRel;
import kaigee.top.user.root.entity.UserRoleRelDraft;
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
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.OneToMany;
import org.jetbrains.annotations.NotNull;

@GeneratedBy(
        type = Role.class
)
public interface RoleDraft extends Role, BaseEntityDraft {
    RoleDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    RoleDraft setId(String id);

    @OldChain
    RoleDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    RoleDraft setEditedTime(LocalDateTime editedTime);

    UserDraft editor();

    UserDraft editor(boolean autoCreate);

    @OldChain
    RoleDraft setEditor(User editor);

    @NotNull
    String editorId();

    @OldChain
    RoleDraft setEditorId(@NotNull String editorId);

    @OldChain
    RoleDraft applyEditor(DraftConsumer<UserDraft> block);

    @OldChain
    RoleDraft applyEditor(User base, DraftConsumer<UserDraft> block);

    UserDraft creator();

    UserDraft creator(boolean autoCreate);

    @OldChain
    RoleDraft setCreator(User creator);

    @NotNull
    String creatorId();

    @OldChain
    RoleDraft setCreatorId(@NotNull String creatorId);

    @OldChain
    RoleDraft applyCreator(DraftConsumer<UserDraft> block);

    @OldChain
    RoleDraft applyCreator(User base, DraftConsumer<UserDraft> block);

    @OldChain
    RoleDraft setName(String name);

    List<UserRoleRelDraft> users(boolean autoCreate);

    @OldChain
    RoleDraft setUsers(List<UserRoleRel> users);

    @OldChain
    RoleDraft addIntoUsers(DraftConsumer<UserRoleRelDraft> block);

    @OldChain
    RoleDraft addIntoUsers(UserRoleRel base, DraftConsumer<UserRoleRelDraft> block);

    @GeneratedBy(
            type = Role.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_CREATED_TIME = 1;

        public static final int SLOT_EDITED_TIME = 2;

        public static final int SLOT_EDITOR = 3;

        public static final int SLOT_CREATOR = 4;

        public static final int SLOT_NAME = 5;

        public static final int SLOT_USERS = 6;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                Role.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Role)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("createdTime", SLOT_CREATED_TIME)
            .redefine("editedTime", SLOT_EDITED_TIME)
            .redefine("editor", SLOT_EDITOR)
            .redefine("creator", SLOT_CREATOR)
            .key(SLOT_NAME, "name", String.class, false)
            .add(SLOT_USERS, "users", OneToMany.class, UserRoleRel.class, false)
            .build();

        private Producer() {
        }

        public Role produce(DraftConsumer<RoleDraft> block) {
            return produce(null, block);
        }

        public Role produce(Role base, DraftConsumer<RoleDraft> block) {
            return (Role)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = Role.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "createdTime", "editedTime", "editor", "creator", "name", "users"})
        public abstract static class Implementor implements Role, ImmutableSpi {
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
                    case SLOT_USERS:
                    		return users();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.role.entity.Role\": \"" + prop + "\"");
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
                    case "users":
                    		return users();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.role.entity.Role\": \"" + prop + "\"");
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
                    value = "角色名称",
                    order = 0
            )
            public final String getName() {
                return name();
            }

            public final List<UserRoleRel> getUsers() {
                return users();
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
                type = Role.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            LocalDateTime __createdTimeValue;

            LocalDateTime __editedTimeValue;

            User __editorValue;

            User __creatorValue;

            String __nameValue;

            NonSharedList<UserRoleRel> __usersValue;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Role.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                if (__createdTimeValue == null) {
                    throw new UnloadedException(Role.class, "createdTime");
                }
                return __createdTimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                if (__editedTimeValue == null) {
                    throw new UnloadedException(Role.class, "editedTime");
                }
                return __editedTimeValue;
            }

            @Override
            @JsonIgnore
            public User editor() {
                if (__editorValue == null) {
                    throw new UnloadedException(Role.class, "editor");
                }
                return __editorValue;
            }

            @Override
            @JsonIgnore
            public User creator() {
                if (__creatorValue == null) {
                    throw new UnloadedException(Role.class, "creator");
                }
                return __creatorValue;
            }

            @Override
            @JsonIgnore
            public String name() {
                if (__nameValue == null) {
                    throw new UnloadedException(Role.class, "name");
                }
                return __nameValue;
            }

            @Override
            @JsonIgnore
            public List<UserRoleRel> users() {
                if (__usersValue == null) {
                    throw new UnloadedException(Role.class, "users");
                }
                return __usersValue;
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
                    		return __nameValue != null;
                    case SLOT_USERS:
                    		return __usersValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.role.entity.Role\": \"" + prop + "\"");
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
                    		return __nameValue != null;
                    case "users":
                    		return __usersValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.role.entity.Role\": \"" + prop + "\"");
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
                    case SLOT_USERS:
                    		return __visibility.visible(SLOT_USERS);
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
                    case "users":
                    		return __visibility.visible(SLOT_USERS);
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
                if (__nameValue != null) {
                    hash = 31 * hash + __nameValue.hashCode();
                }
                if (__usersValue != null) {
                    hash = 31 * hash + __usersValue.hashCode();
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
                if (__nameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__nameValue);
                }
                if (__usersValue != null) {
                    hash = 31 * hash + System.identityHashCode(__usersValue);
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
                boolean __nameLoaded = __nameValue != null;
                if (__nameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                if (__nameLoaded && !Objects.equals(__nameValue, __other.name())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                boolean __usersLoaded = __usersValue != null;
                if (__usersLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                if (__usersLoaded && !Objects.equals(__usersValue, __other.users())) {
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
                boolean __nameLoaded = __nameValue != null;
                if (__nameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NAME))) {
                    return false;
                }
                if (__nameLoaded && __nameValue != __other.name()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                boolean __usersLoaded = __usersValue != null;
                if (__usersLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                if (__usersLoaded && __usersValue != __other.users()) {
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
                type = Role.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, RoleDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private Role __resolved;

            DraftImpl(DraftContext ctx, Role base) {
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
            public RoleDraft setId(String id) {
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
            public RoleDraft setCreatedTime(LocalDateTime createdTime) {
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
            public RoleDraft setEditedTime(LocalDateTime editedTime) {
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
            public RoleDraft setEditor(User editor) {
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
            public RoleDraft setEditorId(@NotNull String editorId) {
                editor(true).setId(Objects.requireNonNull(editorId, "\"editor\" cannot be null"));
                return this;
            }

            @Override
            public RoleDraft applyEditor(DraftConsumer<UserDraft> block) {
                applyEditor(null, block);
                return this;
            }

            @Override
            public RoleDraft applyEditor(User base, DraftConsumer<UserDraft> block) {
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
            public RoleDraft setCreator(User creator) {
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
            public RoleDraft setCreatorId(@NotNull String creatorId) {
                creator(true).setId(Objects.requireNonNull(creatorId, "\"creator\" cannot be null"));
                return this;
            }

            @Override
            public RoleDraft applyCreator(DraftConsumer<UserDraft> block) {
                applyCreator(null, block);
                return this;
            }

            @Override
            public RoleDraft applyCreator(User base, DraftConsumer<UserDraft> block) {
                setCreator(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public String name() {
                return (__modified!= null ? __modified : __base).name();
            }

            @Override
            public RoleDraft setName(String name) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (name == null) {
                    throw new IllegalArgumentException(
                        "'name' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__nameValue = name;
                return this;
            }

            @Override
            @JsonIgnore
            public List<UserRoleRel> users() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).users(), UserRoleRel.class, true);
            }

            @Override
            public List<UserRoleRelDraft> users(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_USERS)))) {
                    setUsers(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).users(), UserRoleRel.class, true);
            }

            @Override
            public RoleDraft setUsers(List<UserRoleRel> users) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (users == null) {
                    throw new IllegalArgumentException(
                        "'users' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__usersValue = NonSharedList.of(__tmpModified.__usersValue, users);
                return this;
            }

            @Override
            public RoleDraft addIntoUsers(DraftConsumer<UserRoleRelDraft> block) {
                addIntoUsers(null, block);
                return this;
            }

            @Override
            public RoleDraft addIntoUsers(UserRoleRel base, DraftConsumer<UserRoleRelDraft> block) {
                users(true).add((UserRoleRelDraft)UserRoleRelDraft.$.produce(base, block));
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
                    case SLOT_USERS:
                    		setUsers((List<UserRoleRel>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.role.entity.Role\": \"" + prop + "\"");
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
                    case "users":
                    		setUsers((List<UserRoleRel>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.role.entity.Role\": \"" + prop + "\"");
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
                    case SLOT_NAME:
                    		__visibility.show(SLOT_NAME, visible);break;
                    case SLOT_USERS:
                    		__visibility.show(SLOT_USERS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"kaigee.top.role.entity.Role\": \"" + 
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
                    case "name":
                    		__visibility.show(SLOT_NAME, visible);break;
                    case "users":
                    		__visibility.show(SLOT_USERS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"kaigee.top.role.entity.Role\": \"" + 
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
                    		__modified().__nameValue = null;break;
                    case SLOT_USERS:
                    		__modified().__usersValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.role.entity.Role\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    		__modified().__nameValue = null;break;
                    case "users":
                    		__modified().__usersValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.role.entity.Role\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_USERS))) {
                            List<UserRoleRel> oldValue = base.users();
                            List<UserRoleRel> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setUsers(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__editorValue = __ctx.resolveObject(__tmpModified.__editorValue);
                        __tmpModified.__creatorValue = __ctx.resolveObject(__tmpModified.__creatorValue);
                        __tmpModified.__usersValue = NonSharedList.of(__tmpModified.__usersValue, __ctx.resolveList(__tmpModified.__usersValue));
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
            type = Role.class
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
                value = "角色名称",
                order = 0
        )
        public Builder name(String name) {
            if (name != null) {
                __draft.setName(name);
            }
            return this;
        }

        public Builder users(List<UserRoleRel> users) {
            if (users != null) {
                __draft.setUsers(users);
            }
            return this;
        }

        public Role build() {
            return (Role)__draft.__modified();
        }
    }
}
