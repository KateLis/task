package hometaskdecember;

public class ArrayTwoSize {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int max = arr1[0];
        //  System.out.println(arr1[0][1]);
        //  System.out.println(arr1[1][1]);
        for (int i = 0; i < arr1.length; i++) {
            //for (int j = 0; j < arr1[i].length; j++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);
//                int max = arr1[0][0];
//                if (arr1[i][j] > max) {
//                    max = arr1[i][j];
//                    System.out.println(max);
        //        }
        // int res = Math.max(arr1[i][j], arr1[i-1][j-1]);
        //System.out.println(res);

        int[][] arr2 = {{1, 2, 3, 4, 5}, {9, 6, 1, 6, 2}};
        int max2 = arr2[0][0];
        //  System.out.println(arr1[0][1]);
        //  System.out.println(arr1[1][1]);
        for (int i = 0; i < arr2.length; i++)
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] > max2) {
                    max2 = arr2[i][j];
                }
            }
        System.out.println(max2);
    }
}
