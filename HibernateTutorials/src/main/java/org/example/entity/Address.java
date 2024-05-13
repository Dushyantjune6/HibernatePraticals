package org.example.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {
    public Address(Long addressId) {
        this.addressId = addressId;
    }

    public Address() {
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public double getX() {
        return x;
    }

    public String getStreet() {
        return street;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public byte[] getImage() {
        return image;
    }

    public Address(Long addressId, String city, String street, boolean isOpen, double x, Date dateAdded, byte[] image) {

        this.city = city;
        this.street = street;
        this.isOpen = isOpen;
        this.x = x;
        this.dateAdded = dateAdded;
        this.image = image;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @Column(length = 50,
    name = "STREET")
    private  String street;

    private  String city;
    private  boolean isOpen;

    @Transient
    private double x;

    @Column(name = "date_added")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;

    @Lob
    private byte[] image;


}
