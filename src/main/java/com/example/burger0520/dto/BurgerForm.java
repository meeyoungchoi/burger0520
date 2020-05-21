package com.example.burger0520.dto;

import com.example.burger0520.vo.Burger;
import lombok.Data;

@Data
public class BurgerForm {
    private Integer id;
    private String name;
    private Integer price;

    public Burger toEntity() {
        return new Burger(id, name, price);
    }


}
