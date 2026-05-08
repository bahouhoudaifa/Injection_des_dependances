package net.bahou.metier;

import net.bahou.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    // Injection de dépendance via le constructeur pour injecter dans
    // l'attribuft dao une instance d'une classe qui implémente l'interface IDao

    public MetierImpl(@Qualifier("d") IDao dao){
        this.dao = dao;
    }
    //public MetierImpl(){}


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
