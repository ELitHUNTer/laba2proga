package Pokemons;

import Attacks.DoubleTeamMove;
import Attacks.RestMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wurmple extends Pokemon {

    public Wurmple(String _name, int _level){
        super(_name, _level);
        this.setType(Type.BUG);
        this.setStats(200, 85, 67, 40, 58, 40);
        this.addMove(new DoubleTeamMove());
        this.addMove(new RestMove());
    }
}
