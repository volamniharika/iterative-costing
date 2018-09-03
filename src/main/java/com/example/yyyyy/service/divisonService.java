package com.example.yyyyy.service;

import com.example.yyyyy.Entity.Divison;
import com.example.yyyyy.Repository.DivisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class divisonService {

    @Autowired
    private DivisonRepository dr;

    public void addDivison(Divison d)
    {

        dr.save(d);
    }

    public void addDivisons(List<Divison> d)
    {

        dr.saveAll(d);
    }
    public List<Divison> getDivisons(long brandnum)
    {

        return dr.getDivisons(brandnum);
    }
    public Optional<Divison> getDivison(long divisonnum)
    {

        return dr.findById(divisonnum);
    }
    public List<Divison> getBrandAndDivison(long divid,long brandid)
    {
        return dr.getDivisonAndBrand(divid,brandid);
    }



}
