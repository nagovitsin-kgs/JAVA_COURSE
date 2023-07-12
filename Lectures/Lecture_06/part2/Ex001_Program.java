package Lectures.Lecture_06.part2;

import java.util.*;

class Worker {

    private Integer id;
    private Integer salary;
    private String firstName;
    private String lastName;

    public Worker(Integer Id, Integer Salary, String FirstName, String LastName) {
        id = Id;
        salary = Salary;
        firstName = FirstName;
        lastName = LastName;
    }

    Integer getId() {
        return id;
    }

    Integer getSalary() {
        return salary;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

public class Ex001_Program {

    public static void main(String[] args) {
        // #region

        HashSet<Worker> w1 = new HashSet<Worker>();

        w1.add(new Worker(1000, 100, "Имя_1", "Фамилия_1"));

        for (Worker worker : w1) {
            System.out.println(worker.getId());
            System.out.println(worker.getSalary());
            System.out.println(worker.getFirstName());
            System.out.println(worker.getLastName());

        }

        // w1.
        // w1.getLastName("Фамилия_1");
        // w1.getSalary(100);
        // w1.getId(1000);

        // HashSet<Worker> w4 = new HashSet<Worker>();
        // w4.getFirstName("Имя_1");
        // w4.getLastName("Фамилия_1");
        // w4.getSalary(100);
        // w4.getId(1000);

        // Worker w2 = new Worker();
        // w2.firstName = "Имя_2";
        // w2.lastName = "Фамилия_2";
        // w2.salary = 200;
        // w2.id = 2000;

        // Worker w3 = new Worker();
        // w3.firstName = "Имя_3";
        // w3.lastName = "Фамилия_3";
        // w3.salary = 300;
        // w3.id = 3000;

        // System.out.println(w1);
        // System.out.println(w2);
        // System.out.println(w3);
        // #endregion

        // System.out.println(w1 == w4);
        // System.out.println(w1.equals(w4));
        // var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        // System.out.println(workers.contains(w4));

    }
}
