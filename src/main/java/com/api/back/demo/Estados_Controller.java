package com.api.back.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Estados_Controller {

    @Autowired
    private Estados_Repository apiTest_repository;



    @PostMapping("/add")
    public String addQuestion(@RequestParam Boolean dato1, @RequestParam Boolean dato2, @RequestParam Boolean dato3) {

        apiTest_repository.save(new Estados(dato1,dato2,dato3));

          return "Se agrego. -Paul9834";

    }

    @PostMapping("/state")
    public String modificarStatus(@RequestParam Boolean dato1, @RequestParam Boolean dato2, @RequestParam Boolean dato3) {
        Estados test = apiTest_repository.findById(1);
        test.setDato1(dato1);
        test.setDato2(dato2);
        test.setDato3(dato3);
        apiTest_repository.save(test);
        return "Se actualizo el estado";
    }

    @GetMapping ("/get")
    public Estados getFriendsPublication () {
        return apiTest_repository.findById(1);
    }
}

