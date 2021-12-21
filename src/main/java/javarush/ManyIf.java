package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных
// и количество отрицательных чисел в исходном наборе, в следующем виде:
//        "количество отрицательных чисел: а", "количество положительных чисел: б",
//        где а, б - искомые значения.
public class ManyIf {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int countPositive = 0;
        int countNegative = 0;
        if (a>0){
            countPositive++;
        }
        if (b>0){
            countPositive++;
        }
        if (c>0){
            countPositive++;
        }
        System.out.println("количество положительных чисел: ");
        if (a<0){
            countNegative++;
        }
        if (b<0){
            countNegative++;
        }
        if (c<0){
            countNegative++;
        }
        System.out.println("количество отрицательных чисел: ");
    }
}
