package Service;

import Entity.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudServiceImpl implements EmployeeCrudService {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {

        for(Employee currentEmployee : employees){
            if (currentEmployee.getId() == employeeId)
                return currentEmployee;
        }
        return new Employee();
    }

    @Override
    public void updateEmployee(Employee newEmployee) {

        for (Employee toChangeEmployee : employees ) {
            if (toChangeEmployee.getId() == newEmployee.getId()) {
                toChangeEmployee.setName(newEmployee.getName());
                toChangeEmployee.setAddress(newEmployee.getAddress());
            }
        }
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {

        for (Employee currentEmployee : employees){
            if (currentEmployee.getId() == employeeId) {
                employees.remove(currentEmployee);
                return;
            }
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
