package HomeWork6;

import Lesson5.Cats2.Cats;

public class Cat extends Animal {

    public Cat(String name, String color, int age, int minDistance, int maxDistance) {
        super(name, color, age, minDistance, maxDistance);
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= maxDistance)) System.out.println("Кот с именем " + name + " пробежал дистанцию в " + length + " метров");
        else System.out.println("Кот с именем " + name + " не пробежал дистанцию = " + length);
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот с именем " + name + " не умеет плавать");
    }
}
