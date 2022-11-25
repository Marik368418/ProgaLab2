package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Proga {
    // https://pokemondb.net/pokedex/kartana
    // https://pokemondb.net/pokedex/onix
    // https://pokemondb.net/pokedex/steelix
    // https://pokemondb.net/pokedex/swinub
    // https://pokemondb.net/pokedex/piloswine
    // https://pokemondb.net/pokedex/mamoswine
    public static void main(String[] args) {
        Battle b = new Battle();

        Onix onix = new Onix("Naruto",27);
        Kartana kartana = new Kartana("Saske", 20);
        Mamoswine mamoswine = new Mamoswine("Sakura", 23);

        Piloswine piloswine = new Piloswine("Kakashi", 19);
        Steelix steelix = new Steelix("Obito", 35);
        Swinub swinub = new Swinub("Rin", 24);

        b.addAlly(onix);
        b.addAlly(kartana);
        b.addAlly(mamoswine);

        b.addFoe(piloswine);
        b.addFoe(swinub);
        b.addFoe(steelix);

        b.go();
    }

    public static boolean chance (double r) {
        return r > Math.random();
    }
}
