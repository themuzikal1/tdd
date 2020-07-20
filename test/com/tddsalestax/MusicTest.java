package com.tddsalestax;

import org.junit.Test;


import static org.junit.Assert.*;

public class MusicTest {

    @Test
    public void checkValidMusicPrice() {
        Music validator = new Music();
        boolean result = validator.checkMusicPrice(14.99);
        assertTrue(result);
    }
    @Test
    public void checkInvalidMusicPrice() {
        Music validator = new Music();
        boolean result = validator.checkMusicPrice(0);
        assertFalse(result);

    }
}
