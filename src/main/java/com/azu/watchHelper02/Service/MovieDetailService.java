package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieDetailService {
    private static final String PATH = "/movie/detail";

    @Autowired
    private BaseService baseService;

    public String getMovieDetail(int movieId) {
        Map<String, Object> params = new HashMap<>();
        params.put("movieId", movieId);
        return baseService.sendGetRequest(PATH, params);
    }
}