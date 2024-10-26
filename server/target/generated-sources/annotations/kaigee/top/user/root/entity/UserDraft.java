package kaigee.top.user.root.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import jakarta.validation.constraints.Null;
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
import kaigee.top.dict.model.DictConstants;
import kaigee.top.infrastructure.jimmer.BaseDateTimeDraft;
import kaigee.top.role.entity.Role;
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
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.ManyToManyView;
import org.babyfish.jimmer.sql.OneToMany;
import org.babyfish.jimmer.sql.collection.ManyToManyViewList;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        type = User.class
)
public interface UserDraft extends User, BaseDateTimeDraft {
    UserDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    UserDraft setId(String id);

    @OldChain
    UserDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    UserDraft setEditedTime(LocalDateTime editedTime);

    @OldChain
    UserDraft setNickname(String nickname);

    @OldChain
    UserDraft setAvatar(String avatar);

    @OldChain
    UserDraft setGender(DictConstants.SEX gender);

    @OldChain
    UserDraft setPhone(String phone);

    @OldChain
    UserDraft setPassword(String password);

    @OldChain
    UserDraft setStatus(String status);

    List<UserRoleRelDraft> roles(boolean autoCreate);

    @OldChain
    UserDraft setRoles(List<UserRoleRel> roles);

    @OldChain
    UserDraft addIntoRoles(DraftConsumer<UserRoleRelDraft> block);

    @OldChain
    UserDraft addIntoRoles(UserRoleRel base, DraftConsumer<UserRoleRelDraft> block);

    @GeneratedBy(
            type = User.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 2;

        public static final int SLOT_CREATED_TIME = 0;

        public static final int SLOT_EDITED_TIME = 1;

        public static final int SLOT_NICKNAME = 3;

        public static final int SLOT_AVATAR = 4;

        public static final int SLOT_GENDER = 5;

        public static final int SLOT_PHONE = 6;

        public static final int SLOT_PASSWORD = 7;

        public static final int SLOT_STATUS = 8;

        public static final int SLOT_ROLES = 9;

        public static final int SLOT_ROLES_VIEW = 10;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                User.class,
                Collections.singleton(BaseDateTimeDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (User)base)
            )
            .redefine("createdTime", SLOT_CREATED_TIME)
            .redefine("editedTime", SLOT_EDITED_TIME)
            .id(SLOT_ID, "id", String.class)
            .add(SLOT_NICKNAME, "nickname", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_AVATAR, "avatar", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_GENDER, "gender", ImmutablePropCategory.SCALAR, DictConstants.SEX.class, true)
            .key(SLOT_PHONE, "phone", String.class, false)
            .add(SLOT_PASSWORD, "password", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_STATUS, "status", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_ROLES, "roles", OneToMany.class, UserRoleRel.class, false)
            .add(SLOT_ROLES_VIEW, "rolesView", ManyToManyView.class, Role.class, false)
            .build();

        private Producer() {
        }

        public User produce(DraftConsumer<UserDraft> block) {
            return produce(null, block);
        }

