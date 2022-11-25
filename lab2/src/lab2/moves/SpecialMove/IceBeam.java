package lab2.moves.SpecialMove;

import lab2.Proga;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {

    public IceBeam(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon e){
        super.applyOppEffects(e);

        if(Proga.chance(0.1))
            Effect.freeze(e);
    }

    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " +  opokemone[opokemone.length-1];
    }
}
