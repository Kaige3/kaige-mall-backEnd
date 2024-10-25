package kaigee.top.user.entity;

import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.internal.GeneratedBy;

@GeneratedBy
public interface Objects {
    static User createUser(DraftConsumer<UserDraft> block) {
        return UserDraft.$.produce(block);
    }

    static User createUser(User base, DraftConsumer<UserDraft> block) {
        return UserDraft.$.produce(base, block);
    }
}
