
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.PrincipalesProyectos;
import java.util.List;


public interface IPrincipalesProyectosService {
    
    public List<PrincipalesProyectos> verPrincipalesProyectos();
    public void crearPrincipalesProyectos(PrincipalesProyectos prinpro);
    public void borrarPrincipalesProyectos (Long id);
    public PrincipalesProyectos buscarPrincipalesProyectos(Long id);
    public void actualizarPrincipalesProyectos(PrincipalesProyectos prinpro);
    public void updatePrincipalesProyectos(Long id, PrincipalesProyectos prinpro);
}
