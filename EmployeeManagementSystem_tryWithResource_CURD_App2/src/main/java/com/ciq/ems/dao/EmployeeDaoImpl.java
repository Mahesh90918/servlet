package com.ciq.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.ems.Util.ConnectionUtil;
import com.ciq.ems.model.Employee;
import com.ciq.ems.queries.EmployeeQueries;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee emp) {

		try (Connection con = ConnectionUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(EmployeeQueries.INSERT_EMP)) {
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getEmail());
			ps.addBatch();
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Override
	public void update(Employee employee) {

		try
//			String UPDATE_EMP = "UPDATE EMPOLYEE SET ENAME=?, SALARY=?, EMAIL=? WHERE ENO=?";
		(Connection con = ConnectionUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(EmployeeQueries.UPDATE_EMP)) {
			ps.setString(1, employee.getName());
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setInt(4, employee.getId());
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> findAll() {

		try (Connection con = ConnectionUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(EmployeeQueries.FIND_ALL_EMPLOYEE);
				ResultSet rs = ps.executeQuery()) {
			List<Employee> list = new ArrayList<>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setEmail(rs.getString(4));
				list.add(emp);
			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(int id) {

		try (Connection con = ConnectionUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(EmployeeQueries.DELETE_BY_ID)) {
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
