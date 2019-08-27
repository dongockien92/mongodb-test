package com.uitgis.jms.service.impl;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uitgis.jms.entity.mongodb.Employee;
import com.uitgis.jms.entity.rdbms.Department;
import com.uitgis.jms.repository.mongodb.EmployeeRepository;
import com.uitgis.jms.repository.rdbms.DepartmentRepository;
import com.uitgis.jms.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private DepartmentRepository departmentRepo;

	@Override
	@Transactional
	public void transactionRollbackTest() {
		Employee employee = new Employee(UUID.randomUUID().toString(), RandomStringUtils.randomAlphabetic(10),
				new Date());
		employeeRepo.save(employee);

		Department department = new Department(RandomStringUtils.randomAlphabetic(5));
		departmentRepo.save(department);

		int a = 1 / 0;
		System.out.println(a);
	}

}
