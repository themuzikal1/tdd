package com.tddsalestax;


import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void checkValidBookPrice(){
        Book validator = new Book();
        boolean result = validator.checkBookPrice(12.49);
        assertTrue(result);


    }
    @Test
    public void checkInValidBookPrice(){
        Book validator = new Book();
        boolean result = validator.checkBookPrice(0);
        assertFalse(result);
    }

}
