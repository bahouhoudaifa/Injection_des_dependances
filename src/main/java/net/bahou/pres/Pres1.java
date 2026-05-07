package net.bahou.pres;

import net.bahou.dao.DaoImpl;
import net.bahou.metier.MetierImpl;
import net.bahou.ext.DaoImpl2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl2 d = new DaoImpl2();
        MetierImpl metier = new MetierImpl(d); // Injection avec le constructeur avec paramètre
        //metier.setDao(d); // Injection avec le setter
        System.out.println("Résultat : " + metier.calcul());
    }
}
