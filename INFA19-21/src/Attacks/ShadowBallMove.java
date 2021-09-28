package Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBallMove extends SpecialMove {

    public ShadowBallMove(Type type, double att, double acc){
        super(type, att, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}
