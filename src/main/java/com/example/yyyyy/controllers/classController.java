package com.example.yyyyy.controllers;

import com.example.yyyyy.entity.Classes;
import com.example.yyyyy.service.classService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class classController {

    @Autowired
    classService cs;

    @RequestMapping(value="/addclass",method= RequestMethod.POST)
    public @ResponseBody
    void addBrand(@RequestBody Classes b){

        cs.addClass(b);

    }
    @RequestMapping(value="/addclasses",method= RequestMethod.POST)
    public @ResponseBody void addDivisons(@RequestBody List<Classes> b){

        cs.addClasses(b);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{departmentnum}/classes",method= RequestMethod.GET)
    public @ResponseBody List<Classes> getClasses(@PathVariable(value="brandnum")long brandnum,@PathVariable(value="divisonnum")long divisonnum,@PathVariable(value="departmentnum")long departmentnum){


        return cs.getClasses(brandnum,divisonnum,departmentnum);

   }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{departmentnum}/class/{classnum}",method= RequestMethod.GET)
    public @ResponseBody Classes getClass(@PathVariable(value="brandnum")long brandnum,@PathVariable(value="divisonnum")long divisonnum,@PathVariable(value="departmentnum")long departmentnum,@PathVariable(value="classnum")long classnum){


        return cs.getClassDesc(brandnum,divisonnum,departmentnum,classnum);

    }





}
