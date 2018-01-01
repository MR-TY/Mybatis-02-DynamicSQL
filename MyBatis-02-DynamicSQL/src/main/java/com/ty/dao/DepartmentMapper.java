package com.ty.dao;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ty.entity.Department;
import com.ty.entity.Employee;

public interface DepartmentMapper {
	
	/**
	 * 通过id查询部门
	 * @param id
	 * @return
	 */
	public Department GetDeptById(Integer id);
	

	
}
