package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        for(String str : firstSet){
            if(secondSet.contains(str) && !thirdSet.contains(str)){
                result.add(str);
            }
        }

        for(String str : thirdSet){
            if(!firstSet.contains(str) && !secondSet.contains(str)){
                result.add(str);
            }
        }

        return result;
    }
}
