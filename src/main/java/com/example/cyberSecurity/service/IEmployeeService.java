package com.example.cyberSecurity.service;

import java.util.List;

import com.example.cyberSecurity.model.Employee;

public interface IEmployeeService {
	    public Employee createEmployee(Employee emp);
	    public Employee updateEmployee(Employee emp);
	    public Employee getEmployee(Integer empId);
	    public void deleteEmployee(Integer empId);
	    public List<Employee> getAllEmployee();
}
