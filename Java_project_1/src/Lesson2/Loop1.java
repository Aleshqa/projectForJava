package Lesson2;

public class Loop1 {

    public static void main(String[] args) {
//        testForLoop();
//        testForLoop2();
        testForLoop3();
//        System.out.println(pow(2,3));
    }
    private static void testForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Hello!");
        }
    }

    private static void testForLoop2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("i = " + 1 + "; j = " + j);
            }
        }
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