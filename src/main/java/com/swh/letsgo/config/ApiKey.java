package com.swh.letsgo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiKey {
    @Value("${library-api-key}")
    private String libraryApiKey;

    @Value("${museum-api-key}")
    private String museumApiKey;

    public String getLibraryApiKey() {
        return libraryApiKey;
    }

    public String getMuseumApiKey() {
        return museumApiKey;
    }

    @Override
    public String toString() {
        return "ApiKey [libraryApiKey=" + libraryApiKey + ", museumApiKey=" + museumApiKey + "]";
    }

}
