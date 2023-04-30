package com.example.server_pagination.service;

import com.example.server_pagination.dto.CarResponse;
import com.example.server_pagination.entity.Car;
import com.example.server_pagination.repo.CarRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CarService {
    CarRepo carRepo;

    public CarService(CarRepo carRepo){
        this.carRepo=carRepo;
    }

    /*
    public List<CarResponse> getAll(int size,int page,String sort){
        PageRequest firstPageWithTwoElements = PageRequest.of(page,size, Sort.by(sort));
        List<CarResponse> list = carRepo.findAll(firstPageWithTwoElements).stream().map(c->new CarResponse(c)).toList();
        //Page<Car> page = carRepo.findAll(firstPageWithTwoElements);
        return list;
    }
     */
    public Page<CarResponse> getAll(int size,int page,String sort){
        PageRequest pageRequest = PageRequest.of(page,size,Sort.by(sort));
        Page<CarResponse> carPage = carRepo.findAll(pageRequest).map(car -> new CarResponse(car));
        return carPage;
    }

    public List<CarResponse> getAllByBrand(String brand, int size, int page, String sort) {
        PageRequest pageRequest = PageRequest.of(page, size,Sort.by(sort));
        List<CarResponse> list = carRepo.findAllByBrand(brand,pageRequest).stream().map(c->new CarResponse(c)).toList();
        return list;
    }
}
