package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // 4. Створення об'єктів та масиву

        Person person1 = new Person("Петренко", "Петро", 35);
        Student student1 = new Student("Іваненко", "Іван", 20, "КН-31", "KB12345678");
        Lecturer lecturer1 = new Lecturer("Сидоренко", "Сидір", 45, "Комп'ютерних наук", 25000.0);
        Student student2 = new Student("Коваленко", "Марія", 19, "ІПЗ-22", "KB87654321");

        // Створення масиву типу Person
        Person[] people = new Person[4];

        // Заповнення масиву об'єктами різних класів
        people[0] = person1;
        people[1] = student1;
        people[2] = lecturer1;
        people[3] = student2;

        // 5. Використання циклу для виведення інформації
        System.out.println("--- Список людей в масиві ---");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}