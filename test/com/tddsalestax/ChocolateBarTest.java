package com.tddsalestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateBarTest {
    @Test
    public void checkValidBookPrice(){
        ChocolateBar validator = new ChocolateBar();
        boolean result = validator.checkChocolateBarPrice(0.85);
        assertTrue(result);

    }
    @Test
    public void checkInvalidBookPrice(){
        ChocolateBar validator = new ChocolateBar();
        boolean result = validator.checkChocolateBarPrice(0.00);
        assertFalse(result);


    }
}
