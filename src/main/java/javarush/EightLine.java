package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Используя цикл for вывести на экран:
//- горизонтальную линию из 10 восьмёрок
//- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
public class EightLine {
    public static void main(String[] args) throws Exception{
        for (int i=0; i<10;i++){
            System.out.print(8);
        }
        System.out.println();
        for (int i=0; i<10;i++){
            System.out.println(8);
        }
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        for (int k=0; k<10;k++){
            System.out.println(name + " любит меня.");
        }
    }
}
