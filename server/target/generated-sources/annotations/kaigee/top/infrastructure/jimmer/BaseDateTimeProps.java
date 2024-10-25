package kaigee.top.infrastructure.jimmer;

import java.time.LocalDateTime;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = BaseDateTime.class
)
@PropsFor(BaseDateTime.class)
public interface BaseDateTimeProps extends Props {
    TypedProp.Scalar<BaseDateTime, LocalDateTime> CREATED_TIME = 
        TypedProp.scalar(ImmutableType.get(BaseDateTime.class).getProp("createdTime"));

    TypedProp.Scalar<BaseDateTime, LocalDateTime> EDITED_TIME = 
        TypedProp.scalar(ImmutableType.get(BaseDateTime.class).getProp("editedTime"));

    PropExpression.Cmp<LocalDateTime> createdTime();

    PropExpression.Cmp<LocalDateTime> editedTime();
}
