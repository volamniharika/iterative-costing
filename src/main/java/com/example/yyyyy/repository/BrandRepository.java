package com.example.yyyyy.repository;

import com.example.yyyyy.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;




public interface BrandRepository extends JpaRepository<Brand,Long> {


    @Transactional
    @Modifying
    @Query(value="update brand set target_auc=:target where target_auc=:prev\n",nativeQuery = true)
	int updateBrand(@Param("target")long target,@Param("prev")long prevtarget);
	
}
