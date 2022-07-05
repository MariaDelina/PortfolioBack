
package com.Portfolio.Portfolio.controller;

import com.Portfolio.Portfolio.model.Proyectos;
import com.Portfolio.Portfolio.service.IProyectosService;
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
@RequestMapping(path="/api/proyectos")
public class ProyectosController {
    
     @Autowired
    private IProyectosService proServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proServ.verProyectos();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Proyectos buscarBanner(@PathVariable Long id){
       return proServ.buscarProyectos(id);
    }
         
    @PostMapping("/create")
    public void agregarProyectos(@RequestBody Proyectos pro){
        proServ.crearProyectos(pro);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarProyectos(@PathVariable Long id){
        proServ.borrarProyectos(id);
    }
    @PutMapping("/actualizar")
    public void actualizarProyectos(@RequestBody Proyectos pro){
        proServ.actualizarProyectos(pro);
    }
    @PutMapping("/update/{id}")
    public void updateProyectos(@PathVariable ("id") Long id, @RequestBody Proyectos pro){
       proServ.updateProyectos(id, pro);
    }   
}
