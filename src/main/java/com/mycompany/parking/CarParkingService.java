package com.mycompany.parking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public class CarParkingService {
  @Autowired
  private CarParkingRepository repocar;

    public List<Parking> listAll(String keyword){
        if(keyword != null){
            return repocar.findAll(keyword);
        }
        return repocar.findAll();
    }
    public void save(Parking parking){
        repocar.save(parking);
    }
}
