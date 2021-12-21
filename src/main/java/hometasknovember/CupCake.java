package hometasknovember;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//это фигня показывает, на каком уровне будем использовать аннотацию,type - значит, на весь класс
@Retention(RetentionPolicy.RUNTIME)
@interface Cake{
    String taste();//зачем ()?
    int price();
}
@Cake(taste="Strawberry", price=1500)
public class CupCake {

}
