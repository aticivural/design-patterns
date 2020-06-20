package com.vural.dp.behavioral.iterator.sample01;

public interface PatternAggregate {
    void addPattern(DesignPattern designPattern);

    void removePattern(DesignPattern designPattern);

    PatternIterator getPatternIterator();
}
