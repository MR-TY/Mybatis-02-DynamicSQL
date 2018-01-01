package com.ty.test;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ty.dao.DepartmentMapper;
import com.ty.dao.EmployeeMapper;
import com.ty.dao.EmployeeMapperDynamicSQL;
import com.ty.dao.EmployeeMapperParame;
import com.ty.dao.EmployeeMapperPlus;
import com.ty.entity.Department;
import com.ty.entity.Employee;

public class TestNewMybatis {
	public static void main(String[] args) throws IOException {
		//方式一：基于跑文件的
		// 1.获取配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 2.得到sqlsession的工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 3.获取session
		SqlSession session = sessionFactory.openSession();
		System.out.println(session);
		//获取接口的实现类对象1
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		EmployeeMapperPlus employeeMapper1 = session.getMapper(EmployeeMapperPlus.class);
		DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
		EmployeeMapperDynamicSQL employeeMapperDynamicSQL = session.getMapper(EmployeeMapperDynamicSQL.class);
		EmployeeMapperParame employeeMapperParame = session.getMapper(EmployeeMapperParame.class);
//		System.out.println("departmentName:"+departmentMapper);
		//----------通过id查看-------
//		Employee employee = employeeMapper.getEmployById(4);
//		System.out.println(employee);
		
//		Employee employee = employeeMapper.getEmpByIdAndLastName(4, "kobe");
//		System.out.println(employee);
		
		//---------多个条件查询--------
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", 3);
//		map.put("lastName", "mr_t");
//		map.put("tableName", "tbl_employee");
//		Employee employee = employeeMapper.getByIdAndLastName(map);
//		System.out.println(employee);
		//----------模糊查询---------
//		List<Employee> employees = employeeMapper.getEmpByLikeName("%m%");
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		//-----------插入-----------
//		Employee employee2 = new Employee(null, "kobe", "1", "@123");
//		employeeMapper.addEmp(employee2);
		
		//----------删除------------
//		employeeMapper.deleteEmp(1);
		
		//----------修改------------
//		Employee employee2 = new Employee(3, "mr_t", "1", "@123");
//		employeeMapper.updateEmp(employee2);
		//进行添加之后必须进行手动提交，如果不提交就不能进行添加
//		Map<Integer, Employee> map = employeeMapper.getEmpsLikesNames("%m%");
//		System.out.println(map);
		
//----------------EmployeeMapperPlus.xml的查询-------------
//		//-------1.级联查询-------------
//		Employee employee = employeeMapper1.getEmpAndDept(3);
//		System.out.println(employee);
		//-------2.association的步骤查询--
//		Employee employee = employeeMapper1.getEmpByIdStep(3);
//		System.out.println(employee);
		//------3.collection查询---------
//		List<Employee> employees = departmentMapper.getDeptByIdPlus(1);
//		System.out.println(employees);
		//------4.collection查询:按步骤查询：先查出部门，然后根据部门查出员工-----
//		List<Employee> employees = employeeMapper1.getEmpsByDeptId(1);
//		System.out.println(employees);
//		Employee employee = new Employee(3, "Mr_ty", "1", "465141730@qq.com");
//-----------------mybatis的sql动态语句运用-----------------
		//----------1.条件查询------------
//		List<Employee> employees = employeeMapperDynamicSQL.findEmpsByConditionTestChoose(employee);
//		System.out.println(employees);
		//----------2.哪一列有值就更新哪一列--------
//		employeeMapperDynamicSQL.updateEmp(employee);
		//----------3.foreach进行集合的遍历-------
		List<Employee> employees = employeeMapperDynamicSQL.getEmpsByConditionTestForeach(Arrays.asList(3,4,5));
		System.out.println(employees);
		//----------4.批量保存-------------------
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(new Employee("tom", "1", "123", new Department(1)));
//		employees.add(new Employee("kk", "0", "321", new Department(2)));
//		employeeMapperDynamicSQL.addEmps(employees);
//------------------测试两个重要的参数-----------------
		
//		List<Employee> employee = employeeMapperParame.findOneEmpTestDataBaseId("m");
//		System.out.println(employee);
		session.commit();
		//提交之后进行关闭
		session.close();
		
	}
}
