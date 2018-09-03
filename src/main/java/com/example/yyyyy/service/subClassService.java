package com.example.yyyyy.service;


import com.example.yyyyy.Entity.Brand;
import com.example.yyyyy.Entity.subClass;
import com.example.yyyyy.Repository.SubClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class subClassService {


    @Autowired
    SubClassRepository sr;

    public void addSubClass(subClass p) {

        sr.save(p);
    }
    public void addSubClasses(List<subClass> d)
    {
        sr.saveAll(d);
    }
    public List<subClass> getClasses() {

        return sr.findAll();

    }
}
