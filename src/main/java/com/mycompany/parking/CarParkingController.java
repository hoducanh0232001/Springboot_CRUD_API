package com.mycompany.parking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class CarParkingController {
    @Autowired
    private CarParkingService service;
   @GetMapping("/parking")
   public String showCarParkingList(Model model,
   @Param("keyword") String keyword){
        List<Parking> listCarParking = service.listAll(keyword);
        model.addAttribute("listCarParking",listCarParking);
        model.addAttribute("keyword", keyword);
        return "parking";
    }
}
