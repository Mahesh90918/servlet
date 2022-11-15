package com.ciq.ems.queries;

public interface EmployeeQueries {

	
	String INSERT_EMP = "INSERT INTO EMPOLYEE VALUES(?,?,?,?)";
	String FIND_ALL_EMPLOYEE="SELECT * FROM EMPOLYEE ";
	String DELETE_BY_ID = "DELETE FROM EMPOLYEE WHERE ID=?";
	String UPDATE_EMP = "UPDATE EMPOLYEE SET NAME=?, SALARY=?, EMAIL=? WHERE ID=?";
	String FIND_BY_ID_SQL ="SELECT * FROM EMPOLYEE WHERE ID=?";
}
