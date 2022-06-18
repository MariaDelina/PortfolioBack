
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Banner;
import com.Portfolio.Portfolio.repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IBannerService{

   @Autowired
    private BannerRepository banRepo;

    @Override
    public List<Banner> verBanner() {
        return banRepo.findAll();
    }

    @Override
    public void crearBanner(Banner ban) {
        banRepo.save(ban);
    }

    @Override
    public void borrarBanner(Long id) {
        banRepo.deleteById(id);
    }

    @Override
    public Banner buscarBanner(Long id) {
        return banRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarBanner(Banner ban) {
        banRepo.save(ban);
    }

    @Override
    public void updateBanner(Long id, Banner ban) {
        banRepo.findById(id);
        banRepo.save(ban);
    }
    
}
