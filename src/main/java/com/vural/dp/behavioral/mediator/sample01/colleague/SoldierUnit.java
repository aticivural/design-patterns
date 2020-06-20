package com.vural.dp.behavioral.mediator.sample01.colleague;

import com.vural.dp.behavioral.mediator.sample01.mediator.Commander;

public class SoldierUnit implements ArmedUnit {
    private Commander commander;

    public SoldierUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void startAttack() {
        if (commander.canAttack()) {
            System.out.println("SoldierUnit: Attacking.....");
            commander.setAttackStatus(false);
        } else {
            System.out.println("SoldierUnit: Cannot attack now. Other units attacking...");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("SoldierUnit: Stopped Attacking.....");
        commander.setAttackStatus(true);
    }
}
