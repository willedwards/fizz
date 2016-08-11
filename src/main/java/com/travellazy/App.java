package com.travellazy;


import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.applyForRange(1, 20,
                Arrays.asList(
                new DefaultReplacement(15,"fizzbuzz"),
                new DefaultReplacement(3,"fizz"),
                new DefaultReplacement(5,"buzz")
                )
                ));
    }

    public String applyForRange(int start, int end, final List<Replacement> replacements){


        ReplacementLogic replacementLogic = new ReplacementLogic(replacements);
        StringBuilder sb = new StringBuilder();

        for(int i = start; i<=end; i++){

            String value = replacementLogic.applyReplacementsToNumber(i);
            sb.append(value).append(" ");

        }

        return sb.substring(0, sb.length() - 1);
    }
}
