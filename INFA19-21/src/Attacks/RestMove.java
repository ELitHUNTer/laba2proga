package Attacks;

import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove {

    @Override
    protected void applySelfEffects(Pokemon p1) {
        p1.restore();
        p1.setCondition((new Effect()).condition(Status.SLEEP).attack(0.0d).turns(2));
    }
}
