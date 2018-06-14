package composite.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class Developer implements Employee {
    String name, surname;

    public Developer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer: "+name +", "+ surname);
    }
}
