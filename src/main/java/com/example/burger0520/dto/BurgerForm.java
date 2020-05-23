package com.example.burger0520.dto;

import com.example.burger0520.vo.Burger;
import com.example.burger0520.vo.Ingredient;
import lombok.Data;

import java.util.List;

@Data
public class BurgerForm {
    private Integer id;
    private String name;
    private Integer price;

    private List<Ingredient> ingredientList;

    public Burger toEntity() {
        return new Burger(id, name, price , ingredientList);
    }


}
