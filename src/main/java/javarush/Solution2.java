package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int chet = a%2; //а на разрядность надо было проверять а- 100>0 и тд
        int len = Integer.valueOf(Math.abs(a)).toString().length();

        if (len == 1 && chet == 0)
            System.out.println("четное однозначное число");
        else if (len == 2 && chet == 0)
            System.out.println("четное двузначное число");
        else if (len == 3 && chet == 0)
            System.out.println("четное трехзначное число");
        else if (len == 1 && chet != 0)
            System.out.println("нечетное однозначное число");
        else if (len == 2 && chet != 0)
            System.out.println("нечетное двузначное число");
        else if (len == 3 && chet != 0)
            System.out.println("нечетное трехзначное число");

    }
}
