package sn.sonatel.dsi.dac.dif.requision.repository.search;

import sn.sonatel.dsi.dac.dif.requision.domain.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Job} entity.
 */
public interface JobSearchRepository extends ElasticsearchRepository<Job, Long> {
}
