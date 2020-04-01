package com.api.back.demo;
import javax.persistence.*;


@Entity
@Table(name = "Datos")
public class Estados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Dato1")
    private boolean dato1;

    @Column(name = "Dato2")
    private boolean dato2;

    @Column(name = "Dato3")
    private boolean dato3;


    public Estados(){
    }

    public Estados(boolean dato, boolean dato2, boolean dato3){
        setDato1(dato1);
        setDato2(dato1);
        setDato3(dato1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDato1() {
        return dato1;
    }

    public void setDato1(boolean dato1) {
        this.dato1 = dato1;
    }

    public boolean isDato2() {
        return dato2;
    }

    public void setDato2(boolean dato2) {
        this.dato2 = dato2;
    }

    public boolean isDato3() {
        return dato3;
    }

    public void setDato3(boolean dato3) {
        this.dato3 = dato3;
    }
}
