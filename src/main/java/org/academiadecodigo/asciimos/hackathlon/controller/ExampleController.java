package org.academiadecodigo.asciimos.hackathlon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @CrossOrigin("http://localhost:5500")
    @RequestMapping(method = RequestMethod.GET)
    public String index() {

        return "index";
    }



}
