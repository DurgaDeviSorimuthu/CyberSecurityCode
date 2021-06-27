package com.example.cyberSecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cyberSecurity.dao.EmployeeRepository;
import com.example.cyberSecurity.model.Employee;
@Service
public class EmpServiveImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getEmployee(Integer empId) {
		 Optional<Employee> optionalEmp = employeeRepository.findById(empId);
	        if (optionalEmp.isPresent()) {
	            return optionalEmp.get();
	        }
	        return null;
	}

	@Override
	public void deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
