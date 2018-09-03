package com.example.yyyyy.Repository;


import com.example.yyyyy.Entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRepository extends JpaRepository<Classes,Long> {


    //public List<Classes> getClasses(long brandnum,long divisonnum,long deptnum);
}
