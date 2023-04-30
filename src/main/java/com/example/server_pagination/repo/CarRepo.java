package com.example.server_pagination.repo;

import com.example.server_pagination.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,String> {

    List<Car> findAllByBrand(String brand,PageRequest pageRequest);
}
