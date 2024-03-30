package com.codeLearning.Car_Rental_Spring.services.customer;

import com.codeLearning.Car_Rental_Spring.dto.CarDto;
import com.codeLearning.Car_Rental_Spring.entity.Car;
import com.codeLearning.Car_Rental_Spring.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CarRepository carRepository;

    @Override
    public List<CarDto> getAllCars() {
        return carRepository.findAll().stream().map(Car::getCarDto).collect(Collectors.toList());
    }
}
