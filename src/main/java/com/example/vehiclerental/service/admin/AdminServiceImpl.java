package com.example.vehiclerental.service.admin;

import com.example.vehiclerental.dto.CarDto;
import com.example.vehiclerental.model.Vehicles;
import com.example.vehiclerental.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService{
    private final VehicleRepository vehicleRepository;

    public AdminServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public boolean postCar(CarDto carDto) throws IOException {
        try{
            Vehicles vehicle = new Vehicles();
            vehicle.setMake(carDto.getMake());
            vehicle.setModel(carDto.getModel());
            vehicle.setPrice(carDto.getPrice());
            vehicle.setYear(carDto.getYear());
            vehicle.setAvailability(carDto.getAvailability());
            vehicle.setImage(carDto.getImage().getBytes());
            vehicleRepository.save(vehicle);
            return true;
        }catch (Exception e){
            return false;
        }



    }

    @Override
    public List<CarDto> getAllCars() {
        return vehicleRepository.findAll().stream().map(Vehicles::getCarDto).collect(Collectors.toList());
    }
}
