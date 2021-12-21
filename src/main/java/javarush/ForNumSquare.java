package javarush;
//Ввести с клавиатуры два числа m и n.
//Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForNumSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Сколько раз повторять цифру? ");
            int columns = Integer.parseInt(bf.readLine());
            System.out.println("Сколько раз дублировать строку? ");
            int lines = Integer.parseInt(bf.readLine());
            for (int k = 0; k < columns; k++) {
                for (int j = 1; j <= lines; j++) {
                    System.out.print(8);
                }
                System.out.println();

            }
        }
    }
}
