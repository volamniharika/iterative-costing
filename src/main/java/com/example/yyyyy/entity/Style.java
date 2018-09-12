package com.example.yyyyy.entity;

import javax.persistence.*;

@Entity
@Table(name = "Style")



public class Style {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq5")
    @SequenceGenerator(name="seq5", initialValue=701, allocationSize=1,sequenceName ="style_sequence" )
    long id;
    @Column(name="styleDesc")
    String styleDesc;

    @Column(name = "actualAuc")
    private float actualAuc;

    @Column(name = "targetAuc")
    private float targetAuc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStyleDesc() {
        return styleDesc;
    }

    public void setStyleDesc(String styleDesc) {
        this.styleDesc = styleDesc;
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

    public subClass getSubclass() {
        return subclass;
    }

    public void setSubclass(subClass subclass) {
        this.subclass = subclass;
    }

    @ManyToOne
    @JoinColumn(name="subClass_id")
    private subClass subclass;

}
