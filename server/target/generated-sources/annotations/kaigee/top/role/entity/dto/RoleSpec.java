package kaigee.top.role.entity.dto;

import io.qifan.infrastructure.generator.core.GenEntity;
import io.qifan.infrastructure.generator.core.GenField;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Objects;
import kaigee.top.role.entity.Role;
import kaigee.top.role.entity.RoleProps;
import kaigee.top.role.entity.RoleTable;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        file = "<server>/src/main/dto/kaigee/top/role/entity/Role.dto"
)
@GenEntity
public class RoleSpec implements JSpecification<Role, RoleTable> {
    private String name;

    private String id;

    private LocalDateTime minEditedTime;

    private LocalDateTime maxEditedTime;

    private LocalDateTime minCreatedTime;

    private LocalDateTime maxCreatedTime;

    public RoleSpec() {
    }

    @Nullable
    @GenField(
            value = "角色名称",
            order = 0
    )
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
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

    @Override
    public Class<Role> entityType() {
        return Role.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Role, RoleTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.like(new ImmutableProp[] { RoleProps.NAME.unwrap() }, this.name, true, false, false);
        __applier.like(new ImmutableProp[] { RoleProps.ID.unwrap() }, this.id, true, false, false);
        __applier.ge(RoleProps.EDITED_TIME.unwrap(), this.minEditedTime);
        __applier.le(RoleProps.EDITED_TIME.unwrap(), this.maxEditedTime);
        __applier.ge(RoleProps.CREATED_TIME.unwrap(), this.minCreatedTime);
        __applier.le(RoleProps.CREATED_TIME.unwrap(), this.maxCreatedTime);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(name);
        hash = hash * 31 + Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(minEditedTime);
        hash = hash * 31 + Objects.hashCode(maxEditedTime);
        hash = hash * 31 + Objects.hashCode(minCreatedTime);
        hash = hash * 31 + Objects.hashCode(maxCreatedTime);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        RoleSpec other = (RoleSpec) o;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(minEditedTime, other.minEditedTime)) {
            return false;
        }
        if (!Objects.equals(maxEditedTime, other.maxEditedTime)) {
            return false;
        }
        if (!Objects.equals(minCreatedTime, other.minCreatedTime)) {
            return false;
        }
        if (!Objects.equals(maxCreatedTime, other.maxCreatedTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleSpec").append('(');
        builder.append("name=").append(name);
        builder.append(", id=").append(id);
        builder.append(", minEditedTime=").append(minEditedTime);
        builder.append(", maxEditedTime=").append(maxEditedTime);
        builder.append(", minCreatedTime=").append(minCreatedTime);
        builder.append(", maxCreatedTime=").append(maxCreatedTime);
        builder.append(')');
        return builder.toString();
    }
}
