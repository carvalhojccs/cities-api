package br.com.paraclean.citiesapi.controllers;

import br.com.paraclean.citiesapi.entities.State;
import br.com.paraclean.citiesapi.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping
    public List<State> findAll(){
        return stateService.findAll();
    }

}
