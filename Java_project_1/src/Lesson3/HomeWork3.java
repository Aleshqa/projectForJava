package Lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        invertValueArray();
        arrayFromOneToHundred();
        changeArray();
        diagArray(5);
        System.out.println(Arrays.toString(createLenAndInitialValueArray(15, 3)));
        findMinMax();
    }

    public static void invertValueArray() {
        System.out.println("Задание №1\n");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i =  array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
//        System.out.println(Arrays.toString(array));
    }

    public static void arrayFromOneToHundred(){
        System.out.println("\nЗадание №2");
        int[] array = new int[100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i + 1;
//            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray(){
        System.out.println("\nЗадание №3");
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
                System.out.println(array[i]);
            }
//            System.out.println(Arrays.toString(array));
        }
    }

    public static void diagArray(int size) {
        System.out.println("\nЗадание №4");
        int[][] array = new int[size][size];
        for (int i = 0; i < size ; i++) {
            array[i][i] = 1;
            array[size - i - 1][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int[] createLenAndInitialValueArray(int len, int initialValue) {
        System.out.println("\nЗадание №5");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void findMinMax() {
        System.out.println("\nЗадание №6");
        int [] array = {25, 11, 250, 5, -9, -50};
        int max = array[0];
        int min = array[0];
        for(int i = 0; i != array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
