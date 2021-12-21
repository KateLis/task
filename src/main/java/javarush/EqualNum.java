package javarush;

import java.util.Scanner;

//Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
//        Если такая пара существует, вывести на экран числа через пробел.
//        Если все три числа равны между собой, то вывести все три.
public class EqualNum {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && a==c){
            System.out.print(b);
            System.out.print(" ");
            System.out.print(b);
            System.out.print(" ");
            System.out.print(b);
        }

        else if (a==b || a==c){
            System.out.print(a);
            System.out.print(" ");
            System.out.print(a);
        }
        else if (a==b || b==c) {
            System.out.print(b);
            System.out.print(" ");
            System.out.print(b);
        }
        else if (c==a || c==b)
        {
            System.out.print(c);
            System.out.print(" ");
            System.out.print(c);
        }

        }
}
