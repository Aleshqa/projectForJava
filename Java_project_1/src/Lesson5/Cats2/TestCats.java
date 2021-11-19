package Lesson5.Cats2;

public class TestCats {

    public static void main(String[] args) {
        Cats cat1 = new Cats("Касандра", "Черно-бело-серая", 10);
//        Cats cat1 = new Cats();
//        cat1.setName("Касандра");
//        cat1.setColor("Черно-бело-серая");
//        cat1.setAge(10);

        Cats cat2 = new Cats("Тося", "Черно-коричневая", 6);
//        cat2.setName("Тося");
//        cat2.setColor("Черно-коричневая");
//        cat2.setAge (6);

        System.out.println(cat1.getName());
        cat1.meow();

        System.out.println("----------");

        System.out.println(cat2.getName());
        cat2.meow();

    }
}
