package com.vural.dp.behavioral.mediator.sample01.mediator;

import com.vural.dp.behavioral.mediator.sample01.colleague.ArmedUnit;

public class CommanderImpl implements Commander {
    private ArmedUnit soldierUnit;
    private ArmedUnit tankUnit;
    private boolean attackStatus = true;

    @Override
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldierUnit = soldierUnit;
        this.tankUnit = tankUnit;
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.startAttack();
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}
