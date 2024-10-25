package kaigee.top.user.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import kaigee.top.user.entity.User;
import kaigee.top.user.entity.UserDraft;
import kaigee.top.user.entity.UserFetcher;
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
        file = "<server>/src/main/dto/kaigee/top/user/entity/User.dto"
)
@JsonDeserialize(
        builder = UserInput.Builder.class
)
@GenEntity
public class UserInput implements Input<User> {
    public static final DtoMetadata<User, UserInput> METADATA = 
        new DtoMetadata<User, UserInput>(
            UserFetcher.$
                .nickname()
                .avatar()
                .gender()
                .phone()
                .password(),
            UserInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { UserDraft.Producer.SLOT_ID }
    );

    private String nickname;

    private String avatar;

    private String gender;

    @FixedInputField
    private String phone;

    @FixedInputField
    private String password;

    private String id;

    public UserInput() {
    }

    public UserInput(@NotNull User base) {
        this.nickname = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_NICKNAME)) ? base.nickname() : null;
        this.avatar = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_AVATAR)) ? base.avatar() : null;
        this.gender = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_GENDER)) ? base.gender() : null;
        this.phone = base.phone();
        this.password = base.password();
        this.id = ID_ACCESSOR.get(base);
    }

    @Nullable
    @GenField(
            value = "昵称",
            order = 2
    )
    public String getNickname() {
        return nickname;
    }

    public void setNickname(@Nullable String nickname) {
        this.nickname = nickname;
    }

    @Nullable
    @GenField(
            value = "头像",
            order = 3,
            type = ItemType.PICTURE
    )
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    @GenField(
            value = "性别",
            order = 4
    )
    public String getGender() {
        return gender;
    }

    public void setGender(@Nullable String gender) {
        this.gender = gender;
    }

    @NotNull
    @GenField(
            value = "手机号",
            order = 0
    )
    public String getPhone() {
        if (phone == null) {
            throw new IllegalStateException("The property \"phone\" is not specified");
        }
        return phone;
    }

    public void setPhone(@NotNull String phone) {
        this.phone = phone;
    }

    @NotNull
    @GenField(
            value = "密码",
            order = 1
    )
    public String getPassword() {
        if (password == null) {
            throw new IllegalStateException("The property \"password\" is not specified");
        }
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(__draft -> {
            __draft.setNickname(nickname);
            __draft.setAvatar(avatar);
            __draft.setGender(gender);
            __draft.setPhone(phone);
            __draft.setPassword(password);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(nickname);
        hash = hash * 31 + Objects.hashCode(avatar);
        hash = hash * 31 + Objects.hashCode(gender);
        hash = hash * 31 + Objects.hashCode(phone);
        hash = hash * 31 + Objects.hashCode(password);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserInput other = (UserInput) o;
        if (!Objects.equals(nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(avatar, other.avatar)) {
            return false;
        }
        if (!Objects.equals(gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(password, other.password)) {
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
        builder.append("UserInput").append('(');
        builder.append("nickname=").append(nickname);
        builder.append(", avatar=").append(avatar);
        builder.append(", gender=").append(gender);
        builder.append(", phone=").append(phone);
        builder.append(", password=").append(password);
        builder.append(", id=").append(id);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String nickname;

        private String avatar;

        private String gender;

        private String phone;

        private String password;

        private String id;

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone, "The property \"phone\" cannot be null");
            return this;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password, "The property \"password\" cannot be null");
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public UserInput build() {
            UserInput _input = new UserInput();
            _input.setNickname(nickname);
            _input.setAvatar(avatar);
            _input.setGender(gender);
            if (phone == null) {
                throw Input.unknownNonNullProperty(UserInput.class, "phone");
            }
            _input.setPhone(phone);
            if (password == null) {
                throw Input.unknownNonNullProperty(UserInput.class, "password");
            }
            _input.setPassword(password);
            _input.setId(id);
            return _input;
        }
    }
}
