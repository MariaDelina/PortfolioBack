
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Experiencia;
import com.Portfolio.Portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void updateExperiencia(Long id, Experiencia exp) {
        expRepo.findById(id);
        expRepo.save(exp);
    }
    
}
