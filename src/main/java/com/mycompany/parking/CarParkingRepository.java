package com.mycompany.parking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarParkingRepository extends CrudRepository<Parking, String>, JpaRepository<Parking,String> {
    @Query("SELECT p FROM Parking p WHERE p.parking_code LIKE %?1%"
    +"OR p.paid_status LIKE %?1%"
    +"OR p.total_time LIKE %?1%"
    +"OR p.earned_amount LIKE %?1%"
     +"OR p.out_time LIKE %?1%"
    +"OR p.in_time LIKE %?1%")

    public List<Parking> findAll(String keyword);
}
