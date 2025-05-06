package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Service
public class HotMoviesService {

    private static final String PATH = "/movie/hot";

    @Autowired
    private BaseService baseService;

    public String getHotMovies(int cityId, String cityName){
        Map<String,Object> params = new HashMap<>();
        try{
            String encodedCityName = URLEncoder.encode(cityName, StandardCharsets.UTF_8);
            params.put("ci",cityId);
            params.put("ct",encodedCityName);
        } catch (Exception e){
            e.printStackTrace();
        }
        return baseService.sendGetRequest(PATH,params);
    }
}
