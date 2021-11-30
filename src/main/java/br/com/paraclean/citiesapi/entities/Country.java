package br.com.paraclean.citiesapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Country {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    private Integer bacen;

    //construtor padrão
    public Country() {
    }

    //construtor com argumentos
    public Country(Long id, String name, String portugueseName, Integer bacen) {
        this.id = id;
        this.name = name;
        this.portugueseName = portugueseName;
        this.bacen = bacen;
    }

    //getters / setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public void setPortugueseName(String portugueseName) {
        this.portugueseName = portugueseName;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }
}
