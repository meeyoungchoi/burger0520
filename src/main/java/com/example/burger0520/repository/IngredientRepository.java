package com.example.burger0520.repository;

import com.example.burger0520.vo.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
    @Override
    List<Ingredient> findAll();
}
