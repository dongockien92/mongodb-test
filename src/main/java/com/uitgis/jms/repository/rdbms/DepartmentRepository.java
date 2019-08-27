package com.uitgis.jms.repository.rdbms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uitgis.jms.entity.rdbms.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
