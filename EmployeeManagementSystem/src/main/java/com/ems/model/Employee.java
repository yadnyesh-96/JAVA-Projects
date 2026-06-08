package com.ems.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private int empPk;
	private String employeeId;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String mobile;
	private String gender;
	private int departmentId;
	private String joiningDate;
	private String status;
}