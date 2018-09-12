package com.example.yyyyy.service;

import com.example.yyyyy.entity.Classes;
import com.example.yyyyy.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class classService {

    @Autowired
    ClassRepository cr;

    public void addClass(Classes d)
    {

        cr.save(d);
    }

    public void addClasses(List<Classes> d)
    {
        cr.saveAll(d);
    }


    public List<Classes> getClasses(long brandnum,long divnum,long deptnum) {

        System.out.println("in servive");

        return cr.getClasses(brandnum,divnum,deptnum);
     }


    public Classes getClassDesc(long brandnum, long divisonnum, long departmentnum, long classnum) {

        return cr.getClassDesc(brandnum,divisonnum,departmentnum,classnum);
    }
}
