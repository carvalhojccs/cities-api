package br.com.paraclean.citiesapi.services;

import br.com.paraclean.citiesapi.entities.Country;
import br.com.paraclean.citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService{

    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> findAll(Pageable pageable){
        return  countryRepository.findAll(pageable);
    }

    public ResponseEntity<Country> findById(Long id){
        Optional<Country> optional = countryRepository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }


    }


}
