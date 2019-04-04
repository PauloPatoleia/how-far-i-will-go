package org.academiadecodigo.asciimos.hackathlon.controller;


import org.academiadecodigo.asciimos.hackathlon.model.ExampleModel;
import org.academiadecodigo.asciimos.hackathlon.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("example/api")
public class ExampleRestController {

    private ExampleService exampleService;



    @GetMapping(path = "/")
    public ResponseEntity<ExampleModel> list() {

        return new ResponseEntity<>(exampleService.get(1), HttpStatus.OK);

    }

    @Autowired
    public void setExampleService(ExampleService exampleService) {
        this.exampleService = exampleService;
    }


}
