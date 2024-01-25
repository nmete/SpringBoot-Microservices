package com.project.employeeservice.service;

import com.project.employeeservice.dto.APIResponseDto;
import com.project.employeeservice.dto.EmployeeDto;
import com.project.employeeservice.entity.Employee;

public interface EmployeeService {
    EmployeeDto save(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long id);
}
