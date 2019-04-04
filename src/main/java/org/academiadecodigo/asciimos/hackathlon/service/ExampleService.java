package org.academiadecodigo.asciimos.hackathlon.service;

import org.academiadecodigo.asciimos.hackathlon.model.ExampleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class ExampleService {

    private ArrayList<ExampleModel> exampleList = new ArrayList<>();

    public ExampleService() {
        exampleList.add(new ExampleModel("julio", 3));
        exampleList.add(new ExampleModel("julio", 2));
        exampleList.add(new ExampleModel("julio", 1));
    }

    public ExampleModel get(Integer id) {
        return exampleList.get(id);
    }
}
