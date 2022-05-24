package ru.kosmos.jrtb.service;

/**
 * Service for finding new Posts.
 */
public interface FindNewPostService {

    /**
     * Find new Posts and notify subscribers about it.
     */
    void findNewPosts();

}