package com.example.builder;

public class Meal {
    private String drink;
    private String mainCourse;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    @Override
    public String toString() {
        return "Meal [drink=" + drink + ", mainCourse=" + mainCourse + "]";
    }

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.buildDrink("Coke").buildMainCourse("Burger").build();
        System.out.println(meal);
    }
}
