package Lesson2;

public class Switch2 {

    public static void main(String[] args) {
        int numberOfMonth = 6;
        String monthName = "Апрель";

//        printMonthByNumberIf(numberOfMonth);
//        printMonthByNumberSwitch(numberOfMonth);
//        printMonthByNumberSwitchV2(numberOfMonth);
//        printNumberDaysInMonth(monthName);
    }

    private static void printMonthByNumberIf(int numberOfMonth) {
        if (numberOfMonth == 1) {
            System.out.println("Январь");
        } else if (numberOfMonth == 2) {
            System.out.println("Февраль");
        } else if (numberOfMonth == 3) {
            System.out.println("Март");
        } else if (numberOfMonth == 4) {
            System.out.println("Апрель");
        } else {
            System.out.println("Только первые 4 месяца");
        }
    }

    private static void printMonthByNumberSwitch(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            default:
                System.out.println("Только первые 4 месяца");
        }
    }

    private static int printNumberDaysInMonth(String monthName) {
        switch (monthName) {
            case "Январь":
                return 31;
            case "Февраль":
                return 28;
            case "Март":
                return 31;
            case "Апрель":
                return 30;
            default:
                System.out.println("неизвестное имя месяца");
                return 0;
        }
    }

//    private static void printMonthByNumberSwitchV2(int numberOfMonth) {
//        switch (numberOfMonth) {
//            case 1 -> System.out.println("Январь");
//            case 2 -> System.out.println("Февраль");
//            case 3 -> System.out.println("Март");
//            case 4 -> System.out.println("Апрель");
//            default ->  System.out.println("Только первые 4 месяца");
//        }
//    }
}