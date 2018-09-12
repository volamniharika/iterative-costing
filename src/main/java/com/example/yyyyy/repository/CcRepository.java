package com.example.yyyyy.repository;

import com.example.yyyyy.entity.CustomerChoice;
import com.example.yyyyy.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface CcRepository extends JpaRepository<CustomerChoice, Long> {


    @Query(value = "select cc.id,cc.cc_desc,cc.cost,cc.style_id from customer_choice cc  inner join style st on st.id=cc.style_id inner join subclass sc on sc.id=st.sub_class_id inner join classes c on c.id=sc.classes_id inner join department dp on dp.id=c.department_id \n" +
            "            inner join divison dv on dp.divison_id=dv.id \n" +
            "            inner join brand brand on brand.id = dv.brand_id\n" +
            "            where dv.id=:dnum and\n" +
            "            brand.id =:bnum and dp.id=:denum and c.id=:cnum and sc.id=:subclassnum and st.id=:stylenum", nativeQuery = true)
    List<CustomerChoice> getCustomerChoices(@Param("bnum") long brandnum, @Param("dnum") long divisonnum, @Param("denum") long deptnum, @Param("cnum") long cnum, @Param("subclassnum") long scnum, @Param("stylenum") long stnum);




    @Modifying

    @Query(value = "update customer_choice set cost=:old where cost=:newcost",nativeQuery = true)
    int updateCc(@Param("old") long old, @Param("newcost") long newvalue);
}
