package TraningEx;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        math();
        allMath();
        printMath();

    }

    private static void printMath() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " +  num2 + " = " + num1 * num2 + "\n");
        System.out.println(num1 + " + " +  num2 + " = " + num1 + num2 + "\n");


    }

    private static void allMath() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9)% 9);
        System.out.println(20 + -3 * 5/8);
        System.out.println(5 + 15/3 * 2 -8% 3);
    }

    private static void math() {
        int a = 50;
        int b = 3;
        int c = a / b;
        System.out.println("разность = " + c);
        System.out.println();
    }
}
