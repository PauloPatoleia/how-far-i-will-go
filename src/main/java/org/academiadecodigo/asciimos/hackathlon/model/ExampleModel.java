package org.academiadecodigo.asciimos.hackathlon.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ExampleModel {

    @NotNull
    @NotBlank
    @Size(min = 2)
    private String name;

    @NotNull
    private int id;

    public ExampleModel(@NotNull @NotBlank @Size(min = 2) String name, @NotNull int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
