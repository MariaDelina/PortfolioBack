
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion educ);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion(Long id);
    public void actualizarEducacion(Educacion educ);
    public void updateEducacion(Long id, Educacion educ);
}
