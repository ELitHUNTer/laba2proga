package Attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlastMove extends SpecialMove {

    public FireBlastMove(Type type, double att, double def){
        super(type, att, def);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1){
            Effect.burn(pokemon);
        }
    }
}
