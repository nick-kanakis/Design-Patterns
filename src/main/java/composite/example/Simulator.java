package composite.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Employee dev1 = new Developer("John", "Doe");
        Employee dev2 = new Developer("Nick", "Kalathis");

        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        CompanyDirectory managementDirectory = new CompanyDirectory();
        Employee mng1 = new Manager("John", "Black");
        Employee mng2 = new Manager("Helen", "Snow");
        managementDirectory.addEmployee(mng1);
        managementDirectory.addEmployee(mng2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(managementDirectory);
        directory.addEmployee(engineeringDirectory);

        directory.showEmployeeDetails();

    }
}
