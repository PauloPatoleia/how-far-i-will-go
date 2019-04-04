package org.academiadecodigo.asciimos.hackathlon.controller;

import org.academiadecodigo.asciimos.hackathlon.dto.Assembler;
import org.academiadecodigo.asciimos.hackathlon.dto.CityDto;
import org.academiadecodigo.asciimos.hackathlon.model.City;
import org.academiadecodigo.asciimos.hackathlon.model.Transport;
import org.academiadecodigo.asciimos.hackathlon.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin(value = "*")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("api")
public class RestController {

    private Assembler assembler;
    private CityService cityService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<City>> getCities() {

        List<City> cityList = cityService.getCityList();

        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

    @GetMapping(path = "find")
    public ResponseEntity<CityDto> getByPrice(@RequestParam(value = "budget") Integer budget, @RequestParam(value = "transport") String transport, @RequestParam(value = "twoWay") boolean twoWay) {

        if(twoWay) {
            budget /= 2;
        }

        City city = cityService.getFurthestCity(budget, convertToTransport(transport));
        CityDto cityDto = assembler.convertToCityDto(city, convertToTransport(transport), twoWay);

        return new ResponseEntity<>(cityDto, HttpStatus.OK);
    }

    private Transport convertToTransport(String transport) {

        Transport[] tr = Transport.values();

        for (Transport trans : tr) {
            if (transport.equalsIgnoreCase(trans.toString())) {
                return trans;
            }
        }
        return null;
    }

    @Autowired
    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }

    @Autowired
    public void setAssembler(Assembler assembler) {
        this.assembler = assembler;
    }
}
