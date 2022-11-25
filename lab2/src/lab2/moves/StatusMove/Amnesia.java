package lab2.moves.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {

    public Amnesia(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon e){
        super.applyOppEffects(e);

        Effect s = new Effect().stat(Stat.SPECIAL_DEFENSE, 2);
        e.addEffect(s);
    }

    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " +  opokemone[opokemone.length-1];
    }
}
