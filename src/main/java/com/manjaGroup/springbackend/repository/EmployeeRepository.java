package com.manjaGroup.springbackend.repository;

import com.manjaGroup.springbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
