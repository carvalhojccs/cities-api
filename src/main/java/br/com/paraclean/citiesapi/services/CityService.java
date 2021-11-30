package br.com.paraclean.citiesapi.services;

import br.com.paraclean.citiesapi.entities.City;
import br.com.paraclean.citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public Page<City> findAll(Pageable pageable){
        return cityRepository.findAll(pageable);
    }

}
