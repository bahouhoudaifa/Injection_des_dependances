package net.bahou.metier;

import net.bahou.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    // Injection de dépendance via le constructeur pour injecter dans
    // l'attribuft dao une instance d'une classe qui implémente l'interface IDao

    public MetierImpl(IDao dao){
        this.dao = dao;
    }
    public MetierImpl(){}


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
