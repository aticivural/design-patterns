package com.vural.dp.behavioral.memento.sample01;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCaretaker {

    final Deque<EmpMemento> mementos = new ArrayDeque<>();

    public EmpMemento getMemento() {
        return mementos.pop();
    }

    public void addMemento(EmpMemento memento) {
        mementos.push(memento);
    }
}
