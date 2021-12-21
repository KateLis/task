package hometasknovember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Имеются две строки.
// Напишите метод, возвращающий количество вхождений одной строки в другую.
public class SearchString {
    public static void main(String[] args) throws IOException {
    String text = "I love you. They love you and me. love"; //abc - 3 c abc-c=ab = 2 (3-2)/1 = 1
    String searchedString = "love you";
     String text2 = text.replaceAll(searchedString,"");
        System.out.println(text2);
        int count = (text.length() - text2.length())/searchedString.length();
        System.out.println(text.length());
        System.out.println(text2.length());
        System.out.println(count);


//        I would use a Pattern and Matcher:
//
//        String string = "engineering";
//        Pattern pattern = Pattern.compile("([gG])"); //case insensitive, use [g] for only lower
//        Matcher matcher = pattern.matcher(string);
//        int count = 0;
//        while (matcher.find()) count++;

   // List<String> ls = Arrays.asList(text.split(" "));
//        ListIterator iter = ls.listIterator();
//        int count = 0;
//        System.out.println(ls.toString());
//    while(iter.hasNext()){
       // if (ls.contains("love")) {
     //       System.out.println("yes");
//        }
//        else
//            break;
    }
//        System.out.println(count);
//        System.out.println(text.substring(7));//выведет you
//        System.out.println(text.indexOf("l"));



}
