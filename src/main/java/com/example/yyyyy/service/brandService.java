package com.example.yyyyy.service;


import com.example.yyyyy.Entity.Brand;
import com.example.yyyyy.Entity.Divison;
import com.example.yyyyy.Repository.BrandRepository;
import com.example.yyyyy.Repository.DivisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class brandService {

	@Autowired
	private BrandRepository br;


	public void addBrand(Brand p) {

		br.save(p);
	}
	public void addBrands(List<Brand> d)
	{
		br.saveAll(d);
	}
	public List<Brand> getBrands() {

		return br.findAll();

	}
	public Optional<Brand> getBrand(long num) {

		return br.findById(num);

	}







}
