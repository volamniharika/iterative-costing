package com.example.yyyyy.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Divison")
@Data
@Getter
@Setter

public class Divison {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq1")
    @SequenceGenerator(name="seq1", initialValue=101, allocationSize=1,sequenceName ="divison_sequence" )
    long id;
    @Column(name="divisonDesc")
    String divisonDesc;
    @Column(name="actualAuc")
    float actualAuc;
    @Column(name="targetAuc")
    float targetAuc;
    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDivisonDesc() {
        return divisonDesc;
    }

    public void setDivisonDesc(String divisonDesc) {
        this.divisonDesc = divisonDesc;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
