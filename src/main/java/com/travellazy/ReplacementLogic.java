package com.travellazy;

import java.util.ArrayList;
import java.util.List;

public class ReplacementLogic {

    //order is important
    private final List<Replacement> replacementList = new ArrayList<>();

    public ReplacementLogic(final List<Replacement> replacementList){
        this.replacementList.clear();
        this.replacementList.addAll(replacementList);
    }

    public String applyReplacementsToNumber(int givenNumber){

        String value = givenNumber +"";
        for(Replacement replacement : replacementList){

            if(replacement.isReplaceable(givenNumber)) {
                value = replacement.getReplacementFor(givenNumber);
                break;
            }
        }

        return value;
    }
}
