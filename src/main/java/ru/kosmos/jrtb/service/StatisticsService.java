package ru.kosmos.jrtb.service;

import ru.kosmos.jrtb.dto.StatisticDTO;

/**
 * Service for getting bot statistics.
 */
public interface StatisticsService {

    StatisticDTO countBotStatistic();

}