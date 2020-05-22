package com.example.burger0520.dto;

import com.example.burger0520.vo.Ingredient;
import lombok.Data;

@Data
public class IngredientForm {

    private Integer id;
    private String name;
    private Integer price;

    public Ingredient toEntity() {
        return new Ingredient(id, name, price);
    }
}
