package hometasknovember;

import java.util.ArrayList;
import java.util.List;

public class Space {
   public int returnLength(String str) {

       String[] arr1 = str.split(" ");
       String lastOne = arr1[arr1.length - 1];
       return lastOne.length();
   }

       public static void main (String[]args){
           String str1 = "Jack built  the   house123";
           Space sp = new Space();
           int result = sp.returnLength(str1);
           System.out.println(result);
       }

}
