
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Presentacion;
import java.util.List;


public interface IPresentacionService {
    public List<Presentacion> verPresentacion();
    public void crearPresentacion(Presentacion pres);
    public void borrarPresentacion (Long id);
    public Presentacion buscarPresentacion(Long id);
    public void actualizarPresentacion(Presentacion pres);
    public void updatePresentacion(Long id, Presentacion pres);
}
