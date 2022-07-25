package com.Portfolio.Portfolio.controller;

import com.Portfolio.Portfolio.model.PrincipalesProyectos;
import com.Portfolio.Portfolio.repository.PrincipalesProyectosRepository;
import com.Portfolio.Portfolio.service.IPrincipalesProyectosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH})
@RequestMapping(path = "/api/principales_proyectos")
public class PrincipalesProyectosController {

    @Autowired
    private IPrincipalesProyectosService prinproServ;

    @Autowired
    private PrincipalesProyectosRepository prinproyRepo;

    @GetMapping("/lista")
    @ResponseBody
    public List<PrincipalesProyectos> verPrincipalesProyectos() {
        return prinproServ.verPrincipalesProyectos();
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public PrincipalesProyectos buscarPrincipalesProyectos(@PathVariable Long id) {
        return prinproServ.buscarPrincipalesProyectos(id);
    }

    @PostMapping("/create")
    public void agregarPrincipalesProyectos(@RequestBody PrincipalesProyectos prinpro) {
        prinproServ.crearPrincipalesProyectos(prinpro);
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPrincipalesProyectos(@PathVariable Long id) {
        prinproServ.borrarPrincipalesProyectos(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PrincipalesProyectos> updatePrincipalesProyectos(@PathVariable("id") Long id, @RequestBody PrincipalesProyectos principalesProyectos) {
        Optional<PrincipalesProyectos> principalesProyectosData = prinproyRepo.findById(id);
        if (principalesProyectosData.isPresent()) {
            PrincipalesProyectos _principalesProyectos = principalesProyectosData.get();
            _principalesProyectos.setUrl_primer_proyecto_principal(principalesProyectos.getUrl_primer_proyecto_principal());
            _principalesProyectos.setUrl_segundo_proyecto_principal(principalesProyectos.getUrl_segundo_proyecto_principal());
            return new ResponseEntity<>(prinproServ.crearPrincipalesProyectos(_principalesProyectos), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
