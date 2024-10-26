package kaigee.top.role.entity;

import kaigee.top.infrastructure.jimmer.BaseEntity;
import kaigee.top.menu.entity.Menu;
import org.babyfish.jimmer.sql.*;


/**
 * Entity for table "role_menu_rel"
 */
@Entity
public interface RoleMenuRel extends BaseEntity {


    @Key
    @ManyToOne
    @OnDissociate(DissociateAction.DELETE)
    Role role();

    @Key
    @ManyToOne
    @OnDissociate(DissociateAction.DELETE)
    Menu menu();
}

