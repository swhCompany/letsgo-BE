package com.swh.letsgo.controller;

import com.swh.letsgo.service.OpenAPIService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/letsgo/search")
public class OpenAPIController {
    private final OpenAPIService openAPIService;

    public OpenAPIController(OpenAPIService openAPIService){
        this.openAPIService = openAPIService;
    }

    @PostMapping
    public void callOpenAPI(@RequestBody String headerArea, String headerRegion) {
        openAPIService.callOpenAPI(headerArea, headerArea);
    }
}
