package com.uitgis.jms.repository.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uitgis.jms.entity.mongodb.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
