package com.ty.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ty.entity.Employee;

public interface EmployeeMapper {
	public Employee getEmployById(Integer id);
	
	public void addEmp(Employee employee);
	
	public void updateEmp(Employee employee);
	
	public void deleteEmp(Integer id);
	
	public Employee getEmpByIdAndLastName(@Param("id")Integer id, @Param("lastName")String lastName);
	
	public Employee getByIdAndLastName(Map<String, Object> map);
	
	public List<Employee> getEmpByLikeName(String lastName);
	@MapKey("id")
	public Map<Integer, Employee> getEmpsLikesNames(String lastName);

}
