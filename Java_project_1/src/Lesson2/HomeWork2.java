package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Сумма чисел лежит в пределах 10 - 20 " +  printValue(9, 1));
        printTrueOrFalseValue(0);
        System.out.println("Положительное или отрицательное? " +  printTrueOrFalseValue2(9));
        printSpecifiedNumberOfTimes("Word", 3);
//        System.out.println("Высокостный год или нет? " +  printLeapYearOrNot(101));
    }

    public static boolean printValue(int a, int b) {
        System.out.println("1 задание");
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void printTrueOrFalseValue(int a) {
        System.out.println("2 задание");
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное ");
        }
    }

    public static boolean printTrueOrFalseValue2(int b) {
        System.out.println("3 задание");
        return b > 0;
    }

    private static void  printSpecifiedNumberOfTimes(String word, int count) {
        System.out.println("4 задание");
        for (int c = 0; c <= count; c++) {
            System.out.println(word);
        }
    }

//    public static boolean printLeapYearOrNot(int year) {
//        if (year != 100 && year)
//        return year > 0;
//    }
}
