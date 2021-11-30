package br.com.paraclean.citiesapi.controllers;

import br.com.paraclean.citiesapi.entities.Country;
import br.com.paraclean.citiesapi.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public Page<Country> findAll(Pageable pageable){
        return countryService.findAll(pageable);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Country> findById(@PathVariable(value = "id") Long id){
        return countryService.findById(id);
    }
}
