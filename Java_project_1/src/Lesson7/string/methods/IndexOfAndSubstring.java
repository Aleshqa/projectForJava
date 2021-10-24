package Lesson7.string.methods;

public class IndexOfAndSubstring {

    public static void main(String[] args) {
        String str = "This is a BeginnersBook is tutorial";
        System.out.println("Index 'tutorial' is: " + str.indexOf("tutorial"));
        System.out.println("Index 'is' is: " + str.indexOf("is", 4));
        System.out.println("Index 'is' is: " + str.lastIndexOf("is"));

        System.out.println("'tutorial' contains: " + str.contains("tutorial"));

        System.out.println(str.substring(str.lastIndexOf("is") + 3));
    }
}
