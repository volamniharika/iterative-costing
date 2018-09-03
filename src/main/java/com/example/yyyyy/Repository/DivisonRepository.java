package com.example.yyyyy.Repository;

import com.example.yyyyy.Entity.Brand;
import com.example.yyyyy.Entity.Divison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Collectors;

import static com.sun.tools.doclint.Entity.and;

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
