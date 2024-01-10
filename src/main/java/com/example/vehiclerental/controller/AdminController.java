package com.example.vehiclerental.controller;

import com.example.vehiclerental.dto.CarDto;
import com.example.vehiclerental.service.admin.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
@PostMapping("/car")
    public ResponseEntity<?> postCar(@ModelAttribute CarDto carDto) throws IOException {
        boolean success=adminService.postCar(carDto);
        if (success){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/cars")
    public ResponseEntity<?> getAllCars(){
    return ResponseEntity.ok(adminService.getAllCars());
    }

}
