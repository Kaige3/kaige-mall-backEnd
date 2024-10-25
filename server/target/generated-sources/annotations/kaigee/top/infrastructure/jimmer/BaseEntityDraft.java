package kaigee.top.infrastructure.jimmer;

import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collections;
import kaigee.top.user.entity.User;
import kaigee.top.user.entity.UserDraft;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.sql.ManyToOne;
import org.jetbrains.annotations.NotNull;

@GeneratedBy(
        type = BaseEntity.class
)
public interface BaseEntityDraft extends BaseEntity, BaseDateTimeDraft {
    BaseEntityDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    BaseEntityDraft setId(String id);

    @OldChain
    BaseEntityDraft setCreatedTime(LocalDateTime createdTime);

    @OldChain
    BaseEntityDraft setEditedTime(LocalDateTime editedTime);

    UserDraft editor();

    UserDraft editor(boolean autoCreate);

    @OldChain
    BaseEntityDraft setEditor(User editor);

    @NotNull
    String editorId();

    @OldChain
    BaseEntityDraft setEditorId(@NotNull String editorId);

    @OldChain
    BaseEntityDraft applyEditor(DraftConsumer<UserDraft> block);

    @OldChain
    BaseEntityDraft applyEditor(User base, DraftConsumer<UserDraft> block);

    UserDraft creator();

    UserDraft creator(boolean autoCreate);

    @OldChain
    BaseEntityDraft setCreator(User creator);

    @NotNull
    String creatorId();

    @OldChain
    BaseEntityDraft setCreatorId(@NotNull String creatorId);

    @OldChain
    BaseEntityDraft applyCreator(DraftConsumer<UserDraft> block);

    @OldChain
    BaseEntityDraft applyCreator(User base, DraftConsumer<UserDraft> block);

    @GeneratedBy(
            type = BaseEntity.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.186",
                BaseEntity.class,
                Collections.singleton(BaseDateTimeDraft.Producer.TYPE),
                null
            )
            .id(-1, "id", String.class)
            .add(-1, "editor", ManyToOne.class, User.class, false)
            .add(-1, "creator", ManyToOne.class, User.class, false)
            .build();

        private Producer() {
        }
    }
}
