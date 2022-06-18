
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    public void crearExperiencia(Experiencia expe);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia(Long id);
    public void actualizarExperiencia(Experiencia expe);
    public void updateExperiencia(Long id, Experiencia expe);
}
