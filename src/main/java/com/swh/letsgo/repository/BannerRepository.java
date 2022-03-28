package com.swh.letsgo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.swh.letsgo.model.entity.Banner;

public interface BannerRepository extends JpaRepository<Banner, Long> {

}