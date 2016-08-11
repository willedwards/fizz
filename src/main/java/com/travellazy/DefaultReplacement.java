package com.travellazy;


public class DefaultReplacement implements Replacement {

    private final int divisor;
    private final String text;

    public DefaultReplacement(int divisor, String text) {
        this.divisor = divisor;
        this.text = text;
    }

    @Override
    public boolean isReplaceable(int givenNumber){
        return givenNumber % divisor == 0;
    }

    @Override
    public String getReplacementFor(int givenNumber){
        return isReplaceable(givenNumber) ? text : givenNumber+"";
    }
}
