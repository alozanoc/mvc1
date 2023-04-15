package pe.edu.upao.mvc1.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Car {
    String licensePlate;
    String color;
    LocalDateTime entryTime;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }

    public Car(String licensePlate, String color, LocalDateTime entryTime) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.entryTime = entryTime;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
