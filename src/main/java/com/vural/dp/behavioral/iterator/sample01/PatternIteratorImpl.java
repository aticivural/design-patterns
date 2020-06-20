package com.vural.dp.behavioral.iterator.sample01;

import java.util.List;

public class PatternIteratorImpl implements PatternIterator {
    private List<DesignPattern> patternList;
    private int position;
    private DesignPattern designPattern;

    public PatternIteratorImpl(List<DesignPattern> patternList) {
        this.patternList = patternList;
    }

    @Override
    public DesignPattern nextPattern() {
        System.out.println("Returning pattern at Position: " + position);
        designPattern = patternList.get(position);
        position++;
        return designPattern;
    }

    @Override
    public boolean isLastPattern() {
        return position >= patternList.size();
    }
}
