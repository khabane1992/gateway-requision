package sn.sonatel.dsi.dac.dif.requision.repository;

import sn.sonatel.dsi.dac.dif.requision.domain.Department;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
