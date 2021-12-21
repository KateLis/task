package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int res = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println(res);

    }

}
