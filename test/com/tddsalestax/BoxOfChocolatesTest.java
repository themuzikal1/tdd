package com.tddsalestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxOfChocolatesTest {

    @Test
    public void checkValidBoxOfChocolatesPrice(){
        BoxOfChocolates validator = new BoxOfChocolates();
        boolean result = validator.checkBoxOfChocolatesPrice(10.00);
        assertTrue(result);

    }
    @Test
    public void checkInvalidBoxOfChocolatesPrice(){
        BoxOfChocolates validator = new BoxOfChocolates();
        boolean result = validator.checkBoxOfChocolatesPrice(0.00);
        assertFalse(result);

    }
}
