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
                replacement.incrementCounter();
                break;
            }

        }

        return value;
    }

    public String getStats(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(Replacement replacement : replacementList) {
            sb.append(replacement.getStats()).append("\n");
        }

        return sb.toString();
    }

    public int totalReplacedCount(){
        int total = 0;
        for(Replacement replacement : replacementList) {
            total += replacement.getCount();
        }
        return total;
    }
}
