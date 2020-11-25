package sn.sonatel.dsi.dac.dif.requision.repository;

import sn.sonatel.dsi.dac.dif.requision.domain.Employee;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Employee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
