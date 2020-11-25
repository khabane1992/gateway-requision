package sn.sonatel.dsi.dac.dif.requision.repository;

import sn.sonatel.dsi.dac.dif.requision.domain.Task;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Task entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
