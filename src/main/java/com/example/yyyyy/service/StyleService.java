package com.example.yyyyy.service;

import com.example.yyyyy.entity.Brand;
import com.example.yyyyy.entity.Style;
import com.example.yyyyy.entity.subClass;
import com.example.yyyyy.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleService {

    @Autowired
    StyleRepository sr;
    public void addStyles(List<Style> b) {

        sr.saveAll(b);
    }

    public List<Style> getStyles(long bnum, long dnum, long denum, long cnum, long subclassnum) {

        return sr.getStyles(bnum,dnum,denum,cnum,subclassnum);
    }
}
