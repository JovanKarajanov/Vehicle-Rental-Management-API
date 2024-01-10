package com.example.vehiclerental.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class CarDto {

    private Long id;
    private String make;
    private String model;
    private int year;
    private int availability;
    private int price;

    private MultipartFile image;

    private byte[] returnedImage;
}
