package com.example.yyyyy.controllers;

import com.example.yyyyy.entity.Brand;
import com.example.yyyyy.service.brandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class brandController {

	@Autowired
	
	private brandService is;
	
	@RequestMapping(value="/addbrand",method= RequestMethod.POST)
	public @ResponseBody void addBrand(@RequestBody Brand b){

		is.addBrand(b);

	}


	@RequestMapping(value="/addbrands",method= RequestMethod.POST)
	public @ResponseBody void addBrand(@RequestBody List<Brand> b){

		is.addBrands(b);

	}
	@RequestMapping(value="/updatebrand/{old}/{newvalue}",method= RequestMethod.POST)
	public @ResponseBody void updateBrand(@PathVariable("old")long old,@PathVariable("newvalue")long newvalue){


		System.out.println(old+" "+newvalue);
		is.updateBrand(old,newvalue);

	}



	@RequestMapping(value="/brands",method= RequestMethod.GET)
	public @ResponseBody
	List<Brand> getBrand(){

		return is.getBrands();
	}
	@RequestMapping(value="/brand/{num}",method= RequestMethod.GET)
	public @ResponseBody
	Optional<Brand> getBrand(@PathVariable long num){
		return is.getBrand(num);
	}





	
	/*@RequestMapping(method= RequestMethod.POST,value="brand/divison/adddepartments")
	public  @ResponseBody void adddepartments(@RequestBody Department d) {
		
		is.adddepartment(d);
		
	}
	@RequestMapping(value="/brands/{num}/getdepartments",method= RequestMethod.GET)
	public @ResponseBody List<Divison> getdepartments(@PathVariable int num){
		return is.getdepartment(num);

	}*/



}
