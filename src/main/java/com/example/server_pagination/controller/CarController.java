package com.example.server_pagination.controller;


import com.example.server_pagination.dto.CarResponse;
import com.example.server_pagination.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars/")
@CrossOrigin
public class CarController {

    CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }
    /*
    @GetMapping
    public List<CarResponse> getAll(@RequestParam int size,@RequestParam int page,@RequestParam String sort){
        return carService.getAll(size,page,sort);
    }
     */
    @GetMapping
    public Page<CarResponse> getAll(@RequestParam int size,@RequestParam int page,@RequestParam String sort){
    return carService.getAll(size,page,sort);
    }
    @GetMapping("brand/{brand}")
    public List<CarResponse> getAllByBrand(@PathVariable String brand,@RequestParam int size,@RequestParam int page,@RequestParam String sort){
        return carService.getAllByBrand(brand,size,page,sort);
    }
}
