package com.sl.example.controller;

import com.sl.example.model.Department;
import com.sl.example.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Operation(summary = "Create Departments")
   @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){

       return this.departmentService.create(department);
   }

    @Operation(summary = "Get All Departments")
    @GetMapping("/")
    public List<Department> getAllDepartment(){

       return this.departmentService.get();
    }
    @Operation(summary = "Update Departement By Id")
    @PutMapping("/{id}")
    public Department updateSingleDepartment(@RequestBody Department department,@PathVariable  int id){
       return this.departmentService.update(department,id);
    }
    @Operation(summary = "Delete Departement By Id")
    @DeleteMapping("/{id}")
    public void deleteSingleDepartment(@PathVariable int id){

       this.departmentService.delete(id);
    }
    @Operation(summary = "Get Department By Id")
    @GetMapping("/{id}")
    public Optional<Department> getDepartmentById(@PathVariable int id){

       return this.departmentService.getbyId(id);
    }
}
