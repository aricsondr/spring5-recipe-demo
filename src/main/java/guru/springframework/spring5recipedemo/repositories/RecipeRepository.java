package guru.springframework.spring5recipedemo.repositories;

import guru.springframework.spring5recipedemo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
