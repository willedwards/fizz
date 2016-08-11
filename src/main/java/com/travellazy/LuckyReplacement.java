package com.travellazy;

public class LuckyReplacement implements Replacement {

    private final char charToFind;
    private final String text;

    public LuckyReplacement(char charToFind, String luck) {
        this.charToFind = charToFind;
        this.text = luck;
    }

    @Override
    public boolean isReplaceable(int givenNumber) {
        return ((givenNumber+"").indexOf(charToFind) >=0);
    }

    @Override
    public String getReplacementFor(int givenNumber) {
        return isReplaceable(givenNumber) ? text : givenNumber+"";
    }
}
