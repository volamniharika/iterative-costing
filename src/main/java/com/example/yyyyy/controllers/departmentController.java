package com.example.yyyyy.controllers;

import com.example.yyyyy.Entity.Department;
import com.example.yyyyy.service.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class departmentController {


    @Autowired
    departmentService ds;


    @RequestMapping(value="/addepartment",method= RequestMethod.POST)
    public @ResponseBody
    void addDepartment(@RequestBody Department b){

        ds.addDepartment(b);

    }
    @RequestMapping(value="/adddepartments",method= RequestMethod.POST)
    public @ResponseBody void addDepartments(@RequestBody List<Department> b){

        ds.addDepartments(b);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/departments",method= RequestMethod.GET)
    public @ResponseBody
    List<Department> getDepartments(@PathVariable("brandnum")long bnum, @PathVariable("divisonnum")long dnum){

        return ds.getDepartments(bnum,dnum);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{d}",method= RequestMethod.GET)
    public @ResponseBody
    Department getDepartment(@PathVariable(value="d")long dnum, @PathVariable(value="divisonnum")long divisonnum){

        return ds.getDepartment(dnum);



    }

}
