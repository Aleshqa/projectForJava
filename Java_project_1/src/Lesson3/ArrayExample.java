package Lesson3;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
//        testSomeExamples(args);

//        var array = new int[5];
//        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] array = {1, 2, 3, 4, 50};

        array[1] = 222;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[array.length - 1]);
//        System.out.println(array[5]);
        testArray(array);

        System.out.println("----");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----");

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 10) {
                System.out.println(array[i]);
            }
        }

        System.out.println("------ sout -------");

        System.out.println(Arrays.toString(array));
        System.out.println(array);

        array = incrementArraySize(array);

        array = Arrays.copyOf(array, 6);
//        System.arraycopy(array, 0, array, 0, array.length);

//
        array[5] = 100;


        for (int i = 0; i < array.length; i++) {
            int value = array[i];
//            value = 5;
//            array[i] = 5;
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(value);
        }

        System.out.println("--- for each ---");

        for (int value : array) {
            System.out.println(value);
        }


//
//

        System.out.println("--------");

        String[][] data = new String[3][3];
//        data[0] = new int[] {1, 2, 3};
//        data[1] = new int[] {4, 5};
//        data[2] = new int[] {7, 8, 9, 10};
//
//        int[][] data = {
//                {1, 2, 3},
//                {4, 5},
//                {7, 8, 9, 10},
//        };
//
        System.out.println(Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
//            System.out.println(Arrays.toString(data[i]));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[] incrementArraySize(int[] array) {
        int[] newArray = new int[6];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    private static void testArray(int[] array) {
    }

    private static void testSomeExamples(String[] args) {
        System.out.println("args:" + Arrays.toString(args));
        int a = 5;
        int b = a;
        String str = "Hello, World"; // 001
        System.out.println("str1: " + str);

//        str = str.toUpperCase(); // new String("HELLO, WORLD")
        str = str.toUpperCase(); // new String("HELLO, WORLD") // 002
//        System.out.println("str2: " + str);
        System.out.println("str1: " + str);

//
//        testChangeString(str);
//
////        String str = new String("Hello, World");
    }

    private static void testChangeString(String str) {
        str = "qwrqwr";
        String str2 = str.toUpperCase();
    }
}
