package com.example.yyyyy.Entity;

import javax.persistence.*;

@Entity
@Table(name="subclass")

public class subClass {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq3")
    @SequenceGenerator(name="seq3", initialValue=501, allocationSize=1,sequenceName ="subclass_sequence" )
    long id;

    @Column(name="subClassDesc")
    private String subClassDesc;


    @Column(name="actualAuc")
    private float actualAuc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubClassDesc() {
        return subClassDesc;
    }

    public void setSubClassDesc(String subClassDesc) {
        this.subClassDesc = subClassDesc;
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

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Column(name="targetAuc")
    private float targetAuc;

    @ManyToOne
    @JoinColumn(name="classes_id")
    private Classes classes;


}
