package com.codeLearning.Car_Rental_Spring.services.admin;

import com.codeLearning.Car_Rental_Spring.dto.CarDto;
import com.codeLearning.Car_Rental_Spring.entity.Car;

import java.io.IOException;
import java.util.List;

public interface AdminService {
    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

    CarDto getCarById(Long id);

    boolean updateCar(Long carId, CarDto carDto) throws IOException;
}
