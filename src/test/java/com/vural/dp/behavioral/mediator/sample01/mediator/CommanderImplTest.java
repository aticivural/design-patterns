package com.vural.dp.behavioral.mediator.sample01.mediator;

import com.vural.dp.behavioral.mediator.sample01.colleague.SoldierUnit;
import com.vural.dp.behavioral.mediator.sample01.colleague.TankUnit;
import org.junit.Test;

public class CommanderImplTest {

    @Test
    public void testMediator() {
        Commander commander = new CommanderImpl();
        SoldierUnit soldierUnit = new SoldierUnit(commander);
        TankUnit tankUnit = new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }

}