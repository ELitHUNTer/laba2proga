package Pokemons;

import Attacks.DoubleTeamMove;
import Attacks.ShadowBallMove;
import Attacks.SwaggerMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snover extends Pokemon {

    public Snover(String _name, int _level){
        super(_name, _level);
        this.setType(Type.GRASS, Type.ICE);
        this.setStats(230, 116, 94, 116, 112, 76);
        this.addMove(new SwaggerMove());
        this.addMove(new DoubleTeamMove());
        this.addMove(new ShadowBallMove(Type.GHOST, 80, 100));
    }

}
