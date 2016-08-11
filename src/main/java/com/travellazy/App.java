package com.travellazy;


import java.util.Arrays;
import java.util.List;

public class App {
    private final ReplacementLogic replacementLogic;

    public App(final List<Replacement> replacements) {
        replacementLogic  = new ReplacementLogic(replacements);
    }


    public static void main(String[] args) {
        App app = new App(Arrays.asList(
                new LuckyReplacement('3', "luck"),
                new DefaultReplacement(15, "fizzbuzz"),
                new DefaultReplacement(3, "fizz"),
                new DefaultReplacement(5, "buzz")
        ));

        System.out.println(app.applyForRangeWithStats(1, 20));
    }

    public String applyForRange(int start, int end) {

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {

            String value = replacementLogic.applyReplacementsToNumber(i);
            sb.append(value).append(" ");
        }

        return sb.substring(0, sb.length() - 1);

    }

    public String applyForRangeWithStats(int start, int end) {
        String outputLine = applyForRange(start,end);

        String replacedStats = replacementLogic.getStats();

        int numberReplaced = replacementLogic.totalReplacedCount();

        int numberUntouched = (end - start + 1) - numberReplaced;

        return outputLine + replacedStats + "number : " + numberUntouched ;
    }
}