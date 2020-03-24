package com.api.back.demo;
import javax.persistence.*;


@Entity
@Table(name = "Datos")
public class Estados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Dato1")
    private Boolean dato1;

    @Column(name = "Dato2")
    private Boolean dato2;

    @Column(name = "Dato3")
    private Boolean dato3;


    public Estados(){
    }

    public Estados(Boolean dato, Boolean dato2, Boolean dato3){
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

    public Boolean getDato1() {
        return dato1;
    }

    public void setDato1(Boolean dato1) {
        this.dato1 = dato1;
    }

    public Boolean getDato2() {
        return dato2;
    }

    public void setDato2(Boolean dato2) {
        this.dato2 = dato2;
    }

    public Boolean getDato3() {
        return dato3;
    }

    public void setDato3(Boolean dato3) {
        this.dato3 = dato3;
    }
}
