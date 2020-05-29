package org.example.model;

public class Sweet extends Product {
        private int calories;

    public Sweet(int productId, String productName, int price, int calories) {
        super(productId, productName, price);
        this.calories = calories;


        // int wats;

        //  wat = watsOfTheBatter ;
    }

    public int getCalories() {
        return calories;
    }

    //public void setCalories(int calories) {
      //  this.calories = calories;
     //}

    @Override
    public String toString() {
        return "Sweet{" +
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
