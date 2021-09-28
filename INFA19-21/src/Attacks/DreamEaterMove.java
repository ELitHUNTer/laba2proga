package Attacks;

import ru.ifmo.se.pokemon.*;

public class DreamEaterMove extends PhysicalMove {

    public DreamEaterMove (Type type, double attack, double acc) {
        super(type, attack, acc);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, -(int)Math.round(v / 2));
    }
}
