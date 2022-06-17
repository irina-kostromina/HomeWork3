package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        method5 (12,7);

        //ex1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println();


    // ex2
        int[] arr2 = new int[100];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
    }
        for(int i = 0; i < arr2.length; i++) {
        System.out.print(arr2[i] + " ");
    }
        System.out.println();
        System.out.println();

    //ex3
    int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for(int i = 0; i < arr3.length; i++) {
        if (arr3[i] < 6) {
            arr3[i] *= 2;
        }
    }
        for(int i = 0; i < arr3.length; i++) {
        System.out.print(arr3[i] + " ");
    }
        System.out.println();
        System.out.println();


    //ex4
    int[][] arr4 = new int[5][5];

    for(int i = 0; i < arr4.length; i++) {
        for (int j = 0; j < arr4.length; j++) {
            if (i == j) {
                arr4[i][j] = 1;
            }
            if (i + j == arr4.length - 1) {
                arr4[i][j] = 1;
            }
        }
    }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


    //5
    int[] arr5 = method5(5,3);
    for ( int i = 0; i < arr5.length; i++) {
        System.out.print(arr5[i] + " ");
    }
    }

    public static int[] method5(int len, int initialValue){
        int[] result = new int [len];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        System.out.println();
        return result;
    }


}
