package Lesson7.string.methods;

import java.nio.file.Files;
import java.util.Arrays;

public class SplitJoin {

    public static void main(String[] args) {
        String str = "Write once, run everywhere!";

        String[] parts = str.split(" ");
        System.out.println(Arrays.toString(parts) + " Length: " + parts.length);

        parts = str.split(" ", 2);
        System.out.println(Arrays.toString(parts) + " Length: " + parts.length);

        parts = str.split(" ");
        System.out.println(String.join("-", parts));
    }

}
