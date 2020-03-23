package guru.springframework.spring5recipedemo.services;

import guru.springframework.spring5recipedemo.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
