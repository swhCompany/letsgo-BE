package com.swh.letsgo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String placeName;
    private String placeAddr;
    private String placeTel;
    private Date placeClosedate;

    @Column(nullable = true)
    @ColumnDefault("0")
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAddr() {
        return placeAddr;
    }

    public void setPlaceAddr(String placeAddr) {
        this.placeAddr = placeAddr;
    }

    public String getPlaceTel() {
        return placeTel;
    }

    public void setPlaceTel(String placeTel) {
        this.placeTel = placeTel;
    }

    public Date getPlaceClosedate() {
        return placeClosedate;
    }

    public void setPlaceClosedate(Date placeClosedate) {
        this.placeClosedate = placeClosedate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
}
