package Lesson3;

public class FormatString {

    public static void main(String[] args) {
        int min = 10;
        double max = 20.5254631;
        System.out.println("Введите число от " + min + " до " + max);

        String message0 = String.format("Введите %s от %s до %s", "{число}", min, max);
        String message = String.format("Введите %s от %d до %.2f", "{число}", min, max);
        String message1 = String.format("Введите числа от %2$d до %1$.2f", max, min);
        System.out.println(message0);
        System.out.println(message);
        System.out.println(message1);
        System.out.printf("Введите числа от %2$d до %1$.2f", max, min);
    }
}
