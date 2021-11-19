package Lesson2;

public class Methods {

    public static void main(String[] args) {
        printMessage();
        greeting("Aleksey");
        greeting("Tatyana");

        int res1 = sumAB(2, 3); //5
        System.out.println(res1);

        System.out.println(sumAB(5,25)); //30
    }

    public static void printMessage() {
               System.out.println("Hello");
    }

    private static int sumAB(int a, int b) {
        return a + b;
    }

    private static void  greeting (String name) {
        System.out.println("Hello, " + name);
    }
}
