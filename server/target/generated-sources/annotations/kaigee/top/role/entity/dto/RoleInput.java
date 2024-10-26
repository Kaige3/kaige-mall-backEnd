package kaigee.top.role.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.Objects;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleDraft;
import kaigee.top.role.entity.RoleFetcher;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/role/entity/Role.dto"
)
@JsonDeserialize(
        builder = RoleInput.Builder.class
)
@GenEntity
public class RoleInput implements Input<Role> {
    public static final DtoMetadata<Role, RoleInput> METADATA = 
        new DtoMetadata<Role, RoleInput>(
            RoleFetcher.$
                .name(),
            RoleInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { RoleDraft.Producer.SLOT_ID }
    );

    @FixedInputField
    private String name;

    private String id;

    private String[] menuIds;

    public RoleInput() {
    }

    public RoleInput(@NotNull Role base) {
        this.name = base.name();
        this.id = ID_ACCESSOR.get(base);
    }

    @NotNull
    @GenField(
            value = "角色名称",
            order = 0
    )
    public String getName() {
        if (name == null) {
            throw new IllegalStateException("The property \"name\" is not specified");
        }
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @NotNull
    public String[] getMenuIds() {
        if (menuIds == null) {
            throw new IllegalStateException("The property \"menuIds\" is not specified");
        }
        return menuIds;
    }

    public void setMenuIds(@NotNull String[] menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(__draft -> {
            __draft.setName(name);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(id);
        hash = hash * 31 + Arrays.hashCode(menuIds);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        RoleInput other = (RoleInput) o;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Arrays.equals(menuIds, other.menuIds)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleInput").append('(');
        builder.append("name=").append(name);
        builder.append(", id=").append(id);
        builder.append(", menuIds=").append(menuIds);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String name;

        private String id;

        private String[] menuIds;

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name, "The property \"name\" cannot be null");
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder menuIds(String[] menuIds) {
            this.menuIds = Objects.requireNonNull(menuIds, "The property \"menuIds\" cannot be null");
            return this;
        }

        public RoleInput build() {
            RoleInput _input = new RoleInput();
            if (name == null) {
                throw Input.unknownNonNullProperty(RoleInput.class, "name");
            }
            _input.setName(name);
            _input.setId(id);
            _input.setMenuIds(menuIds);
            return _input;
        }
    }
}
