package hometasknovember;

import java.lang.annotation.Annotation;

public class CupCakeMain {
    public static void main(String[] args) {
        CupCake cp = new CupCake();
        Class c  = cp.getClass();

        Annotation an = c.getAnnotation(Cake.class);
        Cake cake = (Cake)an;
        System.out.println(cake.taste());
    }
}
