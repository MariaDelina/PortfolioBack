package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.PrincipalesProyectos;
import java.util.List;

public interface IPrincipalesProyectosService {

    public List<PrincipalesProyectos> verPrincipalesProyectos();

    public PrincipalesProyectos crearPrincipalesProyectos(PrincipalesProyectos prinpro);

    public void borrarPrincipalesProyectos(Long id);

    public PrincipalesProyectos buscarPrincipalesProyectos(Long id);
}
