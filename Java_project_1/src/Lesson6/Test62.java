package Lesson6;

import Lesson6.children.Cat;
import Lesson6.children.Dog;

public class Test62 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 3);
        Animal dog = new Dog("Barbos", "Black", 6, "Ovcharka");



        Animal cat2 = new Cat("smth", "red", 555);
//        cat2.sleep();
//        Cat cat3 = (Cat) cat2;
        ((Cat) cat2).sleep(); // cast
        System.out.println(cat2 instanceof Cat);
        System.out.println(cat2 instanceof Dog);
        System.out.println(cat2 instanceof Animal);
        System.out.println(cat2 instanceof Object);

        sayVoice(cat);
        sayVoice(dog);
//
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void sayVoice(Animal animal) {
        animal.voice();
    }
}
