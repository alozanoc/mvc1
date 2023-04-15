package pe.edu.upao.mvc1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.mvc1.models.Car;
import pe.edu.upao.mvc1.services.IParkingService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    final IParkingService parkingService;

    public ParkingController(IParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("cars")
    public ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.status(200).body(parkingService.getAllCars());
    }

    @PutMapping("cars/{licensePlate}/entry")
    public ResponseEntity<Car> registerEntry(@PathVariable String licensePlate) {
        Optional<Car> car = parkingService.getCarByLicensePlate(licensePlate);
        if(car.isPresent()) {
            return ResponseEntity.badRequest().body(null);
        }
        Car newCar = new Car(licensePlate);
        parkingService.addCar(newCar);
        return ResponseEntity.status(201).body(newCar);
    }
}
