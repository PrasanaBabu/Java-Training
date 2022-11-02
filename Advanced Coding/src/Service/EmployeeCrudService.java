package Service;

import Entity.Employee;
import java.util.List;

public interface EmployeeCrudService {
    void addEmployee(Employee employee);

    Employee getEmployeeById(Integer employeeId);

    void updateEmployee(Employee employee);

    void deleteEmployeeById(Integer employeeId);

    List<Employee> getAllEmployees();

}


