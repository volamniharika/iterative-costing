package com.example.yyyyy.repository;

import com.example.yyyyy.entity.Divison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DivisonRepository extends JpaRepository<Divison,Long> {

//
//    default List<Divison> findByBrand(long id){
//         //findAll().stream().filter(d -> d.getBrand().getId() == id).collect(Collectors.toList());
//
//    }

    @Query(value="select * from divison d where brand_id=:brand_id",nativeQuery = true)
    List<Divison> getDivisons(@Param("brand_id")long id);


    @Query(value="select * from divison where id=:id and brand_id=:brand_id",nativeQuery = true)
    List<Divison> getDivisonAndBrand(@Param("id")long id,@Param("brand_id")long brand_id);

}
