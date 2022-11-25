package lab2.moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove {

    public RockPolish(double power, double acc) {
        super(Type.ROCK, power, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon e){
        super.applyOppEffects(e);
        Effect p = new Effect().stat(Stat.SPEED,6);

        e.addEffect(p);
    }

    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " +  opokemone[opokemone.length-1];
    }
}

