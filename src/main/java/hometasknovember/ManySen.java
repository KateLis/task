package hometasknovember;

import java.util.Scanner;

public class ManySen {
    public static void main(String[] args) {
        String str = ". Помимо постановки диагноза и её лечения, " +
                "доктора команды Хауса общаются с ней, чтобы узнать, " +
                "почему она забросила свою работу, " +
                "в которой она добилась многого. Это превращается в настоящую философскую дискуссию," +
                " которая заставляет задуматься каждого доктора о том, " +
                "на своём ли месте он находится и нравится ли ему то, чем он занимается. ";
 //       String[] arr = str.split("\\. ");
//        for (String l : arr)
//            System.out.println(l);
///2 case
        Scanner sc = new Scanner(str);
        int count = 0;
        while(sc.hasNext())
            if (sc.hasNext("она")){
                count++;}
       // System.out.println(count);}
        else sc.next();
        System.out.println(count);
    }
}
