
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    public void crearProyectos(Proyectos pro);
    public void borrarProyectos (Long id);
    public Proyectos buscarProyectos(Long id);
    public void actualizarProyectos(Proyectos pro);
    public void updateProyectos(Long id, Proyectos pro);
}
