package kaigee.top.user.root.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserDraft;
import kaigee.top.user.root.entity.UserFetcher;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/user/entity/User.dto"
)
@JsonDeserialize(
        builder = UserLoginInput.Builder.class
)
@GenEntity
public class UserLoginInput implements Input<User> {
    public static final DtoMetadata<User, UserLoginInput> METADATA = 
        new DtoMetadata<User, UserLoginInput>(
            UserFetcher.$
                .phone()
                .password(),
            UserLoginInput::new
    );

    @FixedInputField
    private String phone;

    @FixedInputField
    private String password;

    public UserLoginInput() {
    }

    public UserLoginInput(@NotNull User base) {
        this.phone = base.phone();
        this.password = base.password();
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

    @Override
    public User toEntity() {
        return UserDraft.$.produce(__draft -> {
            __draft.setPhone(phone);
            __draft.setPassword(password);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(phone);
        hash = hash * 31 + Objects.hashCode(password);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserLoginInput other = (UserLoginInput) o;
        if (!Objects.equals(phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserLoginInput").append('(');
        builder.append("phone=").append(phone);
        builder.append(", password=").append(password);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String phone;

        private String password;

        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone, "The property \"phone\" cannot be null");
            return this;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password, "The property \"password\" cannot be null");
            return this;
        }

        public UserLoginInput build() {
            UserLoginInput _input = new UserLoginInput();
            if (phone == null) {
                throw Input.unknownNonNullProperty(UserLoginInput.class, "phone");
            }
            _input.setPhone(phone);
            if (password == null) {
                throw Input.unknownNonNullProperty(UserLoginInput.class, "password");
            }
            _input.setPassword(password);
            return _input;
        }
    }
}
