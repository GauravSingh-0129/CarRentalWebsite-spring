package com.codeLearning.Car_Rental_Spring.services.customer;

import com.codeLearning.Car_Rental_Spring.dto.CarDto;

import java.util.List;

public interface CustomerService {
    List<CarDto> getAllCars();
}
