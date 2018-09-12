package com.example.yyyyy.controllers;


import com.example.yyyyy.entity.CustomerChoice;
import com.example.yyyyy.entity.Style;
import com.example.yyyyy.service.CcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CcController {

    @Autowired
    CcService cc;
    @RequestMapping(value="/addcustomerchoice",method= RequestMethod.POST)
    public @ResponseBody
    void addCustomerChoice(@RequestBody List<CustomerChoice> b){

        cc.addCustomerChoice(b);

    }
    @RequestMapping(value="/brand/{brandnum}/divison/{divisonnum}/department/{departmentnum}/class/{classnum}/subclass/{subclassnum}/style/{stylenum}/customerchoices",method= RequestMethod.GET)
    public @ResponseBody
    List<CustomerChoice> getCustomerChoices(@PathVariable(value="brandnum")long bnum, @PathVariable(value="divisonnum")long dnum, @PathVariable(value="departmentnum")long denum, @PathVariable(value="classnum") long cnum, @PathVariable(value="subclassnum")long subclassnum,@PathVariable(value="stylenum")long stylenum){

        return cc.getCustomerChoices(bnum,dnum,denum,cnum,subclassnum,stylenum);

    }
    @RequestMapping(value="/updatecc/{old}/{newvalue}",method= RequestMethod.POST)
    public @ResponseBody void updateCc(@PathVariable("old")long old,@PathVariable("newvalue")long newvalue){


        System.out.println(old+" "+newvalue);
        System.out.println("in controller");
        cc.updateCc(old,newvalue);

    }


}
