package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FilteredCinemasByCityService {
    private static final String PATH = "/cinema/filter";

    @Autowired
    private BaseService baseService;

    public String getFilteredCinemasByCity(int cityId) {
        Map<String, Object> params = new HashMap<>();
        params.put("ci", cityId);
        return baseService.sendGetRequest(PATH, params);
    }
}