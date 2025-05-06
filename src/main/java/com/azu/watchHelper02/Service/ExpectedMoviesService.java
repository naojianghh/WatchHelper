package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Service
public class ExpectedMoviesService {
    private static final String PATH = "/movie/expected";

    @Autowired
    private BaseService baseService;

    public String getExpectedMovies(int cityId,String cityName,int limit,int offset) {
        Map<String,Object> params = new HashMap<>();
        try {
            String encodedCityName = URLEncoder.encode(cityName, StandardCharsets.UTF_8);
            params.put("ci",cityId);
            params.put("ct",encodedCityName);
            params.put("limit",limit);
            params.put("offset",offset);
        } catch (Exception e){
            e.printStackTrace();
        }
        return baseService.sendGetRequest(PATH,params);
    }
}
