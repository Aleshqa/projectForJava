package Lesson5.HomeWork5;

public class Worker {

    private String fullName;
    private int age;
    private String email;
    private long phone;
    private int salary;
    private String post;



    public int getAge() {
        return age;
    }


    public Worker(String fullName, int age, String email, Long phone, int salary, String post) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.post = post;
    }

    public void printWorkersInfo() {
        System.out.println("Фамилия |" + fullName + "| Возраст " + age + "| Почта " + email + "| Телефон " + phone + "| Зарплата " + salary + "| Должность " + post + "|");
    }
}
