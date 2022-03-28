package com.swh.letsgo.service;

import com.swh.letsgo.model.dto.BannerDTO;
import com.swh.letsgo.model.entity.Banner;
import com.swh.letsgo.repository.BannerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerRepository bannerRepository;
    
    @Override
    public void insertBanner(BannerDTO bannerDTO) {
        Banner banner = bannerRepository.findByPlaceAddress(bannerDTO.getPlaceAddr());

    }
}
