package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Ввести с клавиатуры три целых числа.
// Вывести на экран количество положительных чисел среди этих трех.
public class Solution3 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int count = 0;
        if (a > 0)
            count++;
        if (b > 0)
            count++;
        if (c > 0)
            count++;
        System.out.println(count);
    }
}
