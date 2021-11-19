package Lesson1;

public class AppMath {
    public static void main(String[] args) {
        int a = 5;
        a = a - 2;
        a -= 2;

        testCommonMath();

        float k = 2 + 2 * 2;
        System.out.println(k);

        double z = (20.0 / 100);
        System.out.println(z * 100 + "%");

        double y = 10 / 3.0;
        System.out.println(y);
        System.out.printf("%.4f%n", y);

        printSum(52, 48);
        printSum(1, 9);

    }

    public static void printSum (int a, int b){
        System.out.println(a + b);
    }

    public static void testCommonMath() {
        int a = 10;
        System.out.println(a);

        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

        a +=10;
        System.out.println(a);

        a *=2;
        System.out.println(a);

        a /= 4;
        System.out.println(a);

        int c = 16;
        float d= 0.5F;
        System.out.println(c / d);
        System.out.println(c % d);
    }
}
