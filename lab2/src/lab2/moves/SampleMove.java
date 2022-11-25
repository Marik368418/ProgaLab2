package lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends SpecialMove {

    public SampleMove(double power, double acc) {
        super(Type.NORMAL, power, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon e){
        super.applyOppEffects(e);
    }

    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " +  opokemone[opokemone.length-1];
    }
}
