package kaigee.top.infrastructure.jimmer;

//import io.qifan.mall.server.user.entity.kaigee.top.User.entity.User;
import kaigee.top.user.root.entity.User;
import org.babyfish.jimmer.sql.*;

@MappedSuperclass
public interface BaseEntity extends BaseDateTime {

  @Id
  @GeneratedValue(generatorType = UUIDIdGenerator.class)
  String id();

  @ManyToOne
  @OnDissociate(DissociateAction.SET_NULL)
  User editor();

  @ManyToOne
  @OnDissociate(DissociateAction.SET_NULL)
  User creator();
}