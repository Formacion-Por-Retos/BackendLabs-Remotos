package com.api.back.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Api_Controller {

    @Autowired
    private Api_Test_Repository apiTest_repository;

    @PostMapping("/question/add")
    public String addQuestion(@RequestParam String dato) {
          apiTest_repository.save(new Api_Test(dato));
          return "se agrego informacion";
    }
}
