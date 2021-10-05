package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Сумма чисел лежит в пределах 10 - 20 " +  printValue(9, 1));
        printTrueOrFalseValue(0);
        System.out.println("Положительное или отрицательное? " +  printTrueOrFalseValue2(9));
        printSpecifiedNumberOfTimes("Word", 3);
        System.out.println("Высокостный год или нет? " +  printLeapYearOrNot(2021));
    }

    public static boolean printValue(int a, int b) {
        System.out.println("--------------------------------\n1 задание");
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void printTrueOrFalseValue(int a) {
        System.out.println("--------------------------------\n2 задание");
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное ");
        }
    }

    public static boolean printTrueOrFalseValue2(int b) {
        System.out.println("--------------------------------\n3 задание");
        return b > 0;
    }

    private static void  printSpecifiedNumberOfTimes(String word, int count) {
        System.out.println("--------------------------------\n 4 задание");
        for (int c = 0; c <= count; c++) {
            System.out.println(word);
        }
    }

    public static boolean printLeapYearOrNot(int year) {
        System.out.println("--------------------------------\n 5 задание *СЛОЖНОЕ*");
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        else
            return false;
    }
}
