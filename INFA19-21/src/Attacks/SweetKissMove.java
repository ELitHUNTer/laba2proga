package Attacks;

import ru.ifmo.se.pokemon.*;

public class SweetKissMove extends SpecialMove {

    public SweetKissMove (Type type, double att, double acc){
        super(type, att, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
    }
}
