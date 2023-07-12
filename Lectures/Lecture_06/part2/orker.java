package Lectures.Lecture_06.part2;

public class Worker {

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
    // @Override
    // public String toString() {
    // return String.format("%d %s %s %d", id, firstName, lastName, salary);
    // }

    // @Override
    // public boolean equals(Object o) {
    // var t = (Worker) o;
    // return id == t.id && firstName == t.firstName;
    // }

    // @Override
    // public int hashCode() {
    // return id;
    // }
}
