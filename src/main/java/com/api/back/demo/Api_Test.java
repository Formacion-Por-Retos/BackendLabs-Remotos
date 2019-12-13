package com.api.back.demo;

import javax.persistence.*;

@Entity
@Table(name = "Frequent_Questions")
public class Api_Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;

    public Api_Test(){
    }

    public Api_Test(String title){
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }
}
