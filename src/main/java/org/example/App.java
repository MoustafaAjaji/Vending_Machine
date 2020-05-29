package org.example;

import org.example.model.Denominations;
import org.example.model.Product;
import org.example.model.VM_Implement;
import org.example.model.VendingMachine;

import java.util.Scanner;

import static org.example.model.Denominations.*;

public class App {


    public static void main( String[] args ) {

        System.out.println("nmg");

        VendingMachine candy = new VM_Implement();

            Scanner m1 = new Scanner(System.in);
            int p1 = m1.nextInt();

            candy.addCurrency(p1);










/*

        System.out.println("Vending Machine");

        Product drink= new Product(2,"coca cola",10);

        int drinkc = drink.getPrice();
        int drinkb = drink.getProductId();
        String drinkd = drink.getProductName();

        System.out.println(drinkc);
        System.out.println(drinkb);
        System.out.println(drinkd);


        Product sweet = new Product(1,"kanelbulle",8);
        Product food = new Product(6,"salmon sandwish",60);
        Product fruit = new Product(9,"apple",15);


        Denominations[] Denoms = {kr1,kr2,kr5,kr10,kr20,kr50,kr100,kr200,kr500,kr1000};

        System.out.println("The total deposit is " + getDenmoInput(Denoms) + " krs");
    }

    public static int getDenmoInput(Denominations... denominations) {
        int sum = 0;
        for (Denominations denoms : denominations) {
            sum = sum + denoms.getDenomInput();
        }
        return sum;
  */
    }

}