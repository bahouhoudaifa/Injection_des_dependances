package net.bahou.ext;

import net.bahou.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
     System.out.println("Version capteurs");
     double t = 34;
     return t;
    }
}
