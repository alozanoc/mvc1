package pe.edu.upao.mvc1.services;

import pe.edu.upao.mvc1.models.Car;

import java.util.List;
import java.util.Optional;

public interface IParkingService {
    List<Car> getAllCars();

    Optional<Car> getCarByLicensePlate(String license);

    List<Car> getCarsByColor(String license);

    void addCar(Car car);
}
