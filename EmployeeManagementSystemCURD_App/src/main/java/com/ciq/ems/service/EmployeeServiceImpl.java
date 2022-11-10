package com.ciq.ems.service;

import java.util.List;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDaoImpl dao = new EmployeeDaoImpl();

	@Override
	public void save(Employee employee) {
		dao.save(employee);

	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);

	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(int id) {
		dao.delete(id);

	}

}
