package ru.kosmos.jrtb.javarushclient;

import ru.kosmos.jrtb.javarushclient.dto.GroupDiscussionInfo;
import ru.kosmos.jrtb.javarushclient.dto.GroupInfo;
import ru.kosmos.jrtb.javarushclient.dto.GroupRequestArgs;
import ru.kosmos.jrtb.javarushclient.dto.GroupsCountRequestArgs;
import ru.kosmos.jrtb.repository.entity.GroupSub;

import java.util.List;

/**
 * Client for Javarush Open API corresponds to Groups.
 */
public interface JavaRushGroupClient {

    /**
     * Get all the {@link GroupInfo} filtered by provided {@link GroupRequestArgs}.
     *
     * @param requestArgs provided {@link GroupRequestArgs}.
     * @return the collection of the {@link GroupInfo} objects.
     */
    List<GroupInfo> getGroupList(GroupRequestArgs requestArgs);

    /**
     * Get all the {@link GroupDiscussionInfo} filtered by provided {@link GroupRequestArgs}.
     *
     * @param requestArgs provided {@link GroupRequestArgs}
     * @return the collection of the {@link GroupDiscussionInfo} objects.
     */
    List<GroupDiscussionInfo> getGroupDiscussionList(GroupRequestArgs requestArgs);

    /**
     * Get count of groups filtered by provided {@link GroupRequestArgs}.
     *
     * @param countRequestArgs provided {@link GroupsCountRequestArgs}.
     * @return the count of the groups.
     */
    Integer getGroupCount(GroupsCountRequestArgs countRequestArgs);

    /**
     * Get {@link GroupDiscussionInfo} by provided ID.
     *
     * @param id provided ID.
     * @return {@link GroupDiscussionInfo} object.
     */
    GroupDiscussionInfo getGroupById(Integer id);

    /**
     * Get last Post ID.
     *
     * @param groupSub provided {@link GroupSub}.
     * @return id of last Post.
     */
    Integer findLastPostId(Integer groupSub);

}