package org.example.model;

public class Drink extends Product {
    private int calories;

    public Drink(int productId, String productName, int i, int price, int calories) {
        super(productId, productName, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "calories=" + calories +
                '}';
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
