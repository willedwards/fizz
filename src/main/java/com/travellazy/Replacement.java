package com.travellazy;


public interface Replacement {
    boolean isReplaceable(int givenNumber);

    String getReplacementFor(int givenNumber);

    void incrementCounter();

    String getStats();

    int getCount();
}
