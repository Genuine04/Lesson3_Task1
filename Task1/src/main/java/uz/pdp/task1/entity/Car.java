package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int year;

    private double price;

    private String model;

    private String vin;

    private double mileage;

    private String transmission;

    private String status;

    private String color;

    @ManyToOne
    private User seller;

    @ManyToOne
    private SellerType sellerType;

    private double lan;

    private double lat;

}
