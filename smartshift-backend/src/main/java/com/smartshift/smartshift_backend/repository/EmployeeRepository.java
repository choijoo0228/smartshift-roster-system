package com.smartshift.smartshift_backend.repository;

import com.smartshift.smartshift_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
