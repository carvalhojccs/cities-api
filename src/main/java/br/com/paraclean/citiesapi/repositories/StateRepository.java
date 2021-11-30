package br.com.paraclean.citiesapi.repositories;

import br.com.paraclean.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Long> {
}
