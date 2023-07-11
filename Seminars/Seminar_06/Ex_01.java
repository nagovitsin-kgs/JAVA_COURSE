package Seminars.Seminar_06;

import java.util.*;

class Person {
    private String name;
    private Integer age;
    private String city;
    private Person chil = null;

    public Person(String Name, Integer Age, String City) {
        name = Name;
        age = Age;
        city = City;
    }

    public Person(String Name, Integer Age, String City, Person Chil) {
        name = Name;
        age = Age;
        city = City;
        chil = Chil;
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    String getCity() {
        return city;
    }

    String getNameChil() {
        return chil.getName();
    }

    Person getPersonChil() {
        return chil;
    }
}

public class Ex_01 {
    // 0 - dataBase
    // \ - дерево отец - сын
    // 1 - dataBase
    public static void main(String[] args) {
        HashSet<Person> states = new HashSet<Person>();
        states.add(new Person("Ivan", 15, "Moscow"));
        states.add(new Person("Vlad", 22, "Rostov"));
        states.add(new Person("Egor", 30, "Moscow", new Person("Max", 10, "Moscow")));
        for (Person p : states) {

            System.out.println(p.getName());
            System.out.println(p.getAge());
            System.out.println(p.getCity());
            if (p.getPersonChil() != null) {
                System.out.println("У " + p.getName() + " ребенок " + p.getNameChil());
            }

        }

    }
}