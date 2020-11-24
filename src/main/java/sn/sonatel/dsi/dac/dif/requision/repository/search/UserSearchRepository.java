package sn.sonatel.dsi.dac.dif.requision.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sn.sonatel.dsi.dac.dif.requision.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
