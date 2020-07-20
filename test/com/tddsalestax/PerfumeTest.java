package com.tddsalestax;

import org.junit.Test;

import static org.junit.Assert.*;


public class PerfumeTest {

    @Test
    public void checkValidPerfumePrice(){
        Perfume validator = new Perfume();
        boolean result = validator.checkPerfumePrice(47.50);
        assertTrue(result);
    }

    @Test
    public void checkInvalidPerfumePrice(){
        Perfume validator = new Perfume();
        boolean result = validator.checkPerfumePrice(0.00);
        assertFalse(result);
    }
    @Test
    public void zeroDollarAmountsNotAllowed(){

    }


}
