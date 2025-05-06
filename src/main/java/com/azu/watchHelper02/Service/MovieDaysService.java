package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieDaysService {
    private static final String PATH = "/movie/days";

    @Autowired
    private BaseService baseService;

    public String getMovieDays(int cityId, int movieId) {
        Map<String, Object> params = new HashMap<>();
        params.put("movieId", movieId);
        params.put("ci", cityId);
        return baseService.sendGetRequest(PATH, params);
    }
}