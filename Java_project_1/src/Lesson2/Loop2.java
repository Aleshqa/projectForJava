package Lesson2;

public class Loop2 {

    public static void main(String[] args) {
//        testForLoop();
//        testForLoop2();
//        testForLoop3();
//        System.out.println(pow(2,3));
    }
    private static void testForLoop() {
        int a = 5;
        while (a > 0) {
            System.out.println(a);
            a--;
        }
        System.out.println("while");
    }

    private static void testForLoop2() {
        int b = -5;
        do {
            System.out.println(b);
            b--;
        } while (b > 0);
        System.out.println("do - while");
    }

    private static void testForLoop3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i + "=" + j + " ");
            }
            System.out.println();
        }
    }

    private static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }
}