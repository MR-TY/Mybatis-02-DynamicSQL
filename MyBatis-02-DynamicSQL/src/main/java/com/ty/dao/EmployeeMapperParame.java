package com.ty.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ty.entity.Employee;

public interface EmployeeMapperParame {
	public List<Employee> findOneEmpTestDataBaseId(@Param("last_name")String last_name);
}
