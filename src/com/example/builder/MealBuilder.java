package com.example.builder;

public class MealBuilder {
    private Meal meal;

    public MealBuilder() {
        meal = new Meal();
    }

    public MealBuilder buildDrink(String drink) {
        meal.setDrink(drink);
        return this;
    }

    public MealBuilder buildMainCourse(String mainCourse) {
        meal.setMainCourse(mainCourse);
        return this;
    }

    public Meal build() {
        return meal;
    }
}
