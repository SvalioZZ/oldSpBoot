package com.example.myspringboot.model;
import com.example.springboot.model.Ingredient;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class MyMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String name;
    private String description;
    private double price;
    private boolean isSummerMeal;
    
    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ingredient> ingredients;
    
    public MyMeal(String name, String description, double price, boolean isSummerMeal) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSummerMeal = isSummerMeal;
    }
    
    public MyMeal() {
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return price;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    public boolean isSummerMeal() {
        return isSummerMeal;
    }
    
    public void setSummerMeal(boolean summerMeal) {
        isSummerMeal = summerMeal;
    }
    
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                       ", description='" + description + '\'' +
                       ", price=" + price;
    }
}

