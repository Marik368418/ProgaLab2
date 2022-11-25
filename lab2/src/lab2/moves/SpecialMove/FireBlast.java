package lab2.moves.SpecialMove;

import lab2.Proga;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class FireBlast extends SpecialMove {
    public FireBlast(double power, double acc) {
        super(Type.FIRE, power, acc);
    }

    @Override
    //метод applyOppEffects вызывается когда мы применяем эфекты на соперника
    protected void applyOppEffects(Pokemon e){
        //вызываем родительский порядко эвектов заложенных в данную способность
        super.applyOppEffects(e);

        //затем проверяем 10% шанс (мафс рандом проверяет от 0 до 1) и в случае попадания в 0.1 прога вернёт True
        if(Proga.chance(0.1)) {
            Effect.burn(e);
        }
    }


    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " + opokemone[opokemone.length - 1];
    }
}
