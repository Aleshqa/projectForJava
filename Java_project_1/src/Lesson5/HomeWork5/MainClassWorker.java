package Lesson5.HomeWork5;

public class MainClassWorker {

    public static void main(String[] args) {
        System.out.println("Выводится информация о работниках, чей возраст больше 40 лет:\n");
        Worker[] worker = new Worker[5];
        worker[0] = new Worker("Сафинов Дмитрий Яковлевич", 45,"safinov@mail.ru", 567934997876767L, 45000, "Инженер");
        worker[1] = new Worker("Пронина Лидия Геннадьевна", 35,"pronina@mail.ru", 17462836492L, 60000, "Администратор");
        worker[2] = new Worker("Ходосок Светлана Викторовна", 49,"hodosok@mail.ru", 2793499453L, 29500, "Продавец");
        worker[3] = new Worker("Зюзина Елизавета Андреевна", 20,"zuzina@mail.ru", 479112041L, 20000, "Кассир");
        worker[4] = new Worker("Попова Лилия Геннадьевна", 50,"Popova@mail.ru", 77939012350289L, 125600, "Директор");

        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getAge() > 40){
                worker[i].printWorkersInfo();
            }
        }
    }
}
