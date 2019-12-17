package com.api.back.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class Api_Controller {

    @Autowired
    private Api_Test_Repository apiTest_repository;

    @PostMapping("/add")
    public String addQuestion(@RequestParam String dato) {

        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        apiTest_repository.save(new Api_Test(dato,ts.toString()));
          return "Se agrego información";
    }
}
