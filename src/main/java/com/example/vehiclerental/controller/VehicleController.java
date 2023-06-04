package com.example.vehiclerental.controller;

import com.example.vehiclerental.VehicleRentalApplication;
import com.example.vehiclerental.model.Vehicles;
import com.example.vehiclerental.repository.VehicleRepository;
import com.example.vehiclerental.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;
    @Autowired
    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }
    @GetMapping
    public ResponseEntity<List<Vehicles>> getAllVehicles(){
        List<Vehicles> vehicles = vehicleService.getAllVehicles();
        return ResponseEntity.ok(vehicles);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Vehicles> getVehicleByID(@PathVariable Long id){
        Optional<Vehicles> vehicles = vehicleService.getVehicleById(id);
        return vehicles.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/make/{make}")
    public ResponseEntity<List<Vehicles>> getVehiclesByMake(@PathVariable("make") String make) {
        List<Vehicles> vehicles = vehicleService.getVehiclesByMake(make);
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/model/{model}")
    public ResponseEntity<List<Vehicles>> getVehiclesByModel(@PathVariable("model") String model) {
        List<Vehicles> vehicles = vehicleService.getVehiclesByModel(model);
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/year/{year}")
    public ResponseEntity<List<Vehicles>> getVehiclesByYear(@PathVariable("year") int year) {
        List<Vehicles> vehicles = vehicleService.getVehiclesByYear(year);
        return ResponseEntity.ok(vehicles);
    }
    @GetMapping("/price/{price}")
    public ResponseEntity<List<Vehicles>> getVehiclesByPrice(@PathVariable("price") int price){
        List<Vehicles> vehicles = vehicleService.getVehiclesByPrice(price);
        return ResponseEntity.ok(vehicles);
    }


    @PostMapping("/vehicles/post")
    public ResponseEntity<Vehicles> createVehicle(@RequestBody Vehicles vehicles) {
        Vehicles createdVehicle = vehicleService.createVehicle(vehicles);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVehicle);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Vehicles> updateVehicle(@PathVariable Long id, @RequestBody Vehicles vehicle) {
        Optional<Vehicles> existingVehicle = vehicleService.getVehicleById(id);
        if (existingVehicle.isPresent()) {
            vehicle.setId(id);
            Vehicles updatedVehicle = vehicleService.updateVehicle(vehicle);
            return ResponseEntity.ok(updatedVehicle);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        Optional<Vehicles> existingVehicle = vehicleService.getVehicleById(id);
        if (existingVehicle.isPresent()) {
            vehicleService.deleteVehicle(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
