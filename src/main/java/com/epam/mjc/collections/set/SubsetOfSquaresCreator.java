package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> squares = new TreeSet<>();

        for(Integer i : sourceList){
            squares.add(i * i);
        }

        return squares.subSet(lowerBound, true, upperBound,true );
    }
}
