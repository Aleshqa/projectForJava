package Lesson5.Cats2;

public class Cats {


    private String name;
    private String color;
    private int age;

    public Cats(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

//    public Cats() {
//    }

    public void meow(){
        System.out.println(buildMeowMessage());
    }

    private String buildMeowMessage() {
        return "Котик " + name + " мяукнул!!";
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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
