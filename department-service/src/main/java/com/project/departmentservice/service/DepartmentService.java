package com.project.departmentservice.service;

import com.project.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto save(DepartmentDto departmentDto);


    DepartmentDto get(String departmentCode);
}
