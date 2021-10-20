package HomeWork6;

public class MainAnimalsClass {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", "Черный", 2, 0, 0);
        Animal cat1 = new Cat("Марсик", "Серый", 4,  0, 200);
        Animal dog = new Dog("Тузик", "Белый", 5,  0, 500);
        Animal dog1 = new Dog("Бобик", "Коричневый", 6,  0, 10);

        swim(cat);
        run(cat1);
        swim(dog1);
        run(dog);

    }

    private static void run(HomeWork6.Animal animal) {
        animal.run(350);
    }

    private static void swim(HomeWork6.Animal animal) {
        animal.swim(9);
    }

    public void printAnimalsInfo() {
        System.out.println(this.toString());
    }
}
