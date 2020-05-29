package org.example.model;
/*
void addCurrency (int amount)-
Add to the deposit pool (moneyPool).
oProduct request (int productNumber)-Buy a Product.
o int endSession ()Returns change and resets the deposit pool.oString getDescription (int productNumber)-View a product description.
o int getBalance ()-Returns the deposit pool amount.oString [] getProducts ()-Returns all Products' names and product numbers
 */

public interface VendingMachine {


    void addCurrency (int amount);
    Product request(int productNumber);
    int endSession ();
    String getDescription (int productNumber);
    int getBalance ();
    String [] getProduct();



}
