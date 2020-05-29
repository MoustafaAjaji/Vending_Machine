package org.example.model;

import java.util.Scanner;

public enum Denominations {

    kr1(1),
    kr2(2),
    kr5(5),
    kr10(10),
    kr20(20),
    kr50(50),
    kr100(100),
    kr200(200),
    kr500(500),
    kr1000(1000);

    private int denomValue;

    Denominations(int denomValue){
        this.denomValue =denomValue;
    }

    public int getDenomInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please insert money to get product ");
        int denomInput = sc.nextInt();
        return denomInput;
    }

    public int getDenomValue() {
        return denomValue;
    }

    public void setDenomValue(int denomValue) {
        this.denomValue = denomValue;
    }
}
