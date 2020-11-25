package sn.sonatel.dsi.dac.dif.requision.repository.search;

import sn.sonatel.dsi.dac.dif.requision.domain.JobHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link JobHistory} entity.
 */
public interface JobHistorySearchRepository extends ElasticsearchRepository<JobHistory, Long> {
}
