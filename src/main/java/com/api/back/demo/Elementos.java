package com.api.back.demo;

import javax.persistence.*;


@Entity
@Table(name = "Elementos")
public class Elementos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Alcohol")
    private String alcohol;


    public Elementos () {

    }

    public Elementos(int id, String alcohol) {
        setAlcohol(alcohol);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }
}
