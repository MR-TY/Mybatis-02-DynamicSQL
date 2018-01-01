package com.ty.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ty.entity.Employee;

public interface EmployeeMapperDynamicSQL {
	public List<Employee> findEmpsByConditionTestIf(Employee employee);

	public List<Employee> findEmpsByConditionTestChoose(Employee employee);
	
	public void updateEmp(Employee employee);
	
	public List<Employee> getEmpsByConditionTestForeach(@Param("ids")List<Integer> ids);
	
	public void addEmps(@Param("employees")List<Employee> employees);
}
