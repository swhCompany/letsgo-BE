package com.swh.letsgo.service;

public class OpenAPIServiceImpl implements OpenAPIService{

    @Override
    public String callLibraryOpenAPI(String headerArea, String headerRegion) {
        StringBuffer result = new StringBuffer();
        try {
            StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/tn_pubr_public_lbrry_api");
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String callMuseumOpenAPI(String headerArea, String headerRegion) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
