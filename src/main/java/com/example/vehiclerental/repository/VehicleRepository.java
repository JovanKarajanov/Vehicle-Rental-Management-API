package com.example.vehiclerental.repository;

import com.example.vehiclerental.model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicles, Long> {
    List<Vehicles> findByYear(int year);

    List<Vehicles> findByModel(String model);

    List<Vehicles> findByMake(String make);

    List<Vehicles> findByPrice(int price);
}
