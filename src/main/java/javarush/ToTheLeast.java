package javarush;

import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

//Ввести с клавиатуры три числа, и вывести их в порядке убывания.
//        Выведенные числа должны быть разделены пробелом.
public class ToTheLeast  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c  = Integer.parseInt(bf.readLine());

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        //ArrayUtils.reverse(arr);
        int[] arr2 = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length-i]).toArray();
//        for(int i=arr.length-1; i>=0; i--) {
//            //       System.out.println(arr[i]);
//        }
        System.out.println(arr2[0] +" " + arr2[1] + " " + arr2[2]);
        }
}
