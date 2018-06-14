package composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class CompanyDirectory implements Employee {
    List<Employee> employees ;

    public CompanyDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp)
    {
        employees.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employees.remove(emp);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee e : employees) {
            e.showEmployeeDetails();
        }
    }
}
