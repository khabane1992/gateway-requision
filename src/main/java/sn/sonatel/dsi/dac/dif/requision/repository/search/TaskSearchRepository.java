package sn.sonatel.dsi.dac.dif.requision.repository.search;

import sn.sonatel.dsi.dac.dif.requision.domain.Task;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Task} entity.
 */
public interface TaskSearchRepository extends ElasticsearchRepository<Task, Long> {
}
