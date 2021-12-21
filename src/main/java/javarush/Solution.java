package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        Double t = Double.parseDouble(reader.nextLine());
        if (t % 5 < 3) System.out.println("зелёный");
        else if (t % 5 < 4) System.out.println("жёлтый");
        else if (t % 5 < 5) System.out.println("красный");
        System.out.println(7%5);
    }
}