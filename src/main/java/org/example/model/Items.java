package org.example.model;

import java.util.Arrays;

public class Items {

    private static Product[] items = new Product[0];

    public int size() {

        return items.length;
    }

    public Product[] findAll() {
        return items;
    }

    public Product addDrinkProduct(String ProductName, int itemPrice) {
        Product item = new Fruit(1,ProductName,itemPrice,300);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }

    public Product addSweetProduct(String ProductName, int itemPrice) {
        Product item = new Fruit(1,ProductName,itemPrice,600);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }

    public Product addFruitProduct(String ProductName, int itemPrice) {
        Product item = new Fruit(1,ProductName,itemPrice,400);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }


}
