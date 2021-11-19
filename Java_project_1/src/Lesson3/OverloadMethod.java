package Lesson3;

public class OverloadMethod {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(sum(a, b));
    }

//    private static int sum(int a, int b) {
//        return a + b;
//    }
//
//    private static double sum(double a, double b) {
//        return a + b;
//    }
//
//    private static double sum(int a, int b, int c) {
//        return a + b + c;
//    }
////
////
//    private static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    private static int sum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }

        return sum;
    }


//    private static int sum(int[] args) {
//        int sum = 0;
//        for (int i = 0; i < args.length; i++) {
//            sum += args[i];
//        }
//
//        return sum;
//    }


}
