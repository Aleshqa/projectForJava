package HomeWork6;

public abstract class Animal {
    protected final String name;
    protected final String color;
    protected final int age;
    protected final int minDistance;
    protected final int maxDistance;

    public Animal(String name, String color, int age, int minDistance, int maxDistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.minDistance = minDistance;
        this.maxDistance = maxDistance;
    }

    public abstract void run(int length);

    public abstract void swim(int length);



//    public void run(){
//        System.out.println("Кот пробежал = ");
//    }


//    public void swim(){
//        System.out.println("Кот не умеет плавать");
//    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
