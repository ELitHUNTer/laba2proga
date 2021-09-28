package Pokemons;

import Attacks.DreamEaterMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dustox extends Cascoon {

    public Dustox(String _name, int _level){
        super(_name, _level);
        this.addType(Type.POISON);
        this.setStats(230, 94, 130, 94, 166, 121);
        this.addMove(new DreamEaterMove(Type.NONE, 100, 100));
    }
}
