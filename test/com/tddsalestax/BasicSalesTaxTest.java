package com.tddsalestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicSalesTaxTest {

    @Test
    public void checkValidBasicSalesTax() {
       BasicSalesTax validator = new BasicSalesTax();
       boolean result = validator.checkBasicSalesTax(0.10);
       assertTrue(result);

    }

    @Test
    public void checkInvalidBasicSalesTax() {
        BasicSalesTax validator = new BasicSalesTax();
        boolean result = validator.checkBasicSalesTax(0.20);
        assertFalse(result);

    }

}
