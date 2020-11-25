package sn.sonatel.dsi.dac.dif.requision.repository;

import sn.sonatel.dsi.dac.dif.requision.domain.Region;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Region entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
