package Lesson6.children;

import Lesson6.Animal;

import java.util.Objects;

public class Dog extends Animal {

    private final String type;

    public Dog(String name, String color, int age, String type) {
        super(name, color, age);
        this.type = type;
    }

    public Dog(String color, int age, String type) {
        this("default name", color, age, type);
    }

    public String getType() {
        return type;
    }

    @Override
    public void voice() {
        System.out.println("Bark!");
    }

//    @Override
//    public void printInfo() {
//        System.out.println(super.toString());
//        System.out.println(toString());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(type, dog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
