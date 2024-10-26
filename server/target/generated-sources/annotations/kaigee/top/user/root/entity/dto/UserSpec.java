package kaigee.top.user.root.entity.dto;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import io.qifan.infrastructure.generator.core.ItemType;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Objects;
import kaigee.top.dict.model.DictConstants;
import kaigee.top.user.root.entity.User;
import kaigee.top.user.root.entity.UserProps;
import kaigee.top.user.root.entity.UserTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/user/entity/User.dto"
)
@GenEntity
public class UserSpec implements JSpecification<User, UserTable> {
    private DictConstants.SEX gender;

    private String status;

    private String password;

    private String id;

    private String nickname;

    private String avatar;

    private String phone;

    private LocalDateTime minCreatedTime;

    private LocalDateTime maxCreatedTime;

    private LocalDateTime minEditedTime;

    private LocalDateTime maxEditedTime;

    public UserSpec() {
    }

    @Nullable
    @GenField(
            value = "性别",
            order = 4,
            type = ItemType.SELECTABLE,
            dictEnName = "SEX"
    )
    public DictConstants.SEX getGender() {
        return gender;
    }

    public void setGender(@Nullable DictConstants.SEX gender) {
        this.gender = gender;
    }

    @Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@Nullable String status) {
        this.status = status;
    }

    @Nullable
    @GenField(
            value = "密码",
            order = 1
    )
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
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
            value = "手机号",
            order = 0
    )
    public String getPhone() {
        return phone;
    }

    public void setPhone(@Nullable String phone) {
        this.phone = phone;
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

    @Override
    public Class<User> entityType() {
        return User.class;
    }

    @Override
    public void applyTo(SpecificationArgs<User, UserTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.eq(new ImmutableProp[] { UserProps.GENDER.unwrap() }, this.gender);
        __applier.eq(new ImmutableProp[] { UserProps.STATUS.unwrap() }, this.status);
        __applier.like(new ImmutableProp[] { UserProps.PASSWORD.unwrap() }, this.password, true, false, false);
        __applier.like(new ImmutableProp[] { UserProps.ID.unwrap() }, this.id, true, false, false);
        __applier.like(new ImmutableProp[] { UserProps.NICKNAME.unwrap() }, this.nickname, true, false, false);
        __applier.like(new ImmutableProp[] { UserProps.AVATAR.unwrap() }, this.avatar, true, false, false);
        __applier.like(new ImmutableProp[] { UserProps.PHONE.unwrap() }, this.phone, true, false, false);
        __applier.ge(UserProps.CREATED_TIME.unwrap(), this.minCreatedTime);
        __applier.le(UserProps.CREATED_TIME.unwrap(), this.maxCreatedTime);
        __applier.ge(UserProps.EDITED_TIME.unwrap(), this.minEditedTime);
        __applier.le(UserProps.EDITED_TIME.unwrap(), this.maxEditedTime);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(gender);
        hash = hash * 31 + Objects.hashCode(status);
        hash = hash * 31 + Objects.hashCode(password);
        hash = hash * 31 + Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(nickname);
        hash = hash * 31 + Objects.hashCode(avatar);
        hash = hash * 31 + Objects.hashCode(phone);
        hash = hash * 31 + Objects.hashCode(minCreatedTime);
        hash = hash * 31 + Objects.hashCode(maxCreatedTime);
        hash = hash * 31 + Objects.hashCode(minEditedTime);
        hash = hash * 31 + Objects.hashCode(maxEditedTime);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserSpec other = (UserSpec) o;
        if (!Objects.equals(gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(status, other.status)) {
            return false;
        }
        if (!Objects.equals(password, other.password)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(avatar, other.avatar)) {
            return false;
        }
        if (!Objects.equals(phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(minCreatedTime, other.minCreatedTime)) {
            return false;
        }
        if (!Objects.equals(maxCreatedTime, other.maxCreatedTime)) {
            return false;
        }
        if (!Objects.equals(minEditedTime, other.minEditedTime)) {
            return false;
        }
        if (!Objects.equals(maxEditedTime, other.maxEditedTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserSpec").append('(');
        builder.append("gender=").append(gender);
        builder.append(", status=").append(status);
        builder.append(", password=").append(password);
        builder.append(", id=").append(id);
        builder.append(", nickname=").append(nickname);
        builder.append(", avatar=").append(avatar);
        builder.append(", phone=").append(phone);
        builder.append(", minCreatedTime=").append(minCreatedTime);
        builder.append(", maxCreatedTime=").append(maxCreatedTime);
        builder.append(", minEditedTime=").append(minEditedTime);
        builder.append(", maxEditedTime=").append(maxEditedTime);
        builder.append(')');
        return builder.toString();
    }
}
