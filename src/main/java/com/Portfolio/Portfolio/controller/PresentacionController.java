
package com.Portfolio.Portfolio.controller;


import com.Portfolio.Portfolio.model.Presentacion;
import com.Portfolio.Portfolio.service.IPresentacionService;
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
@RequestMapping(path="/api/presentacion")
public class PresentacionController {
    @Autowired
    private IPresentacionService expeServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<Presentacion> verPresentacion(){
        return expeServ.verPresentacion();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Presentacion buscarPresentacion(@PathVariable Long id){
       return expeServ.buscarPresentacion(id);
    }
         
    @PostMapping("/create")
    public void agregarPresentacion(@RequestBody Presentacion pre){
        expeServ.crearPresentacion(pre);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPresentacion(@PathVariable Long id){
        expeServ.borrarPresentacion(id);
    }
    @PutMapping("/actualizar")
    public void actualizarPresentacion(@RequestBody Presentacion pre){
        expeServ.actualizarPresentacion(pre);
    }
    @PutMapping("/update/{id}")
    public void updatePresentacion(@PathVariable ("id") Long id, @RequestBody Presentacion pres){
       expeServ.updatePresentacion(id, pres);
    }      
}
