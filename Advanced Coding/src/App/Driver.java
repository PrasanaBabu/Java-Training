package App;

import Entity.Address;
import Entity.Employee;
import Service.EmployeeCrudService;
import Service.EmployeeCrudServiceImpl;

public class Driver {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Rahul",
                new Address(18, "Vivek Street", "Chennai"));

        Employee employee2 = new Employee(2, "Albie",
                new Address(108, "Nehru Street", "New Delhi"));

        Employee employee3 = new Employee(3, "Sonu",
                new Address(98, "Sardar Street", "Kochi"));

        Employee employee4 = new Employee(4, "Binoy",
                new Address(222, "Malik Street", "Pune"));

        Employee employee5 = new Employee(5, "Vikram",
                new Address(181, "Joseph Street", "Chennai"));

        EmployeeCrudService employeeCrudService = new EmployeeCrudServiceImpl();

        employeeCrudService.addEmployee(employee1);
        employeeCrudService.addEmployee(employee2);
        employeeCrudService.addEmployee(employee3);
        employeeCrudService.addEmployee(employee4);
        employeeCrudService.addEmployee(employee5);

        System.out.println("\n All Employees after adding :\n" + employeeCrudService.getAllEmployees());

        employeeCrudService.deleteEmployeeById(3);

        System.out.println("\n All Employees after deletion :\n" + employeeCrudService.getAllEmployees());

        Employee newEmployee4 = new Employee(4, "Binoy",
                new Address(100, "Ganguly Street", "Kolkata"));

        employeeCrudService.updateEmployee(newEmployee4);

        System.out.println("\n Employee after updating:\n" + employeeCrudService.getEmployeeById(4));



    }
}
