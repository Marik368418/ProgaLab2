package lab2.moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon e) {
        super.applyOppEffects(e);

        Effect p = new Effect().stat(Stat.EVASION, 1);
        e.addEffect(p);

    }

    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " + opokemone[opokemone.length - 1];

    }
}
