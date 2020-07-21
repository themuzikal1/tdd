package com.tddsalestax;

public class BasicSalesTax {
    static int qty = 0;
    static String productName = null;
    static float price = 0.0f;
    static boolean imported = false;
    static boolean exempted = false;
    static float tax = 0.0f;

    static void calculateSalesTax() {
        float totalTax = 0.0f;
        if(imported)
            totalTax = 0.05f;
        if(!exempted)
            totalTax = .1f;
        if((imported) && (!exempted))
            totalTax = .15f;
        tax = totalTax * price;
    }
    public String toString() {
        float p = price + tax;
        return qty + " " + productName + " at " + p;
    }

    public boolean checkBasicSalesTax(double basicSalesTax) {
        if (basicSalesTax == 0.10) {
            return true;
        }
            return false;
    }
}
