package hometasknovember;//Написать программу, которая выводит на консоль простые числа в заданном промежутке

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int[] arr = new int[2];
//        arr[0] = a;
//        arr[1] = b;

        int[] arr = {12, 3, 5};
        int[] arrOfDividers;
        int length2 = arr.length - 1;

        // for (int i = lenght; i > 0; i--) {

        //хочу все эти элементы запихнуть в arrOfDividers - ответ: нет, надо отдельно заполнять
        //   }
        for (int i = 0; i < arr.length; i++) {
            if (!isNumberNotPrime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean isNumberNotPrime(int number) {
//        int halfNum = number / 2;
//        for (int divider = 2; divider < halfNum; divider++) {
//            if (number % divider == 0) {
//               return false;
//            }
//          }
//        return true;
//
        return IntStream.rangeClosed(2, number / 2).anyMatch(divider -> number % divider == 0);
   }
}
