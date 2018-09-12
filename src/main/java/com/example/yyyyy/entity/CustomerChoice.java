package com.example.yyyyy.entity;

import javax.persistence.*;

@Table(name="CustomerChoice")
@Entity

public class CustomerChoice {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq6")
    @SequenceGenerator(name="seq6", initialValue=801, allocationSize=1,sequenceName ="cc_sequence" )
    long id;
    @Column(name="CcDesc")
    String CcDesc;
    @Column(name="cost")
    long cost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCcDesc() {
        return CcDesc;
    }

    public void setCcDesc(String ccDesc) {
        CcDesc = ccDesc;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @ManyToOne
    @JoinColumn(name="style_id")
    Style style;
}
