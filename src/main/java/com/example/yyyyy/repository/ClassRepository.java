package com.example.yyyyy.repository;


import com.example.yyyyy.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassRepository extends JpaRepository<Classes,Long> {


   @Query(value="select c.id,c.actual_auc,c.target_auc,c.class_desc,c.department_id from classes c inner join department dp on dp.id=c.department_id  \n" +
           "inner join divison dv on dp.divison_id=dv.id \n" +
           "inner join brand brand on brand.id = dv.brand_id\n" +
           "where dv.id=:divisonnum and\n" +
           "\tbrand.id = :brandnum and dp.id=:deptnum\n",nativeQuery = true)
    public List<Classes> getClasses(@Param("brandnum")long brandnum,@Param("divisonnum")long divisonnum,@Param("deptnum") long deptnum);
    @Query(value="select c.id,c.actual_auc,c.target_auc,c.class_desc,c.department_id from classes c inner join department dp on dp.id=c.department_id  \n" +
            "inner join divison dv on dp.divison_id=dv.id \n" +
            "inner join brand brand on brand.id = dv.brand_id\n" +
            "where dv.id=:divisonnum and\n" +
            "\tbrand.id = :brandnum and dp.id=:deptnum and c.id=:classnum\n",nativeQuery = true)
   public Classes getClassDesc(@Param("brandnum")long brandnum,@Param("divisonnum")long divisonnum,@Param("deptnum") long deptnum,@Param("classnum")long classnum);
}
