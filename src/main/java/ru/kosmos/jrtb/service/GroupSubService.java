package ru.kosmos.jrtb.service;

import ru.kosmos.jrtb.javarushclient.dto.GroupDiscussionInfo;
import ru.kosmos.jrtb.repository.entity.GroupSub;

import java.util.Optional;

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

    /**
     * Save provided {@link GroupSub} entity.
     *
     * @param groupSub provided group subscription
     * @return {@link GroupSub}
     */
    GroupSub save(GroupSub groupSub);

    /**
     * Find {@link GroupSub} by id.
     *
     * @param id provided ID
     * @return {@link GroupSub} with provided ID or null otherwise.
     */
    Optional<GroupSub> findById(Integer id);

}