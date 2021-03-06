package com.example.yyyyy.repository;

import com.example.yyyyy.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {



    @Query(value = "select * from department d where d.divison_id in(select dv.id from divison dv where dv.brand_id=:brand_id and dv.id=:id)", nativeQuery = true)
    List<Department> findDepartments(@Param("brand_id") long brand_id, @Param("id") long id);

    @Query(value = "select d.id,d.dept_desc,d.actualauc,d.targetauc,d.divison_id from department d " +
            "inner join divison di on di.id=d.divison_id " +
            "inner join brand b on b.id=di.brand_id where di.brand_id=:bnum and di.id=:dnum and d.id=:denum", nativeQuery = true)
    Department findDept(@Param("bnum") long bnum,@Param("dnum") long dnum,@Param("denum") long denum);
}

