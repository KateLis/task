package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
//Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
public class Imena {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name1  = bf.readLine();
        String name2 = bf.readLine();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if(name1.length() == name2.length())
            System.out.println("Длины имен равны");
    }
}
