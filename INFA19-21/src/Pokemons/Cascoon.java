package Pokemons;

import Attacks.FireBlastMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cascoon extends Wurmple {

    public Cascoon(String _name, int _level){
        super(_name, _level);
        this.setStats(210, 67, 103, 49, 49, 31);
        this.addMove(new FireBlastMove(Type.FIRE,110, 85));
    }
}
