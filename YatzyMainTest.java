package com.company;

import org.junit.Assert;
import org.junit.Test;

public class YatzyMainTest {
        @Test
        public void isYatziWhenAllDiceMatches() {

            Dice[] dices = new Dice[] {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
            for(Dice die: dices) {
                die.setValue(6);
            }
            Assert.assertTrue(dices[0].getValue()==dices[1].getValue()
                    && dices[1].getValue()==dices[2].getValue()
                    && dices[2].getValue()==dices[3].getValue()
                    && dices[3].getValue()==dices[4].getValue());
        }

        @Test
        public void isNotYatziWhenOneDieIsNotMatchingTheOther() {
            Dice[] dices = new Dice[] {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
            for(Dice die: dices) {
                die.setValue(6);
            }
            dices[4].setValue(1);
            Assert.assertFalse(dices[0].getValue()==dices[1].getValue()
                    && dices[1].getValue()==dices[2].getValue()
                    && dices[2].getValue()==dices[3].getValue()
                    && dices[3].getValue()==dices[4].getValue());
        }
}
