package lab2.pokemons;

import lab2.moves.PhysicalMove.Tackle;
import lab2.moves.StatusMove.DoubleTeam;
import lab2.moves.StatusMove.RockPolish;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Onix extends Pokemon {

    public Onix(String name, int level) {
        super(name, level);

        super.setType(Type.ROCK, Type.GROUND);
        super.setStats(35, 45, 160, 30, 45, 70);

        Tackle tackle = new Tackle(40, 100);
        RockPolish rockPolish = new RockPolish(0, 0);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);

        super.setMove(tackle, rockPolish, doubleTeam);

    }
}