
package com.Portfolio.Portfolio.controller;


import com.Portfolio.Portfolio.model.Educacion;
import com.Portfolio.Portfolio.service.IEducacionService;
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
@RequestMapping(path="/api/educacion")
public class EducacionController {
    
     @Autowired
    private IEducacionService educServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educServ.verEducacion();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id){
       return educServ.buscarEducacion(id);
    }
         
    @PostMapping("/create")
    public void agregarEducacion(@RequestBody Educacion educ){
        educServ.crearEducacion(educ);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    @PutMapping("/actualizar")
    public void actualizarEducacion(@RequestBody Educacion educ){
        educServ.actualizarEducacion(educ);
    }
    @PutMapping("/update/{id}")
    public void updateEducacion(@PathVariable ("id") Long id, @RequestBody Educacion educ){
       educServ.updateEducacion(id, educ);
    }   
}
