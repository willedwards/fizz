package com.travellazy;

/**
 * Created by will on 11/08/2016.
 */
public interface Replacement {
    boolean isReplaceable(int givenNumber);

    String getReplacementFor(int givenNumber);
}
