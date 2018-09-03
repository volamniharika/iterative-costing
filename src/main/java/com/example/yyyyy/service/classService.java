package com.example.yyyyy.service;

import com.example.yyyyy.Entity.Classes;
import com.example.yyyyy.Entity.Department;
import com.example.yyyyy.Repository.ClassRepository;
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


//    public List<Classes> getClasses(long brandnum,long divnum,long deptnum) {
//
//        return cr.getClasses(brandnum,divnum,deptnum);
//     }

}
