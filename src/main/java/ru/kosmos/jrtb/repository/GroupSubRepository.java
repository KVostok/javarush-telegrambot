package ru.kosmos.jrtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kosmos.jrtb.repository.entity.GroupSub;

/**
 * {@link Repository} for {@link GroupSub} entity.
 */
@Repository
public interface GroupSubRepository extends JpaRepository<GroupSub, Integer> {
}