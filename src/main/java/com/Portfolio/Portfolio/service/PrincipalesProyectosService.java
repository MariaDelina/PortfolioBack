
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.PrincipalesProyectos;
import com.Portfolio.Portfolio.repository.PrincipalesProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrincipalesProyectosService implements IPrincipalesProyectosService{

   @Autowired
    private PrincipalesProyectosRepository prinproyRepo;

    @Override
    public List<PrincipalesProyectos> verPrincipalesProyectos() {
        return prinproyRepo.findAll();
    }

    @Override
    public PrincipalesProyectos crearPrincipalesProyectos(PrincipalesProyectos prinpro) {
        return prinproyRepo.save(prinpro);
    }

    @Override
    public void borrarPrincipalesProyectos(Long id) {
        prinproyRepo.deleteById(id);
    }

    @Override
    public PrincipalesProyectos buscarPrincipalesProyectos(Long id) {
        return prinproyRepo.findById(id).orElse(null);
    }

  
    
}
