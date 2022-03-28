package com.swh.letsgo.model.dto;

import java.util.Date;

import com.swh.letsgo.model.entity.Banner;

public class BannerDTO {
    private int id;
    private String placeName;
    private String placeAddr;
    private String placeTel;
    private Date placeClosedate;
    private int count;

    public BannerDTO(Banner banner) {
        this.placeName = banner.getPlaceName();
        this.placeAddr = banner.getPlaceAddr();
        this.placeTel = banner.getPlaceTel();
        this.placeClosedate = banner.getPlaceClosedate();
    }

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






