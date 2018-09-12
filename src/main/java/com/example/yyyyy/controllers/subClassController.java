package com.example.yyyyy.controllers;

import com.example.yyyyy.entity.subClass;
import com.example.yyyyy.service.subClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class subClassController {

    @Autowired
    subClassService sr;


    @RequestMapping(value="/addsubclass",method= RequestMethod.POST)
    public @ResponseBody
    void addSubClass(@RequestBody subClass b){

        sr.addSubClass(b);

    }
    @RequestMapping(value="/addsubclasses",method= RequestMethod.POST)
    public @ResponseBody void addSubClasses(@RequestBody List<subClass> b){

        sr.addSubClasses(b);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{departmentnum}/class/{classnum}/subclasses",method= RequestMethod.GET)
    public @ResponseBody List<subClass> getSubClasses(@PathVariable(value="brandnum")long bnum,@PathVariable(value="divisonnum")long dnum,@PathVariable(value="departmentnum")long denum,@PathVariable(value="classnum") long cnum){

        return sr.getSubClasses(bnum,dnum,denum,cnum);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{departmentnum}/class/{classnum}/subclass/{subclassnum}",method= RequestMethod.GET)
    public @ResponseBody subClass getSubClasses(@PathVariable(value="brandnum")long bnum,@PathVariable(value="divisonnum")long dnum,@PathVariable(value="departmentnum")long denum,@PathVariable(value="classnum") long cnum,@PathVariable(value="subclassnum")long subclassnum){

        return sr.getSubClassDesc(bnum,dnum,denum,cnum,subclassnum);

    }



}
