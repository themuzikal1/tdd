package com.tddsalestax;

public class ChocolateBar {

    private String name;
    private double price;

    public ChocolateBar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ChocolateBar() {

    }

    public boolean checkChocolateBarPrice(double chocolateBarPrice) {
        if (chocolateBarPrice == 0.85) {
            return true;
        }
        return false;
    }
}
