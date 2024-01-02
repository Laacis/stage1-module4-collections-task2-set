package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for(Integer i : sourceList){
            if(i % 2 == 0){
                addEven(result,i);
            }else {
                addOdd(result, i);
            }
        }

        return result;
    }

    private void addEven(HashSet<Integer> result, Integer i) {
        List<Integer> itemsToAdd = new ArrayList<>();
        while(i != 0){
            itemsToAdd.add(i);
            i /= 2;
        }

        result.addAll(itemsToAdd);
    }

    private void addOdd(HashSet<Integer> result, Integer i) {
        result.add(i);
        result.add(i*2);
    }
}
