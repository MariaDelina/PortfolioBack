package com.Portfolio.Portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "principales_proyectos")
public class PrincipalesProyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "url_primer_proyecto_principal")
    private String url_primer_proyecto_principal;
    @Column(name = "url_segundo_proyecto_principal")
    private String url_segundo_proyecto_principal;

    public PrincipalesProyectos() {

    }

    public PrincipalesProyectos(String url_primer_proyecto_principal, String url_segundo_proyecto_principal) {
        this.url_primer_proyecto_principal = url_primer_proyecto_principal;
        this.url_segundo_proyecto_principal = url_segundo_proyecto_principal;
    }
}