        public User produce(User base, DraftConsumer<UserDraft> block) {
            return (User)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = User.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "createdTime", "editedTime", "id", "nickname", "avatar", "gender", "phone", "password", "status", "roles", "rolesView"})
        public abstract static class Implementor implements User, ImmutableSpi {
            public static final PropId DEEPER_PROP_ID_ROLES_VIEW = Producer.TYPE.getProp("rolesView").getManyToManyViewBaseDeeperProp().getId();

            @Override
            public final Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_CREATED_TIME:
                    		return createdTime();
                    case SLOT_EDITED_TIME:
                    		return editedTime();
                    case SLOT_ID:
                    		return id();
                    case SLOT_NICKNAME:
                    		return nickname();
                    case SLOT_AVATAR:
                    		return avatar();
                    case SLOT_GENDER:
                    		return gender();
                    case SLOT_PHONE:
                    		return phone();
                    case SLOT_PASSWORD:
                    		return password();
                    case SLOT_STATUS:
                    		return status();
                    case SLOT_ROLES:
                    		return roles();
                    case SLOT_ROLES_VIEW:
                    		return rolesView();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
                switch (prop) {
                    case "createdTime":
                    		return createdTime();
                    case "editedTime":
                    		return editedTime();
                    case "id":
                    		return id();
                    case "nickname":
                    		return nickname();
                    case "avatar":
                    		return avatar();
                    case "gender":
                    		return gender();
                    case "phone":
                    		return phone();
                    case "password":
                    		return password();
                    case "status":
                    		return status();
                    case "roles":
                    		return roles();
                    case "rolesView":
                    		return rolesView();
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + prop + "\"");
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

            @Null
            @GenField(
                    value = "昵称",
                    order = 2
            )
            public final String getNickname() {
                return nickname();
            }

            @Null
            @GenField(
                    value = "头像",
                    order = 3,
                    type = ItemType.PICTURE
            )
            public final String getAvatar() {
                return avatar();
            }

            @Null
            @GenField(
                    value = "性别",
                    order = 4,
                    type = ItemType.SELECTABLE,
                    dictEnName = "SEX"
            )
            public final DictConstants.SEX getGender() {
                return gender();
            }

            @GenField(
                    value = "手机号",
                    order = 0
            )
            public final String getPhone() {
                return phone();
            }

            @GenField(
                    value = "密码",
                    order = 1
            )
            public final String getPassword() {
                return password();
            }

            public final String getStatus() {
                return status();
            }

            public final List<UserRoleRel> getRoles() {
                return roles();
            }

            @Override
            public final List<Role> rolesView() {
                return new ManyToManyViewList<>(
                            DEEPER_PROP_ID_ROLES_VIEW, roles()
                        );
            }

            public final List<Role> getRolesView() {
                return rolesView();
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
                type = User.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            LocalDateTime __createdTimeValue;

            LocalDateTime __editedTimeValue;

            String __nicknameValue;

            boolean __nicknameLoaded = false;

            String __avatarValue;

            boolean __avatarLoaded = false;

            DictConstants.SEX __genderValue;

            boolean __genderLoaded = false;

            String __phoneValue;

            String __passwordValue;

            String __statusValue;

            NonSharedList<UserRoleRel> __rolesValue;

            Impl() {
                __visibility = Visibility.of(11);
                __visibility.show(SLOT_ROLES_VIEW, false);
            }

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(User.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createdTime() {
                if (__createdTimeValue == null) {
                    throw new UnloadedException(User.class, "createdTime");
                }
                return __createdTimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime editedTime() {
                if (__editedTimeValue == null) {
                    throw new UnloadedException(User.class, "editedTime");
                }
                return __editedTimeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String nickname() {
                if (!__nicknameLoaded) {
                    throw new UnloadedException(User.class, "nickname");
                }
                return __nicknameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String avatar() {
                if (!__avatarLoaded) {
                    throw new UnloadedException(User.class, "avatar");
                }
                return __avatarValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public DictConstants.SEX gender() {
                if (!__genderLoaded) {
                    throw new UnloadedException(User.class, "gender");
                }
                return __genderValue;
            }

            @Override
            @JsonIgnore
            public String phone() {
                if (__phoneValue == null) {
                    throw new UnloadedException(User.class, "phone");
                }
                return __phoneValue;
            }

            @Override
            @JsonIgnore
            public String password() {
                if (__passwordValue == null) {
                    throw new UnloadedException(User.class, "password");
                }
                return __passwordValue;
            }

            @Override
            @JsonIgnore
            public String status() {
                if (__statusValue == null) {
                    throw new UnloadedException(User.class, "status");
                }
                return __statusValue;
            }

            @Override
            @JsonIgnore
            public List<UserRoleRel> roles() {
                if (__rolesValue == null) {
                    throw new UnloadedException(User.class, "roles");
                }
                return __rolesValue;
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
                    case SLOT_CREATED_TIME:
                    		return __createdTimeValue != null;
                    case SLOT_EDITED_TIME:
                    		return __editedTimeValue != null;
                    case SLOT_ID:
                    		return __idValue != null;
                    case SLOT_NICKNAME:
                    		return __nicknameLoaded;
                    case SLOT_AVATAR:
                    		return __avatarLoaded;
                    case SLOT_GENDER:
                    		return __genderLoaded;
                    case SLOT_PHONE:
                    		return __phoneValue != null;
                    case SLOT_PASSWORD:
                    		return __passwordValue != null;
                    case SLOT_STATUS:
                    		return __statusValue != null;
                    case SLOT_ROLES:
                    		return __rolesValue != null;
                    case SLOT_ROLES_VIEW:
                    		return __isLoaded(PropId.byIndex(SLOT_ROLES)) && roles().stream().allMatch(__each -> 
                                ((ImmutableSpi)__each).__isLoaded(DEEPER_PROP_ID_ROLES_VIEW)
                            );
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "createdTime":
                    		return __createdTimeValue != null;
                    case "editedTime":
                    		return __editedTimeValue != null;
                    case "id":
                    		return __idValue != null;
                    case "nickname":
                    		return __nicknameLoaded;
                    case "avatar":
                    		return __avatarLoaded;
                    case "gender":
                    		return __genderLoaded;
                    case "phone":
                    		return __phoneValue != null;
                    case "password":
                    		return __passwordValue != null;
                    case "status":
                    		return __statusValue != null;
                    case "roles":
                    		return __rolesValue != null;
                    case "rolesView":
                    		return __isLoaded(PropId.byIndex(SLOT_ROLES)) && roles().stream().allMatch(__each -> 
                                ((ImmutableSpi)__each).__isLoaded(DEEPER_PROP_ID_ROLES_VIEW)
                            );
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + prop + "\"");
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
                    case SLOT_CREATED_TIME:
                    		return __visibility.visible(SLOT_CREATED_TIME);
                    case SLOT_EDITED_TIME:
                    		return __visibility.visible(SLOT_EDITED_TIME);
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
                    case SLOT_NICKNAME:
                    		return __visibility.visible(SLOT_NICKNAME);
                    case SLOT_AVATAR:
                    		return __visibility.visible(SLOT_AVATAR);
                    case SLOT_GENDER:
                    		return __visibility.visible(SLOT_GENDER);
                    case SLOT_PHONE:
                    		return __visibility.visible(SLOT_PHONE);
                    case SLOT_PASSWORD:
                    		return __visibility.visible(SLOT_PASSWORD);
                    case SLOT_STATUS:
                    		return __visibility.visible(SLOT_STATUS);
                    case SLOT_ROLES:
                    		return __visibility.visible(SLOT_ROLES);
                    case SLOT_ROLES_VIEW:
                    		return __visibility.visible(SLOT_ROLES_VIEW);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "createdTime":
                    		return __visibility.visible(SLOT_CREATED_TIME);
                    case "editedTime":
                    		return __visibility.visible(SLOT_EDITED_TIME);
                    case "id":
                    		return __visibility.visible(SLOT_ID);
                    case "nickname":
                    		return __visibility.visible(SLOT_NICKNAME);
                    case "avatar":
                    		return __visibility.visible(SLOT_AVATAR);
                    case "gender":
                    		return __visibility.visible(SLOT_GENDER);
                    case "phone":
                    		return __visibility.visible(SLOT_PHONE);
                    case "password":
                    		return __visibility.visible(SLOT_PASSWORD);
                    case "status":
                    		return __visibility.visible(SLOT_STATUS);
                    case "roles":
                    		return __visibility.visible(SLOT_ROLES);
                    case "rolesView":
                    		return __visibility.visible(SLOT_ROLES_VIEW);
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
                if (__nicknameLoaded && __nicknameValue != null) {
                    hash = 31 * hash + __nicknameValue.hashCode();
                }
                if (__avatarLoaded && __avatarValue != null) {
                    hash = 31 * hash + __avatarValue.hashCode();
                }
                if (__genderLoaded && __genderValue != null) {
                    hash = 31 * hash + __genderValue.hashCode();
                }
                if (__phoneValue != null) {
                    hash = 31 * hash + __phoneValue.hashCode();
                }
                if (__passwordValue != null) {
                    hash = 31 * hash + __passwordValue.hashCode();
                }
                if (__statusValue != null) {
                    hash = 31 * hash + __statusValue.hashCode();
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + __rolesValue.hashCode();
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
                if (__nicknameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__nicknameValue);
                }
                if (__avatarLoaded) {
                    hash = 31 * hash + System.identityHashCode(__avatarValue);
                }
                if (__genderLoaded) {
                    hash = 31 * hash + System.identityHashCode(__genderValue);
                }
                if (__phoneValue != null) {
                    hash = 31 * hash + System.identityHashCode(__phoneValue);
                }
                if (__passwordValue != null) {
                    hash = 31 * hash + System.identityHashCode(__passwordValue);
                }
                if (__statusValue != null) {
                    hash = 31 * hash + System.identityHashCode(__statusValue);
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__rolesValue);
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
                if (__isVisible(PropId.byIndex(SLOT_NICKNAME)) != __other.__isVisible(PropId.byIndex(SLOT_NICKNAME))) {
                    return false;
                }
                boolean __nicknameLoaded = this.__nicknameLoaded;
                if (__nicknameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NICKNAME))) {
                    return false;
                }
                if (__nicknameLoaded && !Objects.equals(__nicknameValue, __other.nickname())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AVATAR)) != __other.__isVisible(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                boolean __avatarLoaded = this.__avatarLoaded;
                if (__avatarLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                if (__avatarLoaded && !Objects.equals(__avatarValue, __other.avatar())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_GENDER)) != __other.__isVisible(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                boolean __genderLoaded = this.__genderLoaded;
                if (__genderLoaded != __other.__isLoaded(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                if (__genderLoaded && !Objects.equals(__genderValue, __other.gender())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PHONE)) != __other.__isVisible(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                boolean __phoneLoaded = __phoneValue != null;
                if (__phoneLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                if (__phoneLoaded && !Objects.equals(__phoneValue, __other.phone())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PASSWORD)) != __other.__isVisible(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                boolean __passwordLoaded = __passwordValue != null;
                if (__passwordLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                if (__passwordLoaded && !Objects.equals(__passwordValue, __other.password())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = __statusValue != null;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(__statusValue, __other.status())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && !Objects.equals(__rolesValue, __other.roles())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES_VIEW)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES_VIEW))) {
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
                if (__isVisible(PropId.byIndex(SLOT_NICKNAME)) != __other.__isVisible(PropId.byIndex(SLOT_NICKNAME))) {
                    return false;
                }
                boolean __nicknameLoaded = this.__nicknameLoaded;
                if (__nicknameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_NICKNAME))) {
                    return false;
                }
                if (__nicknameLoaded && __nicknameValue != __other.nickname()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AVATAR)) != __other.__isVisible(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                boolean __avatarLoaded = this.__avatarLoaded;
                if (__avatarLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                if (__avatarLoaded && __avatarValue != __other.avatar()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_GENDER)) != __other.__isVisible(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                boolean __genderLoaded = this.__genderLoaded;
                if (__genderLoaded != __other.__isLoaded(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                if (__genderLoaded && __genderValue != __other.gender()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PHONE)) != __other.__isVisible(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                boolean __phoneLoaded = __phoneValue != null;
                if (__phoneLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                if (__phoneLoaded && __phoneValue != __other.phone()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PASSWORD)) != __other.__isVisible(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                boolean __passwordLoaded = __passwordValue != null;
                if (__passwordLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                if (__passwordLoaded && __passwordValue != __other.password()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = __statusValue != null;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && __rolesValue != __other.roles()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES_VIEW)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES_VIEW))) {
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
                type = User.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, UserDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private User __resolved;

            DraftImpl(DraftContext ctx, User base) {
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
            public UserDraft setId(String id) {
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
            public UserDraft setCreatedTime(LocalDateTime createdTime) {
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
            public UserDraft setEditedTime(LocalDateTime editedTime) {
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
            @Nullable
            public String nickname() {
                return (__modified!= null ? __modified : __base).nickname();
            }

            @Override
            public UserDraft setNickname(String nickname) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__nicknameValue = nickname;
                __tmpModified.__nicknameLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String avatar() {
                return (__modified!= null ? __modified : __base).avatar();
            }

            @Override
            public UserDraft setAvatar(String avatar) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__avatarValue = avatar;
                __tmpModified.__avatarLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public DictConstants.SEX gender() {
                return (__modified!= null ? __modified : __base).gender();
            }

            @Override
            public UserDraft setGender(DictConstants.SEX gender) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__genderValue = gender;
                __tmpModified.__genderLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String phone() {
                return (__modified!= null ? __modified : __base).phone();
            }

            @Override
            public UserDraft setPhone(String phone) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (phone == null) {
                    throw new IllegalArgumentException(
                        "'phone' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__phoneValue = phone;
                return this;
            }

            @Override
            @JsonIgnore
            public String password() {
                return (__modified!= null ? __modified : __base).password();
            }

            @Override
            public UserDraft setPassword(String password) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (password == null) {
                    throw new IllegalArgumentException(
                        "'password' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__passwordValue = password;
                return this;
            }

            @Override
            @JsonIgnore
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public UserDraft setStatus(String status) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (status == null) {
                    throw new IllegalArgumentException(
                        "'status' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                return this;
            }

            @Override
            @JsonIgnore
            public List<UserRoleRel> roles() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), UserRoleRel.class, true);
            }

            @Override
            public List<UserRoleRelDraft> roles(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_ROLES)))) {
                    setRoles(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), UserRoleRel.class, true);
            }

            @Override
            public UserDraft setRoles(List<UserRoleRel> roles) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (roles == null) {
                    throw new IllegalArgumentException(
                        "'roles' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, roles);
                return this;
            }

            @Override
            public UserDraft addIntoRoles(DraftConsumer<UserRoleRelDraft> block) {
                addIntoRoles(null, block);
                return this;
            }

            @Override
            public UserDraft addIntoRoles(UserRoleRel base, DraftConsumer<UserRoleRelDraft> block) {
                roles(true).add((UserRoleRelDraft)UserRoleRelDraft.$.produce(base, block));
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
                    case SLOT_CREATED_TIME:
                    		setCreatedTime((LocalDateTime)value);break;
                    case SLOT_EDITED_TIME:
                    		setEditedTime((LocalDateTime)value);break;
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_NICKNAME:
                    		setNickname((String)value);break;
                    case SLOT_AVATAR:
                    		setAvatar((String)value);break;
                    case SLOT_GENDER:
                    		setGender((DictConstants.SEX)value);break;
                    case SLOT_PHONE:
                    		setPhone((String)value);break;
                    case SLOT_PASSWORD:
                    		setPassword((String)value);break;
                    case SLOT_STATUS:
                    		setStatus((String)value);break;
                    case SLOT_ROLES:
                    		setRoles((List<UserRoleRel>)value);break;
                    case SLOT_ROLES_VIEW:
                    		break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.user.root.entity.User\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "createdTime":
                    		setCreatedTime((LocalDateTime)value);break;
                    case "editedTime":
                    		setEditedTime((LocalDateTime)value);break;
                    case "id":
                    		setId((String)value);break;
                    case "nickname":
                    		setNickname((String)value);break;
                    case "avatar":
                    		setAvatar((String)value);break;
                    case "gender":
                    		setGender((DictConstants.SEX)value);break;
                    case "phone":
                    		setPhone((String)value);break;
                    case "password":
                    		setPassword((String)value);break;
                    case "status":
                    		setStatus((String)value);break;
                    case "roles":
                    		setRoles((List<UserRoleRel>)value);break;
                    case "rolesView":
                    		break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + prop + "\"");
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
                    __modified().__visibility = __visibility = Visibility.of(11);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_CREATED_TIME:
                    		__visibility.show(SLOT_CREATED_TIME, visible);break;
                    case SLOT_EDITED_TIME:
                    		__visibility.show(SLOT_EDITED_TIME, visible);break;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_NICKNAME:
                    		__visibility.show(SLOT_NICKNAME, visible);break;
                    case SLOT_AVATAR:
                    		__visibility.show(SLOT_AVATAR, visible);break;
                    case SLOT_GENDER:
                    		__visibility.show(SLOT_GENDER, visible);break;
                    case SLOT_PHONE:
                    		__visibility.show(SLOT_PHONE, visible);break;
                    case SLOT_PASSWORD:
                    		__visibility.show(SLOT_PASSWORD, visible);break;
                    case SLOT_STATUS:
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case SLOT_ROLES:
                    		__visibility.show(SLOT_ROLES, visible);break;
                    case SLOT_ROLES_VIEW:
                    		__visibility.show(SLOT_ROLES_VIEW, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"kaigee.top.user.root.entity.User\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(11);
                }
                switch (prop) {
                    case "createdTime":
                    		__visibility.show(SLOT_CREATED_TIME, visible);break;
                    case "editedTime":
                    		__visibility.show(SLOT_EDITED_TIME, visible);break;
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "nickname":
                    		__visibility.show(SLOT_NICKNAME, visible);break;
                    case "avatar":
                    		__visibility.show(SLOT_AVATAR, visible);break;
                    case "gender":
                    		__visibility.show(SLOT_GENDER, visible);break;
                    case "phone":
                    		__visibility.show(SLOT_PHONE, visible);break;
                    case "password":
                    		__visibility.show(SLOT_PASSWORD, visible);break;
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case "roles":
                    		__visibility.show(SLOT_ROLES, visible);break;
                    case "rolesView":
                    		__visibility.show(SLOT_ROLES_VIEW, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + 
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
                    case SLOT_CREATED_TIME:
                    		__modified().__createdTimeValue = null;break;
                    case SLOT_EDITED_TIME:
                    		__modified().__editedTimeValue = null;break;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_NICKNAME:
                    		__modified().__nicknameLoaded = false;break;
                    case SLOT_AVATAR:
                    		__modified().__avatarLoaded = false;break;
                    case SLOT_GENDER:
                    		__modified().__genderLoaded = false;break;
                    case SLOT_PHONE:
                    		__modified().__phoneValue = null;break;
                    case SLOT_PASSWORD:
                    		__modified().__passwordValue = null;break;
                    case SLOT_STATUS:
                    		__modified().__statusValue = null;break;
                    case SLOT_ROLES:
                    		__modified().__rolesValue = null;break;
                    case SLOT_ROLES_VIEW:
                    		__unload(PropId.byIndex(SLOT_ROLES));break;
                    default: throw new IllegalArgumentException("Illegal property id for \"kaigee.top.user.root.entity.User\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                switch (prop) {
                    case "createdTime":
                    		__modified().__createdTimeValue = null;break;
                    case "editedTime":
                    		__modified().__editedTimeValue = null;break;
                    case "id":
                    		__modified().__idValue = null;break;
                    case "nickname":
                    		__modified().__nicknameLoaded = false;break;
                    case "avatar":
                    		__modified().__avatarLoaded = false;break;
                    case "gender":
                    		__modified().__genderLoaded = false;break;
                    case "phone":
                    		__modified().__phoneValue = null;break;
                    case "password":
                    		__modified().__passwordValue = null;break;
                    case "status":
                    		__modified().__statusValue = null;break;
                    case "roles":
                    		__modified().__rolesValue = null;break;
                    case "rolesView":
                    		__unload(PropId.byIndex(SLOT_ROLES));break;
                    default: throw new IllegalArgumentException("Illegal property name for \"kaigee.top.user.root.entity.User\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                            List<UserRoleRel> oldValue = base.roles();
                            List<UserRoleRel> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setRoles(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, __ctx.resolveList(__tmpModified.__rolesValue));
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
            type = User.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
            __draft.__show(PropId.byIndex(Producer.SLOT_ROLES), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_ROLES_VIEW), false);
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

        @Null
        @GenField(
                value = "昵称",
                order = 2
        )
        public Builder nickname(String nickname) {
            __draft.setNickname(nickname);
            return this;
        }

        @Null
        @GenField(
                value = "头像",
                order = 3,
                type = ItemType.PICTURE
        )
        public Builder avatar(String avatar) {
            __draft.setAvatar(avatar);
            return this;
        }

        @Null
        @GenField(
                value = "性别",
                order = 4,
                type = ItemType.SELECTABLE,
                dictEnName = "SEX"
        )
        public Builder gender(DictConstants.SEX gender) {
            __draft.setGender(gender);
            return this;
        }

        @GenField(
                value = "手机号",
                order = 0
        )
        public Builder phone(String phone) {
            if (phone != null) {
                __draft.setPhone(phone);
            }
            return this;
        }

        @GenField(
                value = "密码",
                order = 1
        )
        public Builder password(String password) {
            if (password != null) {
                __draft.setPassword(password);
            }
            return this;
        }

        public Builder status(String status) {
            if (status != null) {
                __draft.setStatus(status);
            }
            return this;
        }

        public Builder roles(List<UserRoleRel> roles) {
            if (roles != null) {
                __draft.setRoles(roles);
                __draft.__show(PropId.byIndex(Producer.SLOT_ROLES), true);
            }
            return this;
        }

        public User build() {
            return (User)__draft.__modified();
        }
    }
}
