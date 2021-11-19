package HomeWork6;

public class Dog extends Animal {

    public Dog(String name, String color, int age, int minDistance, int maxDistance) {
        super(name, color, age, minDistance, maxDistance);
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= maxDistance))
            System.out.println("Пес с именем " + name + " пробежал дистанцию в " + length + " метров");
    }

    @Override
    public void swim(int length) {
        if ((length >= 0) && (length <= maxDistance))
            System.out.println("Пес с именем " + name + " проплыл дистанцию в " + length + " метров");
        else System.out.println("Пес с именем " + name + " не проплыл дистанцию в " + length + " метров");
    }


}
