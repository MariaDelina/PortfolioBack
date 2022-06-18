
package com.Portfolio.Portfolio.service;


import com.Portfolio.Portfolio.model.Banner;
import java.util.List;


public interface IBannerService {
    
    public List<Banner> verBanner();
    public void crearBanner(Banner bane);
    public void borrarBanner (Long id);
    public Banner buscarBanner(Long id);
    public void actualizarBanner(Banner bane);
    public void updateBanner(Long id, Banner bane);
    
}
