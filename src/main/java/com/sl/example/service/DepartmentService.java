package com.sl.example.service;

import com.sl.example.model.Department;
import com.sl.example.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

   public Department create(Department department){

       return this.departmentRepo.save(department);
   }

    public List<Department> get(){

       return this.departmentRepo.findAll();
    }


   public Department update(Department department,int id){
       department.setId(id);
       return this.departmentRepo.save(department);
   }

    public void delete(int id){

       this.departmentRepo.deleteById(id);
    }

    public Optional<Department> getbyId(int id){

       return this.departmentRepo.findById(id);
    }

}

