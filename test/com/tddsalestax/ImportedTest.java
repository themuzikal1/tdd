package com.tddsalestax;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedTest {

    @Test
    public void isImported() {
        Imported validator = new Imported();
        boolean result = validator.checkIfImported("true");
        assertTrue(result);

    }
    @Test
    public void isNotImported() {
        Imported validator = new Imported();
        boolean result = validator.checkIfImported("false");
        assertFalse(result);


    }

}
