package Lesson3;

import java.util.Arrays;

public class ArrayExm {

    public static void main(String[] args) {

//        String str = "Hello WoRlD";
//        System.out.println(str);
//
//        String str2 = str.toUpperCase();
//        System.out.println(str2);
//        System.out.println(str);
//        массивы в квадратных скобках всегда
//        остальные в круглых

//        String[] array = new String[];
//        int[] array = new int[] {1, 2, 3, 4, 5};
//        int[] newArray  = new int[6];
//        int[] array = new int[8];


        int[] array = {1, 2, 3, 4, 50};
        array[1] = 100;
        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
        }

//         array = Arrays.copyOf(array, 6);
//         System.arraycopy(array, 0, newArray, 0, array.length);

//         array[5] = 100;

//        многомерный массив
        System.out.println("---------------");

        int[][] data2 = new int[3][];
        data2[0] = new int[] {1, 2, 3};
        data2[1] = new int[] {4, 5};
        data2[2] = new int[] {7, 8, 9, 10};

        for (int i = 0; i < data2.length; i++) {
            System.out.println(Arrays.toString(data2[i]));
            int[] innerData = data2[i];
            for (int j = 0; j < innerData.length; j++) {
                System.out.print(innerData[j] + " ");
            }
            System.out.println();
        }

    }
}