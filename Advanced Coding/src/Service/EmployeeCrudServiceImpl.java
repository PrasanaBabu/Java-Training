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

        for (int index=0 ; index < employees.size(); index++ )
            if(employees.get(index).getId() == employeeId)
                return employees.get(index);
        return new Employee();
    }

    @Override
    public void updateEmployee(Employee newEmployee) {

        for (int index=0 ; index < employees.size(); index++ ) {
            Employee toChangeEmployee = employees.get(index);
            if (toChangeEmployee.getId() == newEmployee.getId()) {
                toChangeEmployee.setName(newEmployee.getName());
                toChangeEmployee.setAddress(newEmployee.getAddress());
            }
        }
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {

        for (int index = 0; index < employees.size(); index++){
            Employee currentEmployee = employees.get(index);
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
