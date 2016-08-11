package com.travellazy;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class AppTest  {

    @Test
    public void expectedOutputForMod15andMod3andMod5() {
        App app = new App();
        String actual = app.applyForRange(1, 20);
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", actual);
    }
}
