package kaigee.top.infrastructure.jimmer;

import java.time.LocalDateTime;
import java.util.Collections;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = BaseDateTime.class
)
public interface BaseDateTimeDraft extends BaseDateTime, Draft {
    BaseDateTimeDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    BaseDateTimeDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    BaseDateTimeDraft setEditedTime(LocalDateTime editedTime);

    @GeneratedBy(
            type = BaseDateTime.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                BaseDateTime.class,
                Collections.emptyList(),
                null
            )
            .add(-1, "createdTime", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(-1, "editedTime", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .build();

        private Producer() {
        }
    }
}
