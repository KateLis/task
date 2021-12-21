package hometasknovember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//Спросить про №3 https://javarush.ru/quests/lectures/questsyntax.level04.lecture08
//просто пока не сравнили ничего, вводят что угодно, а потом сравнили и если true, то вылетает

// Имеются две строки.
// Напишите метод, возвращающий количество вхождений одной строки в другую.
public class SearchStroka {
    public static void main(String[] args) throws IOException {
        //String text = "vv";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш текст: ");
       // String text = bf.readLine();
        String text = sc.next();
        System.out.println("Какую строку ищем?  ");
       // String stringForSearch = bf.readLine();
        String stringForSearch = sc.next();
        int count = 0;
        CharSequence seq = stringForSearch;
        while (sc.hasNext()){
            sc.next();
        if (text.contains(seq)){
            count++;
            continue;
        }}
        System.out.println(count);

//        String[] str = text.split(". ");
//        for (int i=0; i< str.length; i++){
//            if(str.)){
//                count++;
//            }
//            System.out.println(count);
//        }

    }

}
