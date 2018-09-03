package com.example.yyyyy.controllers;

import com.example.yyyyy.Entity.Classes;
import com.example.yyyyy.Entity.subClass;
import com.example.yyyyy.Repository.SubClassRepository;
import com.example.yyyyy.service.subClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
