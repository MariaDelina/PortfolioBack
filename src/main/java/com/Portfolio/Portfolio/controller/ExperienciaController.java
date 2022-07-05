
package com.Portfolio.Portfolio.controller;

import com.Portfolio.Portfolio.model.Experiencia;
import com.Portfolio.Portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT, RequestMethod.PATCH})
@RequestMapping(path="/api/experiencia")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expeServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expeServ.verExperiencia();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id){
       return expeServ.buscarExperiencia(id);
    }
         
    @PostMapping("/create")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expeServ.crearExperiencia(exp);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expeServ.borrarExperiencia(id);
    }
    @PutMapping("/actualizar")
    public void actualizarExperiencia(@RequestBody Experiencia exp){
        expeServ.actualizarExperiencia(exp);
    }
    @PutMapping("/update/{id}")
    public void updateExperiencia(@PathVariable ("id") Long id, @RequestBody Experiencia exp){
       expeServ.updateExperiencia(id, exp);
    }      
}

