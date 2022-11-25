package lab2.pokemons;

import lab2.moves.SpecialMove.IceBeam;
import lab2.moves.SpecialMove.PowerSnow;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {

    public Swinub(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        super.setStats(50, 50, 40, 30, 30, 50);

        PowerSnow powerSnow = new PowerSnow(40, 100);
        IceBeam iceBeam = new IceBeam(90, 100);

        super.setMove(powerSnow, iceBeam);

    }
}
