package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MoviesInCinemaService {
    private static final String PATH = "/cinema/movies";

    @Autowired
    private BaseService baseService;

    public String getMoviesInCinema(int cityId, int cinemaId) {
        Map<String, Object> params = new HashMap<>();
        params.put("ci", cityId);
        params.put("cinemaId", cinemaId);
        return baseService.sendGetRequest(PATH, params);
    }
}