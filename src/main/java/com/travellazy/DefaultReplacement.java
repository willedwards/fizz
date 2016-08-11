package com.travellazy;


public class DefaultReplacement implements Replacement {

    private final int divisor;
    private final String text;
    private int count;

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

    @Override
    public void incrementCounter(){
        count++;
    }

    @Override
    public String getStats() {
        return text + " : " + count;
    }

    @Override
    public int getCount(){
        return count;
    }
}
