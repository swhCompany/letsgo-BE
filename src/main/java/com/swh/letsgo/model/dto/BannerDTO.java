package com.swh.letsgo.model.dto;

import java.util.Date;

import com.swh.letsgo.model.entity.Banner;

public class BannerDTO {
    private int id;
    private String place_name;
    private String place_addr;
    private String place_tel;
    private Date place_closedate;
    private int count;

    public BannerDTO(Banner banner) {
        this.place_name = banner.getPlace_name();
        this.place_addr = banner.getPlace_addr();
        this.place_tel = banner.getPlace_tel();
        this.place_closedate = banner.getPlace_closedate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_addr() {
        return place_addr;
    }

    public void setPlace_addr(String place_addr) {
        this.place_addr = place_addr;
    }

    public String getPlace_tel() {
        return place_tel;
    }

    public void setPlace_tel(String place_tel) {
        this.place_tel = place_tel;
    }

    public Date getPlace_closedate() {
        return place_closedate;
    }

    public void setPlace_closedate(Date place_closedate) {
        this.place_closedate = place_closedate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "BannerDTO [count=" + count + ", id=" + id + ", place_addr=" + place_addr + ", place_closedate="
                + place_closedate + ", place_name=" + place_name + ", place_tel=" + place_tel + "]";
    }
}






