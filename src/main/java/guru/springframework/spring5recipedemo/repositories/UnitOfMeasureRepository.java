package guru.springframework.spring5recipedemo.repositories;

import guru.springframework.spring5recipedemo.domain.UnitofMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitofMeasure, Long> {
    Optional<UnitofMeasure> findByDescription(String description);
}
