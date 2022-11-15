package com.ciq.ems.dao;

import java.util.List;

import com.ciq.ems.model.Employee;

public interface EmployeeDao {

	Employee save(Employee employee);

	Employee update(Employee employee);

	List<Employee> findAll();

	void delete(int id);

	Employee getById(int id);
}
