package com.ty.dao;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ty.entity.Employee;

public interface EmployeeMapperPlus {
	public Employee findOneEmployeeById(Integer id);
	
	public Employee getEmpAndDept(Integer id);
	
	public Employee getEmpByIdStep(Integer id);
	
	/**
	 * 查部门把所有员工的信息查询出来
	 * @param id
	 * @return
	 */
	public List<Employee> getDeptByIdPlus(Integer id);
	/**
	 * 根据部门的id查询所有的相关员工
	 * @param id
	 * @return
	 */
	public List<Employee> getEmpsByDeptId(Integer id);

}
