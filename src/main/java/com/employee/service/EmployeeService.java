package com.employee.service;

import com.employee.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
