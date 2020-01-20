package com.api.back.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@RestController
public class Api_Controller {

    @Autowired
    private Api_Test_Repository apiTest_repository;

    @PostMapping("/add")
    public String addQuestion(@RequestParam String dato, @RequestParam String dato2) {

        ZoneId zone = ZoneId.of("America/Bogota");
        ZonedDateTime date = ZonedDateTime.now(zone);
        String fecha = date.toString();

        apiTest_repository.save(new Api_Test(dato,dato2,fecha));
          return "Se agrego. -Paul9834";
    }
}
