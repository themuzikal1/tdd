package com.tddsalestax;

import org.junit.Test;

import static org.junit.Assert.*;


public class ImportDutyTest {

    @Test
    public void checkValidImportDuty() {
        ImportDuty validator = new ImportDuty();
        boolean result = validator.checkImportDuty(0.05);
        assertTrue(result);

    }
    @Test
    public void checkInValidImportDuty() {
        ImportDuty validator = new ImportDuty();
        boolean result = validator.checkImportDuty(0.04);
        assertFalse(result);


    }
}
