package com.swh.letsgo.repository;

import com.swh.letsgo.model.entity.Banner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Long> {
    Banner findByTop3ByOrderByCount();

    Banner findByPlaceAddress(String placeAddr);
}