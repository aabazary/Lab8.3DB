package edu.sdccd.cisc191.dblab.repositories;

import edu.sdccd.cisc191.dblab.models.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, String> {
}
