package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Service
public class SearchMoviesAndCinemasService {
    private static final String PATH = "/search";

    @Autowired
    private BaseService baseService;

    public String searchMoviesAndCinemas(int cityId, String keyword) {
        Map<String, Object> params = new HashMap<>();
        try {
            String encodedKeyword = URLEncoder.encode(keyword, StandardCharsets.UTF_8);
            params.put("ci", cityId);
            params.put("kw", encodedKeyword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseService.sendGetRequest(PATH, params);
    }
}