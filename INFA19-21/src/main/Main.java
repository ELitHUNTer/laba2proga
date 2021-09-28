package main;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args){
        Battle b = new Battle();
        b.addAlly(new Abomasnow("Abomasnow", 1));
        b.addAlly(new Cascoon("Cascoon", 1));
        b.addAlly(new Dustox("Dustox", 1));
        b.addFoe(new Pinsir("Pinsir", 1));
        b.addFoe(new Snover("Snover", 1));
        b.addFoe(new Wurmple("Wurmple", 1));
        b.go();
    }

}
