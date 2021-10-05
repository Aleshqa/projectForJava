package Lesson2;

public class OperatorSwitch {

    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 10:
                System.out.println(1);
                break;
            case 15:
                System.out.println(2);
                break;
            case 20:
                System.out.println(3);
                break;
            default:
                System.out.println(4);
        }
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
