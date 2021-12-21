package hometasknovember;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//Напишите метод, который принимает на вход заданное слово и слово "заменитель".
//Метод должен заменять в тексте все вхождения заданного слова на слово заменитель.
public class Zamena {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        System.out.println("А теперь текст, пожалуйста");
        String text = bf.readLine();
        System.out.println("Что на что меняем? ");
        String wordToChange = bf.readLine();
        String updatedWord = bf.readLine();
      //  String text = sc.next();
       // String wordToChange = sc.next();
        String[] arr = text.split(" ");
        for (int i=0; i<arr.length; i++){
            if (wordToChange.equals(arr[i])){
                arr[i] = updatedWord;
                }
        }

            System.out.print(String.join(" ", arr));
        }

}
