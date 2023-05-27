package com.cs.bloodapp.hospitals;

import com.cs.bloodapp.blood.Bloody;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "Hospitals")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Hid")
    private Long hid;


    @Column(name = "HName", length = 40)
    private String name;

    @Column(name = "MobileNumber", length = 10, unique = true)
    private String mobileNumber;

    @Column(name = "HImage", length = 100)
    private String image;

    @Column(name = "DNo", length = 10)
    private String doorNumber;

    @Column(name = "Street", length = 20)
    private String street;

    @Column(name = "City", length = 10)
    private String city;

    @Column(name = "Pincode", length = 6)
    private String pincode;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "MY_USER_ID")
    @JsonManagedReference
    private Set<Bloody> bankAccounts;

    // Constructors, getters, and setters

    public Hospital() {
        // Default constructor
    }

    public Hospital(String name, String mobileNumber, String image, String doorNumber, String street, String city, String pincode) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.image = image;
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    // Getters and Setters

    public Long getId() {
        return hid;
    }

    public void setId(Long id) {
        this.hid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
