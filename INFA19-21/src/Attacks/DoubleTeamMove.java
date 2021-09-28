package Attacks;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class DoubleTeamMove extends Move {
    @Override
    protected void attack(Pokemon att, Pokemon def) {
        att.setMod(Stat.EVASION, 1);
    }
}
