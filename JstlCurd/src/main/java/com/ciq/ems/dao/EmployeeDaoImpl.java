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
	public Employee save(Employee emp) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(EmployeeQueries.INSERT_EMP);
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
//		} finally {
//			ConnectionUtil.closeConnection();
		}
		return emp;

	}

	@Override
	public Employee update(Employee employee) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
//			String UPDATE_EMP = "UPDATE EMPOLYEE SET ENAME=?, SALARY=?, EMAIL=? WHERE ENO=?";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(EmployeeQueries.UPDATE_EMP);
			ps.setString(1, employee.getName());
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setInt(4, employee.getId());
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {
//			ConnectionUtil.closeConnection(con, ps);
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(EmployeeQueries.FIND_ALL_EMPLOYEE);
			rs = ps.executeQuery();
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
//		} finally {
//			ConnectionUtil.closeConnection(con, ps, rs);
		}
		return null;
	}

	@Override
	public void delete(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(EmployeeQueries.DELETE_BY_ID);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {
//			ConnectionUtil.closeConnection(con, ps);
		}
	}

	@Override
	public Employee getById(int id) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Employee emp = new Employee();
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(EmployeeQueries.FIND_BY_ID_SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setEmail(rs.getString(4));
			}

			return emp;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		List<Employee> list = emp.findAll();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		// emp.delete(98);
		// System.out.println(emp);
		System.out.println(emp.getById(5));
	}

}
