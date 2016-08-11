package com.travellazy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class AppTest  {


    @Test
    public void expectedOutputForFirst3() {
        App app = new App(Arrays.asList( new DefaultReplacement(3, "fizz") ));
        String actual = app.applyForRange(1, 3);
        assertEquals("1 2 fizz", actual);
    }

    @Test
    public void expectedOutputForFirst5() {
        App app = new App(Arrays.asList(
                new DefaultReplacement(3, "fizz"),
                new DefaultReplacement(5, "buzz")
        ));

        String actual = app.applyForRange(1, 5);

        assertEquals("1 2 fizz 4 buzz", actual);
    }

    @Test
    public void expectedOutputForFirst6() {
        App app = new App(Arrays.asList(
                new DefaultReplacement(3, "fizz"),
                new DefaultReplacement(5, "buzz")
        ));

        String actual = app.applyForRange(1, 6);

        assertEquals("1 2 fizz 4 buzz fizz", actual);
    }

    @Test
    public void expectedOutputForMod15andMod3andMod5() {
        App app = new App(Arrays.asList(  new DefaultReplacement(15, "fizzbuzz"),
                new DefaultReplacement(3, "fizz"),
                new DefaultReplacement(5, "buzz")
        ));

        String actual = app.applyForRange(1, 20);

        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", actual);
    }

    @Test
    public void expectedOutputForLuckMod15andMod3andMod5() {
        App app = new App(Arrays.asList(
                new LuckyReplacement('3', "luck"),
                new DefaultReplacement(15, "fizzbuzz"),
                new DefaultReplacement(3, "fizz"),
                new DefaultReplacement(5, "buzz")
        ));

        String actual = app.applyForRange(1, 20);

        assertEquals("1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz", actual);
    }


    @Test
    public void expectedOutputForLuckMod15andMod3andMod5AndCount() {
        App app = new App(Arrays.asList(
                new LuckyReplacement('3', "luck"),
                new DefaultReplacement(15, "fizzbuzz"),
                new DefaultReplacement(3, "fizz"),
                new DefaultReplacement(5, "buzz")
        ));

        String actual = app.applyForRangeWithStats(1, 20);

        assertEquals("1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz" +
                "\nluck : 2" +
                "\nfizzbuzz : 1" +
                "\nfizz : 4" +
                "\nbuzz : 3" +
                "\nnumber : 10", actual);
    }
}
