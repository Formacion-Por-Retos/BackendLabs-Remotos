package com.api.back.demo;

import javax.persistence.*;


@Entity
@Table(name = "Elementos")
public class Elementos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "message")
    private String message;

    @Column(name = "statushardware")
    private Boolean statushardware;


    public Elementos () {

    }

    public Elementos(int id, String message, Boolean statushardware) {

        setMessage(message);
        setStatushardware(statushardware);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatushardware() {
        return statushardware;
    }

    public void setStatushardware(Boolean statushardware) {
        this.statushardware = statushardware;
    }
}
