package ru.kosmos.jrtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kosmos.jrtb.repository.entity.TelegramUser;

import java.util.List;

/**
 * {@link Repository} for handling with {@link TelegramUser} entity.
 */
@Repository
public interface TelegramUserRepository extends JpaRepository<TelegramUser, String> {

    List<TelegramUser> findAllByActiveTrue();

}