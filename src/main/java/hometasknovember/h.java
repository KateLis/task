package hometasknovember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class h {
        public static void main(String args[]) throws IOException {
//            String s1="My name is Khan. My name is Bob. My name is Sonoo.";
//            String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
//            System.out.println(replaceString);

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            //Scanner sc = new Scanner(System.in);
            System.out.println("А теперь текст, пожалуйста");
            String text = bf.readLine();
            System.out.println("Что на что меняем? ");
            String word = bf.readLine();
            String word2 = bf.readLine();
            String result = text.replaceAll(word,word2);
            System.out.println(result);
        }
}
