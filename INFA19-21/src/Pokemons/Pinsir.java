package Pokemons;

import Attacks.CalmMindMove;
import Attacks.DreamEaterMove;
import Attacks.RestMove;
import Attacks.SwaggerMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pinsir extends Pokemon {

    public Pinsir(String _name, int _level){
        super(_name, _level);
        this.setStats(240, 229, 184, 103, 130, 157);
        this.addType(Type.BUG);
        this.addMove(new RestMove());
        this.addMove(new SwaggerMove());
        this.addMove(new CalmMindMove());
        this.addMove(new DreamEaterMove(Type.NONE, 100, 100));
    }


}
