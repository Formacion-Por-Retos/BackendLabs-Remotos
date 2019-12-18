package com.api.back.demo;
import javax.persistence.*;


@Entity
@Table(name = "Datos")
public class Api_Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Dato")
    private String dato;


    @Column(name = "Dato2")
    private String dato2;


    @Column(name = "Horadecreacion")
    private String creado;


    public Api_Test(){
    }

    public Api_Test(String dato, String dato2 , String creado){

        setTitle(dato);
        setDato2(dato2);
        setCreado(creado);

    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public String getCreado() {
        return creado;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }

    public String getDato() {
        return dato;
    }

    private void setTitle(String dato) {
        this.dato = dato;
    }
}
