package com.project.departmentservice.repository;//package com.project.departmentservice.repository;

import com.project.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
Department findByDepartmentCode(String departmentCode);
}
