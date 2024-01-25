package com.project.departmentservice.controller;

import com.project.departmentservice.dto.DepartmentDto;
import com.project.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/save")
    public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto department){
          return new ResponseEntity<>( departmentService.save(department), HttpStatus.CREATED);
    }

    @GetMapping("/get/{departmentCode}")
   public  ResponseEntity<DepartmentDto> get(@PathVariable String departmentCode){
        return new ResponseEntity<>(departmentService.get(departmentCode), HttpStatus.OK);
   }

}
