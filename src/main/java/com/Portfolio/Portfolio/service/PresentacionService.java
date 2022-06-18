
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Presentacion;
import com.Portfolio.Portfolio.repository.PresentacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentacionService implements IPresentacionService{
    
    @Autowired
    private PresentacionRepository presRepo;

    @Override
    public List<Presentacion> verPresentacion() {
        return presRepo.findAll();
    }

    @Override
    public void crearPresentacion(Presentacion pre) {
        presRepo.save(pre);
    }

    @Override
    public void borrarPresentacion(Long id) {
        presRepo.deleteById(id);
    }

    @Override
    public Presentacion buscarPresentacion(Long id) {
        return presRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarPresentacion(Presentacion pre) {
        presRepo.save(pre);
    }

    @Override
    public void updatePresentacion(Long id, Presentacion pres) {
        presRepo.findById(id);
        presRepo.save(pres);
    }
}
