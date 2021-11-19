package Lesson7.string;

import java.util.Scanner;

public class StringBuilderExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        testStringConcatenation(input);
        testStringBuilder(input);
    }

    private static void testStringConcatenation(String input) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 120000; i++) {
            input += "w";
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }


    private static void testStringBuilder(String input) {
        StringBuilder sb = new StringBuilder(input);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 120000; i++) {
            sb.append("w");
        }
        String example = "a" + "b" + "c" + "d" + "e";
        input = sb.toString();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("ss");

    }


}
