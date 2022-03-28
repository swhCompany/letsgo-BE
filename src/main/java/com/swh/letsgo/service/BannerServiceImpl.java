package com.swh.letsgo.service;

import java.util.List;
import java.util.stream.Collectors;

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
        Banner banner = bannerRepository.findByPlaceAddr(bannerDTO.getPlaceAddr());
            //프론트에서 불러온 정보를 DB에 저장
            //만약 존재한다면 count++
            //존재하지 않으면 새로 추가




    }

    @Override
    public List<BannerDTO> findBanners() {
        List<Banner> list = bannerRepository.findTop3ByOrderByCountDesc();
        
        // entity -> DTO로 반환
        List<BannerDTO> result = list.stream().map(r -> new BannerDTO(r)).collect(Collectors.toList());
        return result;
    }
}
