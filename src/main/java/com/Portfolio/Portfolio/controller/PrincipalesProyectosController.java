
package com.Portfolio.Portfolio.controller;


import com.Portfolio.Portfolio.model.PrincipalesProyectos;
import com.Portfolio.Portfolio.service.IPrincipalesProyectosService;
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
@RequestMapping(path="/api/principales_proyectos")
public class PrincipalesProyectosController {
     @Autowired
    private IPrincipalesProyectosService prinproServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<PrincipalesProyectos> verPrincipalesProyectos(){
        return prinproServ.verPrincipalesProyectos();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public PrincipalesProyectos buscarPrincipalesProyectos(@PathVariable Long id){
       return prinproServ.buscarPrincipalesProyectos(id);
    }
         
    @PostMapping("/create")
    public void agregarPrincipalesProyectos(@RequestBody PrincipalesProyectos prinpro){
        prinproServ.crearPrincipalesProyectos(prinpro);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPrincipalesProyectos(@PathVariable Long id){
        prinproServ.borrarPrincipalesProyectos(id);
    }
    @PutMapping("/actualizar")
    public void actualizarPrincipalesProyectos(@RequestBody PrincipalesProyectos prinpro){
        prinproServ.actualizarPrincipalesProyectos(prinpro);
    }
    @PutMapping("/update/{id}")
    public void updatePrincipalesProyectos(@PathVariable ("id") Long id, @RequestBody PrincipalesProyectos prinpro){
       prinproServ.updatePrincipalesProyectos(id, prinpro);
    }  
}
