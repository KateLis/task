package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int count = 0;
        int count2 = 0;
        if (a > 0)
            count++;
        if (b > 0){
            count++;
        }
        else {
            count2++;
        }
        if (c > 0)
            count++;

        else if(a<0)
            count2++;
        if(b<0)
            count2++;
        if(c<0)
            count2++;
        System.out.println(count);

    }
}
