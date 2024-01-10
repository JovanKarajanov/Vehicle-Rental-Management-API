package com.example.vehiclerental.model;

import com.example.vehiclerental.dto.CarDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "vehicles")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private int year;
    private int availability;
    private int price;
    @Column(columnDefinition = "longblob")
    private byte[] image;

    public CarDto getCarDto(){
       CarDto carDto = new CarDto();
       carDto.setId(id);
       carDto.setMake(make);
       carDto.setModel(model);
       carDto.setYear(year);
       carDto.setAvailability(availability);
       carDto.setPrice(price);
       carDto.setReturnedImage(image);
       return carDto;
    }
    public Vehicles(Long id, String make, String model, int year, int availability, int price){
        this.id=id;
        this.make=make;
        this.model=model;
        this.year=year;
        this.availability=availability;
        this.price=price;
    }

    public Vehicles() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
