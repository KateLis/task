package javarush;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Max {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a>b)
            System.out.println(b);
        else if (b>a)
            System.out.println(a);
        else if (a==b){
            System.out.println(a);       }

//        switch(a<b){
//        case 1:



    }
}
