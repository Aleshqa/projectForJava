package Lesson5.cats;

public class Cat {

    // private, default, protected, public
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color) {
        this(name, color, 4);
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

//        return this;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        System.out.println("current age is " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println(buildMeowMessage());
    }

    private String buildMeowMessage() {
        return "Кот " + name + " мяукнул!";
    }

}
