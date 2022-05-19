package ru.kosmos.jrtb.service;

import ru.kosmos.jrtb.javarushclient.dto.GroupDiscussionInfo;
import ru.kosmos.jrtb.repository.entity.GroupSub;

/**
 * Service for manipulating with {@link GroupSub}.
 */
public interface GroupSubService {

    /**
     * Save provided {@link GroupDiscussionInfo} dto.
     *
     * @param chatId              provided Chat ID
     * @param groupDiscussionInfo provided group discussion info
     * @return {@link GroupSub}
     */
    GroupSub save(String chatId, GroupDiscussionInfo groupDiscussionInfo);

}