package com.capg.lab11;

public class Department {

	private int departmentID;
	private String departmentName;
	private int managerID;

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerID() {
		return managerID;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", managerID="
				+ managerID + "]";
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

}
