package com.vural.dp.behavioral.mediator.sample01.mediator;

import com.vural.dp.behavioral.mediator.sample01.colleague.ArmedUnit;

public interface Commander {
    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit armedUnit);

    void ceaseAttack(ArmedUnit armedUnit);
}
