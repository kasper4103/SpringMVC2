/*
*
*Copyright (c) 2020, pcschool 
*/

package tw.com.pcschool.crud.entities;
/**
*
*@author Lee
* 課程大綱:
*/
public class Department {
	private int id;
	private String departmentName;
	public Department(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
