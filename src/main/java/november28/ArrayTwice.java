package november28;

import java.util.Arrays;

public class ArrayTwice {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][];
        int[][][] arr2 = new int[3][][];
        arr1[0] = new int[10];
        arr1[1] = new int[3];

        for (int i=0; i< arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                arr1[i][j] = j;
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
