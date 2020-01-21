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

    @Column(name = "Dato3")
    private String dato3;

    @Column(name = "Dato4")
    private String dato4;


    @Column(name = "Horadecreacion")
    private String creado;


    public Api_Test(){
    }

    public Api_Test(String dato, String dato2, String dato3, String dato4, String creado){

        setTitle(dato);
        setDato2(dato2);
        setDato3(dato3);
        setDato4(dato4);
        setCreado(creado);
    }

    public String getDato3() {
        return dato3;
    }

    public void setDato3(String dato3) {
        this.dato3 = dato3;
    }

    public String getDato4() {
        return dato4;
    }

    public void setDato4(String dato4) {
        this.dato4 = dato4;
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
