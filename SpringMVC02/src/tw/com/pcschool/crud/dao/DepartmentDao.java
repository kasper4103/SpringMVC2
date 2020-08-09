/*
*
*Copyright (c) 2020, pcschool 
*/

package tw.com.pcschool.crud.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import tw.com.pcschool.crud.entities.Department;

/**
*
*@author Lee
* 課程大綱:
*/
public class DepartmentDao {
	private static Map<Integer,Department> departments=null;
	
	static {
		departments=new HashMap<Integer,Department>();
		departments.put(101,new Department(101,"AA-101"));
		departments.put(102,new Department(102,"AA-102"));
		departments.put(103,new Department(103,"AA-103"));
		departments.put(104,new Department(104,"AA-104"));
		departments.put(105,new Department(105,"AA-105"));
	}
	
	public Collection<Department> getDepartments(){
		return departments.values();
	}
	
	public Department getDepartment(Integer id) {
		return departments.get(id);
	}
}
