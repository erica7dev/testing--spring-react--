package net.employeesystemapi.service;

import java.util.List;

import net.employeesystemapi.model.Employee;

public interface EmployeeService {
  Employee createEmployee(Employee employee);

  List<Employee> getAllEmployees();

  boolean deleteEmployee(Long id);

  Employee getEmployeeById(Long id);

  Employee updateEmployee(Long id, Employee employee);
}
