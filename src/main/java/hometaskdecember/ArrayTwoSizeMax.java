package hometaskdecember;

public class ArrayTwoSizeMax {
    public static void main(String[] args) {
        int[][] arr2 = {{1, 2, 3, 3, 5}, {9, 6, 1, 6, 2}};
        //int[] arrSmall1 = arr2[0];

        //  System.out.println(arr1[0][1]);
        //  System.out.println(arr1[1][1]);
        for (int i = 0; i < arr2.length; i++) {
            int maxCurrent = arr2[i][0];//берем первый элемент i-ого массива
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] > maxCurrent) {
                    maxCurrent = arr2[i][j];
                }
            }
            System.out.println(maxCurrent);
        }
    }
}
