package Lesson3;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random rand = new Random();


        int a = rand.nextInt(10); // [0; 10) --> 0..9
        int b = rand.nextInt(10);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int result = sum(a, b);
        System.out.println("a + b = " + result);

        int c = rand.nextInt(11) + 10; //[10; 20]
        System.out.println(c);

        if (c < 0) {
            System.out.println("Result: " + c);
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
