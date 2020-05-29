package org.example.model;

public abstract class Product {

    public static int counter=0;
    private int productId;
    private String productName;
    private int price;

    public Product(int productId, String productName, int price) {
        this.productId = ++counter;
        setProductName (productName);
        setPrice(price);
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "productId=" + productId +
                        ", productName='" + productName + '\'' +
                        ", price=" + price ;
    }

    public abstract String use();
    public abstract String examine();

    public abstract int getSize();

    public abstract int getCalories();
}
