package com.uitgis.jms.service.impl;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uitgis.jms.entity.rdbms.Department;
import com.uitgis.jms.repository.rdbms.DepartmentRepository;
import com.uitgis.jms.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepo;

	@Override
	@Transactional
	public void transactionRollbackTest() {
		Department department = new Department(RandomStringUtils.randomAlphabetic(5));
		departmentRepo.save(department);

		int a = 1 / 0;
		System.out.println(a);
	}

}
