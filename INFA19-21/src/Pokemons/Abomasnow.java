package Pokemons;

import Attacks.SweetKissMove;
import ru.ifmo.se.pokemon.Type;

public class Abomasnow extends Snover {

    public Abomasnow(String _name, int _level) {
        super(_name, _level);
        this.setStats(290, 170, 139, 170, 157, 112);
        this.addMove(new SweetKissMove(Type.FAIRY, 0, 75));
    }

}
