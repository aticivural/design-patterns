package com.vural.dp.behavioral.iterator.sample01;

import org.junit.Test;

public class PatternIteratorImplTest {

    @Test
    public void testPatternIterator() {
        DesignPattern p1 = new DesignPattern("Creational", "Factory Method");
        DesignPattern p2 = new DesignPattern("Creational", "Abstract Factory");
        DesignPattern p3 = new DesignPattern("Structural", "Adapter");
        DesignPattern p4 = new DesignPattern("Structural", "Bridge");
        DesignPattern p5 = new DesignPattern("Behavioral", "Chain of Responsibility");
        DesignPattern p6 = new DesignPattern("Behavioral", "Iterator");

        PatternAggregate patternAggregate = new PatternAggregateImpl();
        patternAggregate.addPattern(p1);
        patternAggregate.addPattern(p2);
        patternAggregate.addPattern(p3);
        patternAggregate.addPattern(p4);
        patternAggregate.addPattern(p5);
        patternAggregate.addPattern(p6);

        System.out.println("-----Pattern List-----");
        printPattern(patternAggregate);

        patternAggregate.removePattern(p1);
        patternAggregate.removePattern(p2);

        System.out.println("-----Pattern list after removal operation-----");
        printPattern(patternAggregate);

    }

    private void printPattern(PatternAggregate patternAggregate) {
        PatternIterator patternIterator = patternAggregate.getPatternIterator();
        while (!patternIterator.isLastPattern()) {
            DesignPattern designPattern = patternIterator.nextPattern();
            System.out.println(designPattern.getPatternType() + " : " + designPattern.getPatternName());
        }
    }

}