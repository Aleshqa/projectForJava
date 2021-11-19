//package Lesson7.string;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//import java.util.Scanner;
//
//public class ReadFileExample {
//
//    public static void main(String[] args) throws IOException {
//        List<String> lines = Files.readAllLines(Path.of("test_read.txt")); // String[] lines
//        for (String readAllLine : lines) {
//            System.out.println(readAllLine);
//        }
//
//        String x = Files.readString(Path.of("test_read.txt"));
//        System.out.println(x);
//
//
//        System.out.println("------------ scanner -------------");
//        Scanner scanner = new Scanner(new File("test_read.txt"));
////        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
//        }
//
//    }
//}
