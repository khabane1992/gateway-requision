package sn.sonatel.dsi.dac.dif.requision.repository.search;

import sn.sonatel.dsi.dac.dif.requision.domain.Region;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Region} entity.
 */
public interface RegionSearchRepository extends ElasticsearchRepository<Region, Long> {
}
