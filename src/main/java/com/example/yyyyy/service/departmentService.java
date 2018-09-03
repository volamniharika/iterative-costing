package com.example.yyyyy.service;

import com.example.yyyyy.Entity.Department;
import com.example.yyyyy.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class departmentService {

    @Autowired
    DepartmentRepository dp;


    public void addDepartment(Department d)
    {

        dp.save(d);
    }

    public void addDepartments(List<Department> d)
    {
        dp.saveAll(d);
    }


   public List<Department> getDepartments(long bnum,long dnum)
    {
        System.out.println("in service");
        return dp.findDepartments(bnum,dnum);
    }
    public Department getDepartment(long num)
    {

        return dp.findDept(num);
    }



}
