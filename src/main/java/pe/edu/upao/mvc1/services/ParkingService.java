package pe.edu.upao.mvc1.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.mvc1.models.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingService implements IParkingService {

    public ParkingService() {
    }

    public List<Car> parkingLot = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return parkingLot;
    }

    @Override
    public Optional<Car> getCarByLicensePlate(String license) {
        return parkingLot.stream().filter(it -> it.getLicensePlate().equalsIgnoreCase(license)).findFirst();
    }

    @Override
    public List<Car> getCarsByColor(String license) {
        return parkingLot.stream().filter(it -> it.getLicensePlate().equalsIgnoreCase(license)).toList();
    }

    @Override
    public void addCar(Car car) {
        car.setEntryTime(LocalDateTime.now());
        parkingLot.add(car);
    }
}
