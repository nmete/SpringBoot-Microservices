package com.project.departmentservice.service.Impl;

import com.project.departmentservice.dto.DepartmentDto;
import com.project.departmentservice.entity.Department;
import com.project.departmentservice.repository.DepartmentRepository;
import com.project.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {

        Department department= new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department newDepartment = departmentRepository.save(department);
        DepartmentDto savedDepartmentDto = new DepartmentDto(
                newDepartment.getId(),
                newDepartment.getDepartmentName(),
                newDepartment.getDepartmentDescription(),
                newDepartment.getDepartmentCode()
        );
        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto get(String departmentCode) {
        Department newDepartment = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto= new DepartmentDto(
                newDepartment.getId(),
                newDepartment.getDepartmentName(),
                newDepartment.getDepartmentDescription(),
                newDepartment.getDepartmentCode()
        );
        return departmentDto;
    }
}
