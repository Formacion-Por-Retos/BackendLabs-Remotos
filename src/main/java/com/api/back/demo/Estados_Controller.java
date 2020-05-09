package com.api.back.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Estados_Controller {

    @Autowired
    private Estados_Repository apiTest_repository;

    @Autowired
    private Elementos_Repository elementos_repository;

    @PostMapping("/add")
    public String addQuestion(@RequestParam boolean dato1, @RequestParam boolean dato2, @RequestParam boolean dato3) {
        apiTest_repository.save(new Estados(dato1,dato2,dato3));
          return "Se agrego. -Paul9834";
    }

    @PostMapping("/state")
    public String modificarStatus(@RequestParam boolean dato1, @RequestParam boolean dato2, @RequestParam boolean dato3) {
        Estados test = apiTest_repository.findById(1);
        test.setDato1(dato1);
        test.setDato2(dato2);
        test.setDato3(dato3);
        apiTest_repository.save(test);
        return "Se actualizo el estado";
    }

    @PostMapping("/boton1")
    public String Boton1(@RequestParam boolean dato1) {
        Estados test = apiTest_repository.findById(1);
        test.setDato1(dato1);
        apiTest_repository.save(test);
        return "Se actualizo el estado del bombillo #1";
    }

    @PostMapping("/boton2")
    public String Boton2(@RequestParam boolean dato2) {
        Estados test = apiTest_repository.findById(1);
        test.setDato2(dato2);
        apiTest_repository.save(test);
        return "Se actualizo el estado del bombillo #2";
    }

    @PostMapping("/boton3")
    public String Boton3(@RequestParam boolean dato3) {
        Estados test = apiTest_repository.findById(1);
        test.setDato3(dato3);
        apiTest_repository.save(test);
        return "Se actualizo el estado del bombillo #3";
    }


    @GetMapping ("/get")
    public Estados getFriendsPublication () {
        return apiTest_repository.findById(1);
    }

    @PostMapping("/addElemento")
    public String addElement(@RequestParam String message) {

        Elementos test = elementos_repository.findById(1);
        test.setMessage(message);
        elementos_repository.save(test);
        return "Se actualizo el mensaje";


    }

    @PostMapping("/updatehardware")
    public String  updateHardware(@RequestParam Boolean statushardware) {
        Elementos test = elementos_repository.findById(1);
      if (test != null) {
          test.setStatushardware(statushardware);
          elementos_repository.save(test);
          return  "Se actualizo el estado del hardware a " + test.getStatushardware();
      }
      else {
          return false + "Error";
      }
    }


    @PostMapping("/delay")
    public String  updateDelay(@RequestParam Integer delay) {
        Elementos test = elementos_repository.findById(1);
        if (test != null) {
            test.setDelay(delay);
            elementos_repository.save(test);
            return  "Se actualizo el delay del hardware a " + test.getDelay();
        }
        else {
            return false + "Error";
        }
    }



    @GetMapping ("/getString")
    public Elementos getElementosPublication () {
        return elementos_repository.findById(1);
    }


    
    @GetMapping ("/test")
    public Boolean test () {

        Elementos test = elementos_repository.findById(1);

        if (test == null) {
            return false;
        }
        else {
            return true;
        }
    }
}

