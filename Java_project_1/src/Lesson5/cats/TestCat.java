package Lesson5.cats;

public class TestCat {


    public static void main(String[] args) {
//        Cat cat1 = new Cat();
        Cat cat1 = new Cat("Barsik", "Red", 4);
//        cat1.name = "Barsik";
//        cat1.color = "Red";
//        cat1.age = 4;

        Cat cat2 = new Cat();
        cat2.setName("Markis");
        cat2.setColor("Black");
        cat2.setAge(7);

        int a = 5;
        Cat cat3 = cat2;
//        cat3.name = "NEW NAME";

//        changeName(cat2);

        System.out.println(cat1.getName());
        cat1.meow();

        System.out.println("------");

        System.out.println(cat2.getName());
        cat2.meow();
    }

    // Cat catAttribute = cat2;
    private static void changeName(Cat catAttribute) {
        catAttribute.setName("NEW NAME");
    }
}
