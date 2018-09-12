package com.example.yyyyy.repository;

import com.example.yyyyy.entity.subClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubClassRepository extends JpaRepository<subClass,Long> {

    @Query(value="select sc.id,sc.actual_auc,sc.target_auc,sc.sub_class_desc,sc.classes_id from subclass sc inner join classes c on c.id=sc.classes_id inner join department dp on dp.id=c.department_id  \n" +
            "inner join divison dv on dp.divison_id=dv.id \n" +
            "inner join brand brand on brand.id = dv.brand_id\n" +
            "where dv.id=:divisonnum and\n" +
            "\tbrand.id =:brandnum and dp.id=:deptnum and c.id=:cnum",nativeQuery = true)
    public List<subClass> getSubClasses(@Param("brandnum")long brandnum, @Param("divisonnum")long divisonnum, @Param("deptnum") long deptnum,@Param("cnum")long cnum);

    @Query(value="select sc.id,sc.actual_auc,sc.target_auc,sc.sub_class_desc,sc.classes_id from subclass sc inner join classes c on c.id=sc.classes_id inner join department dp on dp.id=c.department_id  \n" +
            "inner join divison dv on dp.divison_id=dv.id \n" +
            "inner join brand brand on brand.id = dv.brand_id\n" +
            "where dv.id=:divisonnum and\n" +
            "\tbrand.id =:brandnum and dp.id=:deptnum and c.id=:cnum and sc.id=:subclassnum",nativeQuery = true)
    subClass getSubClassDesc(@Param("brandnum")long brandnum, @Param("divisonnum")long divisonnum, @Param("deptnum") long deptnum,@Param("cnum")long cnum,@Param("subclassnum")long subclassnum);

}
