package composite.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class Manager implements Employee {
    String name, surname;

    public Manager(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager: "+name +", "+ surname);
    }
}
