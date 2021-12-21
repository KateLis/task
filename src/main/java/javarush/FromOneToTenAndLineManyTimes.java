package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FromOneToTenAndLineManyTimes {
    public static void main(String[] args) throws IOException {
        int x = 0;
        int k = 0;
        while(k<3) {
            while (x < 3) {
                x++;
                System.out.print(" S ");
            }
            x=0;
            k++;
            System.out.println();
        }
    }
}
