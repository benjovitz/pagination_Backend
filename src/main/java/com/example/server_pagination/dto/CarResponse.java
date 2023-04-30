package com.example.server_pagination.dto;


import com.example.server_pagination.entity.Car;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarResponse {

    int id;
    String brand;
    String model;
    String color;
    int kilometers;

    public CarResponse(Car c){
        this.id=c.getId();
        this.brand=c.getBrand();
        this.model=c.getModel();
        this.color=c.getColor();
        this.kilometers=c.getKilometers();
    }
}
