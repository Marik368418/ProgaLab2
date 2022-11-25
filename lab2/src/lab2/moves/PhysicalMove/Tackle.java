package lab2.moves.PhysicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {

    public Tackle(double power, double acc) {
        super(Type.NORMAL, power, acc);

    }

    @Override
    protected String describe() {
        //название класса, стриговое, делем на отдельные кусочки и отбираем последний кусочек с назавнием атаки
        String[] opokemone = this.getClass().toString().split("\\.");
        return "does" + " " +  opokemone[opokemone.length-1];
    }
}

