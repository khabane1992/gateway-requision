package sn.sonatel.dsi.dac.dif.requision.repository;

import sn.sonatel.dsi.dac.dif.requision.domain.JobHistory;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the JobHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, Long> {
}
