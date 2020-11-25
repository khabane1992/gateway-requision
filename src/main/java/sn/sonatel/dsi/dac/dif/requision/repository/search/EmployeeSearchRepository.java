package sn.sonatel.dsi.dac.dif.requision.repository.search;

import sn.sonatel.dsi.dac.dif.requision.domain.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Employee} entity.
 */
public interface EmployeeSearchRepository extends ElasticsearchRepository<Employee, Long> {
}
