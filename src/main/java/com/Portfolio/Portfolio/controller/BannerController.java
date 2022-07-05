
package com.Portfolio.Portfolio.controller;


import com.Portfolio.Portfolio.model.Banner;
import com.Portfolio.Portfolio.service.IBannerService;
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
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH})
@RequestMapping(path="/api/banner")
public class BannerController {
    
    @Autowired
    private IBannerService baneServ;
       
    @GetMapping("/lista")
    @ResponseBody
    public List<Banner> verBanner(){
        return baneServ.verBanner();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Banner buscarBanner(@PathVariable Long id){
       return baneServ.buscarBanner(id);
    }
         
    @PostMapping("/create")
    public void agregarBanner(@RequestBody Banner bane){
        baneServ.crearBanner(bane);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarBanner(@PathVariable Long id){
        baneServ.borrarBanner(id);
    }
    @PutMapping("/actualizar")
    public void actualizarBanner(@RequestBody Banner bane){
        baneServ.actualizarBanner(bane);
    }
    
    @PutMapping("/update/{id}")
    public void updateBanner(@PathVariable Long id, @RequestBody Banner bane){
       baneServ.updateBanner(id, bane);
    }   
}
