package com.garage.Garage.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "parkingGarage")
public class ParkingGarage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "parkingPlace")
    private int parkingPlace;

    @Column(name = "parkingPrice")
    private int parkingPrice;

    @Column(name = "city")
    private String city;

    public ParkingGarage() {

    }

    public ParkingGarage(int parkingPlace, String city) {
        this.parkingPlace = parkingPlace;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(int parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
