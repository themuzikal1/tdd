package com.tddsalestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeadachePillsTest {

    @Test
    public void checkValidHeadachePillsPrice() {
        HeadachePills validator = new HeadachePills();
        boolean result = validator.checkHeadachePillsPrice(9.75);
        assertTrue(result);
    }

    @Test
    public void checkinvalidHeadachePillsPrice() {
        HeadachePills validator = new HeadachePills();
        boolean result = validator.checkHeadachePillsPrice(0.00);
        assertFalse(result);

    }
}
