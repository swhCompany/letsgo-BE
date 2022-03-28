package com.swh.letsgo.controller;

import com.swh.letsgo.model.dto.BannerDTO;
import com.swh.letsgo.service.BannerService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/letsgo/banner")
public class BannerController {

    private final BannerService BannerService;

    public BannerController(BannerService bannerService) {
        this.BannerService = bannerService;
    }

    @PostMapping()
    public void insertBanner(@RequestBody BannerDTO bannerDTO) {
        BannerService.insertBanner(bannerDTO);
    }



}
