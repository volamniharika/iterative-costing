package com.example.yyyyy.controllers;

import com.example.yyyyy.entity.Divison;
import com.example.yyyyy.service.divisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class divisonController {


    @Autowired
    divisonService ds;

    @RequestMapping(value="/adddivison",method= RequestMethod.POST)
    public @ResponseBody
    void addBrand(@RequestBody Divison b){

        ds.addDivison(b);

    }
    @RequestMapping(value="/adddivisons",method= RequestMethod.POST)
    public @ResponseBody void addDivisons(@RequestBody List<Divison> b){

        ds.addDivisons(b);

    }
    @RequestMapping(value="/brand/{brandnum}/divisons",method= RequestMethod.GET)
    public @ResponseBody List<Divison> getDivisons(@PathVariable long brandnum){

        return ds.getDivisons(brandnum);

    }




}
