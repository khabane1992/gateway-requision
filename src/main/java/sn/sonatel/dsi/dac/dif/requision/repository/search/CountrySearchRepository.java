package sn.sonatel.dsi.dac.dif.requision.repository.search;

import sn.sonatel.dsi.dac.dif.requision.domain.Country;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Country} entity.
 */
public interface CountrySearchRepository extends ElasticsearchRepository<Country, Long> {
}
