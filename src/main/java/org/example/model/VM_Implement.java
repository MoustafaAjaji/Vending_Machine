package org.example.model;

public class VM_Implement implements VendingMachine {

    int pool = 0;

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProduct() {
        return new String[0];
    }


    @Override
    public void addCurrency(int input) {
        pool= pool+input;
        System.out.println(pool);
    }
}
