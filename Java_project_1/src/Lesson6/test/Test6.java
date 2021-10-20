package Lesson6.test;

import Lesson6.children.Cat;

public class Test6 {

    public static void main(String[] args) {
//        Animal animal = new Animal("Myname", "yellow", 5);
//        Animal cat = new Cat("Barsik", "White", 3);
//        Animal dog = new Dog("Barbos", "black", 7, "Ovcharka");
//
//        animal.voice();
//        cat.voice();
//        dog.voice();

//
//        animal.printInfo();
//        cat.printInfo();
//        dogType1.printInfo();


//        System.out.println(animal.name);


//        Cat cat3 = cat1;
//
//        System.out.println("--- Cat Section ---");
//        cat1.play();
//        cat1.sleep();
//        cat1.voice();
//
//
//        Dog dog = new Dog("Barbos", "Black", 6, "Ovcharka");
//
//        System.out.println("--- Dog Section ---");
//        System.out.println(dog.getType());

//        System.out.println("--- Animal Section ---");
//        Animal animal = new Animal("smth", "red", 555);
//        animal.printInfo();



        int a = 5;
        int b = 5;
        System.out.println("a == b: " + (a == b));

        Cat cat1 = new Cat("Barsik", "White", 3); // 001
        Cat cat2 = new Cat("Barsik", "White", 3); // 011
        Cat cat3 = cat1; // cat3 = 001

        System.out.println("cat1 == cat2: " + (cat1 == cat2)); // 001 == 011
        System.out.println("cat1.equals(cat2): " + (cat1.equals(cat2)));
        System.out.println("cat1 == cat3: " + (cat1 == cat3)); // 001 == 001
        System.out.println("cat1.equals(cat3): " + (cat1.equals(cat3)));
    }
}
