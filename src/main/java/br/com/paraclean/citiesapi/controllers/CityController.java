package br.com.paraclean.citiesapi.controllers;

import br.com.paraclean.citiesapi.entities.City;
import br.com.paraclean.citiesapi.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public Page<City> findAll(Pageable pageable){
        return cityService.findAll(pageable);
    }
}
