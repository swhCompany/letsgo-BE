package com.swh.letsgo.repository;

import java.util.List;

import com.swh.letsgo.model.entity.Banner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Long> {
    Banner findByPlaceAddress(String placeAddr);

    List<Banner> findByTop3ByOrderByCount();
}