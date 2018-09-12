package com.example.yyyyy.repository;

import com.example.yyyyy.entity.Style;
import com.example.yyyyy.entity.subClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StyleRepository  extends JpaRepository<Style,Long> {




    @Query(value="select st.id,st.actual_auc,st.target_auc,st.style_desc,st.sub_class_id from style st inner join subclass sc on sc.id=st.sub_class_id inner join classes c on c.id=sc.classes_id inner join department dp on dp.id=c.department_id  \n" +
            "inner join divison dv on dp.divison_id=dv.id \n" +
            "inner join brand brand on brand.id = dv.brand_id\n" +
            "where dv.id=:divisonnum and\n" +
            "brand.id =:brandnum and dp.id=:deptnum and c.id=:cnum and sc.id=:scnum",nativeQuery = true)
    public List<Style> getStyles(@Param("brandnum")long brandnum, @Param("divisonnum")long divisonnum, @Param("deptnum") long deptnum, @Param("cnum")long cnum,@Param("scnum")long scnum);



}
