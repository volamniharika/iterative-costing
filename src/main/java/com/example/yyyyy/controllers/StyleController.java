package com.example.yyyyy.controllers;

import com.example.yyyyy.entity.Brand;
import com.example.yyyyy.entity.Style;
import com.example.yyyyy.entity.subClass;
import com.example.yyyyy.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class StyleController {


    @Autowired
    StyleService ss;

    @RequestMapping(value="/addstyles",method= RequestMethod.POST)
    public @ResponseBody
    void addBrand(@RequestBody List<Style> b){

        ss.addStyles(b);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{departmentnum}/class/{classnum}/subclass/{subclassnum}/styles",method= RequestMethod.GET)
    public @ResponseBody
    List<Style> getStyles(@PathVariable(value="brandnum")long bnum, @PathVariable(value="divisonnum")long dnum, @PathVariable(value="departmentnum")long denum, @PathVariable(value="classnum") long cnum, @PathVariable(value="subclassnum")long subclassnum){

        return ss.getStyles(bnum,dnum,denum,cnum,subclassnum);

    }
}
