package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных
// и количество отрицательных чисел в исходном наборе, в следующем виде:
//        "количество отрицательных чисел: а", "количество положительных чисел: б",
//        где а, б - искомые значения.
public class ManyIfWithMass {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int countPositive = 0;
        int countNegative = 0;
    List<Integer> ls = new ArrayList<>();
    ls.add(a);
    ls.add(b);
    ls.add(c);
        ListIterator iterator = ls.listIterator();
        while (iterator.hasNext()) {
            if(a>0 || b>0 || c>0){
                countPositive++;
                break;
            }

        }
            System.out.println(countPositive);
        }

}
















