package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
*/

public class Solution1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int chet = a%2;
        if(chet==0 && a<0)
            System.out.println("отрицательное четное число");
        else if(chet==0 && a>0)
            System.out.println("положительное четное число");
        else if(chet!=0 && a<0)
            System.out.println("отрицательное нечетное число");
        else if(chet!=0 && a>0)
            System.out.println("положительное нечетное число");
        else
            System.out.println("ноль");

    }
}
