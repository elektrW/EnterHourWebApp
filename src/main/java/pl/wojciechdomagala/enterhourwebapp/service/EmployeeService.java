package pl.wojciechdomagala.enterhourwebapp.service;

import pl.wojciechdomagala.enterhourwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
