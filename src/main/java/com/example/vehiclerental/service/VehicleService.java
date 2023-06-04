package com.example.vehiclerental.service;

import com.example.vehiclerental.model.Vehicles;
import com.example.vehiclerental.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicles> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicles> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    public Vehicles createVehicle(Vehicles vehicles) {
        return vehicleRepository.save(vehicles);
    }

    public Vehicles updateVehicle(Vehicles vehicles) {
        return vehicleRepository.save(vehicles);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }


    public List<Vehicles> getVehiclesByMake(String make) {
        return vehicleRepository.findByMake(make);
    }

    public List<Vehicles> getVehiclesByModel(String model) {
        return vehicleRepository.findByModel(model);
    }

    public List<Vehicles> getVehiclesByYear(int year) {
        return vehicleRepository.findByYear(year);
    }
    public List<Vehicles> getVehiclesByPrice(int price){
        return vehicleRepository.findByPrice(price);
    }
}

