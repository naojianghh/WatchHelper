package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieListService {
    private static final String PATH = "/movie/list";

    @Autowired
    private BaseService baseService;

    public String getMovieList(String movieIds) {
        Map<String, Object> params = new HashMap<>();
        params.put("movieIds", movieIds);
        return baseService.sendGetRequest(PATH, params);
    }
}