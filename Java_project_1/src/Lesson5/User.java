package Lesson5;

public class User {

    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void jump() {
        System.out.println("Человек " + surname + " прыгнул!");
    }

}
