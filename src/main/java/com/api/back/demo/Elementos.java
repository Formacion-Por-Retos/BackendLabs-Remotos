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

    @Column (name = "delay")
    private Integer delay;


    public Elementos () {

    }

    public Elementos(int id, String message, Boolean statushardware, Integer delay) {
        setMessage(message);
        setStatushardware(statushardware);
        setDelay(delay);
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

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }
}
