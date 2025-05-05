package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BaseService {
    private static final String BASE_URL = "http://localhost:3000";
    @Autowired
    private RestTemplate restTemplate;

    protected String sendGetRequest(String path, Map<String, Object> params) {
        String url = BASE_URL + path;
        if (params != null && !params.isEmpty()){
            String paramStr = params.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue())
                    .collect(Collectors.joining("&"));
            url += (url.contains("?") ? "&" : "?") + paramStr;
        }
        return restTemplate.getForObject(url, String.class);
    }
}
