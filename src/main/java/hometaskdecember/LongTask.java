package hometaskdecember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongTask {
    public static void main(String[] args) {
        String toParse = "kate 123 8 should be 89 more careful";
        List<String> ls = new ArrayList<>();
        ls.addAll(Arrays.asList(toParse.split(" ")));
        int index = 0;
        int elementLength = ls.get(0).length();
        int difference = 0;
        int totalLength = 0;
        for (int i = 0; i < ls.size(); i++) {
            // System.out.println(ls.get(i) + " "+ ls.get(i).length());
            if (ls.get(i).length() > elementLength) {
                elementLength = ls.get(i).length();
            }
        }
        System.out.println("Длина самого длинного элемента: " + elementLength);
        String newStr = "";
        String space = "k";
        int countForLines = 0;
        for (int i = 0; i < ls.size(); i++) {
            countForLines++;
            if (ls.get(i).length() <= elementLength) {
                difference = (elementLength - ls.get(i).length()) + 4;
                totalLength = difference + ls.get(i).length();
            }//считает правильно для каждого элемента
            String changedStr = repeatString(ls.get(i), difference);
            // newStr = ls.get(i) + space +".";
            //  System.out.println("Добавить пробелов: " + difference);
            System.out.print(changedStr);
            if (countForLines == 2) {
                System.out.println();
                countForLines = 0;
            }
        }
        // String changedWithSetNewLength = setNewLength(ls.get(i), totalLength);
        //System.out.println(changedStr);
        // System.out.println(changedWithSetNewLength + "finish");
        //System.out.println(changedWithSetNewLength.length());

    }

    public static String repeatString(String s, int count) {
        StringBuilder r = new StringBuilder(s);
        for (int i = 0; i <= count; i++) {
            r.append(" ");
        }
        return r.toString();
    }

    public static String setNewLength(String str, int newLength) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.setLength(newLength);
        return stringBuffer.toString();
    }
}
