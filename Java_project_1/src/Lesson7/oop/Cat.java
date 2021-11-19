package Lesson7.oop;

public class Cat {

    private final int appetite;
    private final String name;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println("Cat has eaten!");
        plate.decreaseFood(appetite);
    }
}
