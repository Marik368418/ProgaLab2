package lab2.pokemons;

import lab2.moves.SpecialMove.IceBeam;
import lab2.moves.SpecialMove.PowerSnow;
import lab2.moves.StatusMove.Amnesia;
import lab2.moves.StatusMove.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Piloswine {

    public Mamoswine(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.GROUND);
        super.setStats(110, 130, 80, 70, 60, 80);

        PowerSnow powerSnow = new PowerSnow(40, 100);
        IceBeam iceBeam = new IceBeam(90,100);
        Amnesia amnesia = new Amnesia(0,0);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);

        super.setMove(powerSnow, iceBeam, amnesia, doubleTeam);


    }
}
