package com.example.yyyyy.service;


import com.example.yyyyy.entity.subClass;
import com.example.yyyyy.repository.SubClassRepository;
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
    public List<subClass> getSubClasses(long bnum,long dnum,long denum,long cnum)
    {
        return sr.getSubClasses(bnum,dnum,denum,cnum);
    }

    public subClass getSubClassDesc(long bnum, long dnum, long denum, long cnum, long subclassnum) {
        return sr.getSubClassDesc(bnum,dnum,denum,cnum,subclassnum);
    }
}
