package ru.kosmos.jrtb.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.kosmos.jrtb.service.FindNewPostService;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Job for finding new Posts.
 */
@Slf4j
@Component
public class FindNewPostsJob {

    private final FindNewPostService findNewPostService;

    @Autowired
    public FindNewPostsJob(FindNewPostService findNewPostService) {
        this.findNewPostService = findNewPostService;
    }

    @Scheduled(fixedRateString = "${bot.recountNewPostFixedRate}")
    public void findNewPosts() {
        LocalDateTime start = LocalDateTime.now();

        log.info("Find new Post job started.");

        findNewPostService.findNewPosts();

        LocalDateTime end = LocalDateTime.now();

        log.info("Find new Posts job finished. Took seconds: {}",
                end.toEpochSecond(ZoneOffset.UTC) - start.toEpochSecond(ZoneOffset.UTC));
    }

}