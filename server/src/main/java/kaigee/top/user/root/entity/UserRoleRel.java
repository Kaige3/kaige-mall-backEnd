package kaigee.top.user.root.entity;

import kaigee.top.infrastructure.jimmer.BaseEntity;
import kaigee.top.role.entity.Role;
import org.babyfish.jimmer.sql.*;

/**
 * Entity for table "user_role_rel"
 */
@Entity
public interface UserRoleRel extends BaseEntity {

    @ManyToOne
    @Key
    @OnDissociate(DissociateAction.DELETE)
    User user();

    @OnDissociate(DissociateAction.DELETE)
    @ManyToOne
    @Key
    Role role();
}

