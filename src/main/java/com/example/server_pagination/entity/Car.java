package com.example.server_pagination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Car {

    @Id
    int id;
    String brand;
    String model;
    String color;
    int kilometers;
    LocalDateTime created;
    LocalDateTime updated;
}
