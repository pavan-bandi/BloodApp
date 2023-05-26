package com.cs.bloodapp.blood;

import jakarta.persistence.*;
import jakarta.persistence.*;

@Entity
@Table(name = "blood")
public class bloody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Hid")
    private Long hid;

    @Column(name = "Bid")
    private Long bid;

    @Column(name = "Quantity")
    private Integer quantity;

    // Constructors, getters, and setters

    public bloody() {
    }

    public bloody(Long hid, Long bid, Integer quantity) {
        this.hid = hid;
        this.bid = bid;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
