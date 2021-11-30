package br.com.paraclean.citiesapi.repositories;

import br.com.paraclean.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
