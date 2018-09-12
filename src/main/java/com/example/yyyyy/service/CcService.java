package com.example.yyyyy.service;


import com.example.yyyyy.entity.CustomerChoice;
import com.example.yyyyy.entity.Style;
import com.example.yyyyy.repository.CcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service

public class CcService {

    @Autowired
    CcRepository cr;

    public void addCustomerChoice(List<CustomerChoice> b) {

        cr.saveAll(b);
    }


    public List<CustomerChoice> getCustomerChoices(long bnum, long dnum, long denum, long cnum, long subclassnum,long stylenum) {
        return cr.getCustomerChoices(bnum,dnum,denum,cnum,subclassnum,stylenum);
    }




        public void updateCc(long old, long newvalue) {
            System.out.println("in service");
            cr.updateCc(old,newvalue);
    }


}
