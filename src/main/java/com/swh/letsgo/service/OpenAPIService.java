package com.swh.letsgo.service;

public interface OpenAPIService {
    String callLibraryOpenAPI(String headerArea, String headerRegion);
    String callMuseumOpenAPI(String headerArea, String headerRegion);
}
