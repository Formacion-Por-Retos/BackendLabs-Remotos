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

    @Column(name = "status_hardware")
    private Boolean status_hardware;


    public Elementos () {

    }

    public Elementos(int id, String message, Boolean status_hardware) {

        setMessage(message);
        setStatus_hardware(status_hardware);

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

    public Boolean getStatus_hardware() {
        return status_hardware;
    }

    public void setStatus_hardware(Boolean status_hardware) {
        this.status_hardware = status_hardware;
    }
}
