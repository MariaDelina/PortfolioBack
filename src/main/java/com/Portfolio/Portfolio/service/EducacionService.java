
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Educacion;
import com.Portfolio.Portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
     @Autowired
    private EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void updateEducacion(Long id, Educacion edu) {
        eduRepo.findById(id);
        eduRepo.save(edu);
    }
}
