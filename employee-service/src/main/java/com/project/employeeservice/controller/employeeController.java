package com.project.employeeservice.controller;

import com.project.employeeservice.dto.APIResponseDto;
import com.project.employeeservice.dto.EmployeeDto;
import com.project.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class employeeController {

    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/save")
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto employee){
        return new ResponseEntity<>( employeeService.save(employee), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public  ResponseEntity<APIResponseDto> get(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }
}
