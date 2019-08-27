package com.uitgis.jms.service.impl;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uitgis.jms.entity.mongodb.Employee;
import com.uitgis.jms.repository.mongodb.EmployeeRepository;
import com.uitgis.jms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	@Transactional
	public void transactionRollbackTest() {
		Employee employee = new Employee(UUID.randomUUID().toString(), RandomStringUtils.randomAlphabetic(10),
				new Date());
		employeeRepo.save(employee);

		int a = 1 / 0;
		System.out.println(a);
	}
}
