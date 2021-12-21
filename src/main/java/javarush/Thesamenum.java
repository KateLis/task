package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thesamenum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bf.readLine().split(" ");
        int size =  a.length;
        int[] intArr = new int[size];
        for(int i = 0; i<size; i++){
            intArr[i] = Integer.parseInt(a[i]);
        }
        int first = intArr[0];
        int second = intArr[1];
        int third = intArr[2];

        if(first==second)
            System.out.println(3);
        else if(first==third)
            System.out.println(2);
        else if(second == third)
            System.out.println(1);

    }
}
