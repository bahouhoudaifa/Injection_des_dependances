package net.bahou.pres;

import net.bahou.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSprAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.bahou");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Resultat : " + metier.calcul());
    }
}
