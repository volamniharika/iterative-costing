package com.example.yyyyy.service;


import com.example.yyyyy.entity.Brand;
import com.example.yyyyy.repository.BrandRepository;
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


    public void updateBrand(long old, long newvalue) {

		br.updateBrand(old,newvalue);
    }
}
