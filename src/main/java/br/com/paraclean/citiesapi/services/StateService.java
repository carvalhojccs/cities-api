package br.com.paraclean.citiesapi.services;

import br.com.paraclean.citiesapi.entities.State;
import br.com.paraclean.citiesapi.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService{
    @Autowired
    StateRepository stateRepository;

    public List<State> findAll(){
        return stateRepository.findAll();
    }
}
