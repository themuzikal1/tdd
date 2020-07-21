package com.tddsalestax;

import java.util.ArrayList;
import java.util.Scanner;

import static com.tddsalestax.BasicSalesTax.tax;

public class SalesTax {
    public static void main(String[] args) {
        SalesTax st = new SalesTax();
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int no = 1;
        while(true) {
            BasicSalesTax bst = new BasicSalesTax();
            System.out.println("Add Products: " + no);
            System.out.println("Quantity: ");
            int qty = input.nextInt();
            BasicSalesTax.qty = qty;
            System.out.println("Product Name: ");
            String prod = input.next();
            BasicSalesTax.productName = prod;
            System.out.println("Price: ");
            float p = input.nextFloat();
            BasicSalesTax.price = p;
            System.out.println("Is the item Imported?[y/n]: ");
            String imp = input.next();
            if(imp.toLowerCase().equals("y"))
                BasicSalesTax.imported = true;
            System.out.println("Is the item Exempted?[y/n]");
            String exe = input.next();
            if(exe.toLowerCase().equals("y"))
                BasicSalesTax.exempted = true;
            BasicSalesTax.calculateSalesTax();
            list.add(tax);
            no++;
            System.out.println("Would you like to add more products? [y/n]: ");
            String add = input.next();
            if(add.toLowerCase().equals("n"))
                break;

        }
        float tp = 0.0f;
        float tt = 0.0f;
        for(int i = 0; i<list.size(); i++) {
            BasicSalesTax.tax = (float) list.get(i);
            tp += BasicSalesTax.price;
            tt += tax;
            System.out.println(tax);
        }
        System.out.println("Sales Tax: " + tt);
        System.out.println("Total: "+ (tp + tt));

}

}
