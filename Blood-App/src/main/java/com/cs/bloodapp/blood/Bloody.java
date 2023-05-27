package com.cs.bloodapp.blood;

import com.cs.bloodapp.hospitals.Hospital;
import jakarta.persistence.*;

@Entity
@Table(name = "Blood")
public class Bloody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Hid")
    private Long hid;

    @Column(name = "Bid")
    private Long bid;

    @Column(name = "Quantity")
    private int quantity;

    // Foreign key relationship with Hospital entity
    @ManyToOne
    @JoinColumn(name = "Hid", referencedColumnName = "hid", insertable = false, updatable = false)
    private Hospital hospital;

    // Constructors, getters, and setters

    public Bloody() {
    }

    public Bloody(Long hid, Long bid, int quantity) {
        this.hid = hid;
        this.bid = bid;
        this.quantity = quantity;
    }

    // Getters and Setters

    public Long getId() {
        return bid;
    }

    public void setId(Long bid) {
        this.bid = bid;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
