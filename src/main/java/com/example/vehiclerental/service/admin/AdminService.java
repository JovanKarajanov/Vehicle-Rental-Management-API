package com.example.vehiclerental.service.admin;

import com.example.vehiclerental.dto.CarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();
}
