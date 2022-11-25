package lab2.pokemons;

import lab2.moves.PhysicalMove.IceFang;
import lab2.moves.PhysicalMove.Tackle;
import lab2.moves.StatusMove.DoubleTeam;
import lab2.moves.StatusMove.RockPolish;
import ru.ifmo.se.pokemon.Type;


public class Steelix extends Onix{
     public Steelix(String name, int level) {
         super(name, level);

         super.setType(Type.STEEL, Type.GROUND);
         super.setStats(75, 85, 200, 55, 65, 30);

         Tackle tackle = new Tackle(40, 100);
         IceFang iceFang = new IceFang(65, 95);
         RockPolish rockPolish = new RockPolish(0, 0);
         DoubleTeam doubleTeam = new DoubleTeam(0, 0);

         super.setMove(tackle, iceFang, rockPolish, doubleTeam);

     }
}
