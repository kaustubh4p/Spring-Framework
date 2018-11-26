package com.spring.core.bean;

/**
 * @author KaustubhWaghmare
 * Employee Bean
 */
public class EmployeeBean {
	
	private String empName;
	private String empId;
	

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}


	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmployeeDetails() {
		return "EmployeeBean [empName=" + empName + ", empId=" + empId + "]";
	}
	
	
	

}
