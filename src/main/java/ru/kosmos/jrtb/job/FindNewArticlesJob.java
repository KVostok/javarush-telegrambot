package ru.kosmos.jrtb.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.kosmos.jrtb.service.FindNewArticleService;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Job for finding new articles.
 */
@Slf4j
@Component
public class FindNewArticlesJob {

    private final FindNewArticleService findNewArticleService;

    @Autowired
    public FindNewArticlesJob(FindNewArticleService findNewArticleService) {
        this.findNewArticleService = findNewArticleService;
    }

    @Scheduled(fixedRateString = "${bot.recountNewArticleFixedRate}")
    public void findNewArticles() {
        LocalDateTime start = LocalDateTime.now();

        log.info("Find new article job started.");

        findNewArticleService.findNewArticles();

        LocalDateTime end = LocalDateTime.now();

        log.info("Find new articles job finished. Took seconds: {}",
                end.toEpochSecond(ZoneOffset.UTC) - start.toEpochSecond(ZoneOffset.UTC));
    }

}