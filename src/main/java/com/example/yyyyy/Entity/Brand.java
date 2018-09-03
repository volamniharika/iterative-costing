package com.example.yyyyy.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Brand")
@Data
@Getter
@Setter
public class Brand {



    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
    long id;

    @Column(name="brandDesc")
   private String brandDesc;


    @Column(name="actualAuc")
    private float actualAuc;

    @Column(name="targetAuc")
    private float targetAuc;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public float getActualAuc() {
        return actualAuc;
    }

    public void setActualAuc(float actualAuc) {
        this.actualAuc = actualAuc;
    }

    public float getTargetAuc() {
        return targetAuc;
    }

    public void setTargetAuc(float targetAuc) {
        this.targetAuc = targetAuc;
    }



}
