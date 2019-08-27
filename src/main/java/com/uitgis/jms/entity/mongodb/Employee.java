package com.uitgis.jms.entity.mongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private String id;

	@Indexed(unique = true)
	@Field(value = "Emp_No")
	private String empNo;

	@Field(value = "Full_Name")
	private String fullName;

	@Field(value = "Hire_Date")
	private Date hireDate;

	public Employee(String empNo, String fullName, Date hireDate) {
		super();
		this.empNo = empNo;
		this.fullName = fullName;
		this.hireDate = hireDate;
	}

}
