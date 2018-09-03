package com.example.yyyyy.Entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Classes")

public class Classes {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq3")
    @SequenceGenerator(name="seq3", initialValue=301, allocationSize=1,sequenceName ="class_sequence" )
    long id;
    @Column(name="classDesc")
    private String classDesc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column(name="actualAuc")
    private float actualAuc;

    @Column(name="targetAuc")
    private float targetAuc;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;



}
