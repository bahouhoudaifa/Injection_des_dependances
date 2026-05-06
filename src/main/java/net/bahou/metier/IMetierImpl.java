package net.bahou.metier;

import net.bahou.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;

    // Injection de dépendance via le constructeur pour injecter dans
    // l'attribuft dao une instance d'une classe qui implémente l'interface IDao

    public IMetierImpl(IDao dao){
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12;
        return res;
    }
}
