package com.example.yyyyy.Repository;

import com.example.yyyyy.Entity.Brand;
import com.example.yyyyy.Entity.Department;
import com.example.yyyyy.Entity.Divison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {


    @Query(value = "select * from department d where d.id=:id", nativeQuery = true)
    Department findDept(@Param("id") long id);

    @Query(value = "select * from department d where d.divison_id in(select dv.id from divison dv where dv.brand_id=:brand_id and dv.id=:id)", nativeQuery = true)
    List<Department> findDepartments(@Param("brand_id") long brand_id, @Param("id") long id);


}

