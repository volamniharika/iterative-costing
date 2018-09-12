package com.example.yyyyy.entity;

import javax.persistence.*;

@Entity
@Table(name="Department")

public class Department {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq2")
    @SequenceGenerator(name="seq2", initialValue=201, allocationSize=1,sequenceName ="department_sequence" )

    @Column(name="id")
    long id;
    @Column(name="deptDesc")
    String deptDesc;
    @Column(name="targetAUC")
    float targetAuc;
    @Column(name="actualAUC")
    float actualAuc;
    @ManyToOne
    @JoinColumn(name="divison_id")
    Divison divison;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }


    public Divison getDivison() {
        return divison;
    }

    public float getTargetAuc() {
        return targetAuc;
    }

    public void setTargetAuc(float targetAuc) {
        this.targetAuc = targetAuc;
    }

    public float getActualAuc() {
        return actualAuc;
    }

    public void setActualAuc(float actualAuc) {
        this.actualAuc = actualAuc;
    }

    public void setDivison(Divison divison) {
        this.divison = divison;
    }



}
