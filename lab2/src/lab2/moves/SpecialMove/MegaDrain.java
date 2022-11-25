package lab2.moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {

    public MegaDrain(double power, double acc) {
        super(Type.GRASS, power, acc);

    }
    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
            p.setMod(Stat.HP, -(int)(Math.round(damage))/2);
        }

    @Override
    protected String describe() {
        return "deals damage and the user will recover 50% of the HP drained.";
    }

}



