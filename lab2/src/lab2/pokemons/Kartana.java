package lab2.pokemons;

import lab2.moves.PhysicalMove.BrutalSwing;
import lab2.moves.SpecialMove.FireBlast;
import lab2.moves.SpecialMove.MegaDrain;
import lab2.moves.StatusMove.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kartana extends Pokemon {

    public Kartana(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.STEEL);
        super.setStats(59, 181, 131, 59, 31, 109);

        FireBlast fireBlast = new FireBlast(110, 85);
        MegaDrain megaDrain = new MegaDrain(40,100);
        BrutalSwing brutalSwing = new BrutalSwing(60,100);
        Confide confide = new Confide(0,0);

        super.setMove(fireBlast, megaDrain, brutalSwing, confide);


    }
}

