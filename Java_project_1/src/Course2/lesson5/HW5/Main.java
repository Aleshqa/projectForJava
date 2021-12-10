package Course2.lesson5.HW5;

import Course2.lesson5.Demo3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Demo3.User> userList = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader("test2.txt"))) {
            String result = null;
            in.readLine(); // вычитка первой строки
            while ((result = in.readLine()) != null) {
                String[] tokens = result.split("\\s");
                Demo3.User user = new Demo3.User(Long.parseLong(tokens[0]), tokens[1], tokens[2]);
                userList.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        userList.forEach(System.out::println);
    }
}
