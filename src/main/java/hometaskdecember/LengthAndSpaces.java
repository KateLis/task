package hometaskdecember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthAndSpaces {
    public static void main(String[] args) {
        String toParse = "kate 123 8 should be 89 more careful";
        String[] arrStr = toParse.split(" ");

        int elementLength = arrStr[0].length();
        int difference = 0;
        int totalLength = 0;
        for (int i = 0; i < arrStr.length; i++) {
            // System.out.println(ls.get(i) + " "+ ls.get(i).length());
            if (arrStr[i].length() > elementLength) {
                elementLength = arrStr[i].length();
            }
        }
        System.out.println("Длина самого длинного элемента: " + elementLength);
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() <= 7) {
                difference = (7 - arrStr[i].length()) + 4;
                totalLength = difference + arrStr[i].length();
            }
            System.out.println("Добавить пробелов: " + difference);
            String changedWithSetNewLength = setNewLength(arrStr[i], totalLength);
            System.out.println(changedWithSetNewLength);
        }
    }

    public static String repeatString(String s, int count) {
        StringBuilder r = new StringBuilder(" ");
        for (int i = 0; i <= count; i++) {
            r.append(s);
        }
        return r.toString();
    }

    public static String setNewLength(String str, int newLength) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.setLength(newLength);
        return stringBuffer.toString();
    }
}
