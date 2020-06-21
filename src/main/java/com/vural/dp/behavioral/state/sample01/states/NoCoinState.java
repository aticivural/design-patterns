package com.vural.dp.behavioral.state.sample01.states;

import com.vural.dp.behavioral.state.sample01.context.CandyVendingMachine;

public class NoCoinState implements CandyVendingMachineState {
    private CandyVendingMachine machine;

    public NoCoinState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        machine.setState(machine.getContainsCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }

    @Override
    public String toString() {
        return "NoCoinState";
    }
}
