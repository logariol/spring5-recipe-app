package guru.springframework.repo;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UOMRepository extends CrudRepository<UnitOfMeasure, Long> {

}
