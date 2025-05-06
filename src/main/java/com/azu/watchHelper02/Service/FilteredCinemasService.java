package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FilteredCinemasService {
    private static final String PATH = "/movie/filter/cinema";

    @Autowired
    private BaseService baseService;

    public String getFilteredCinemas(int cityId, int movieId, String showDate) {
        Map<String, Object> params = new HashMap<>();
        params.put("movieId", movieId);
        params.put("ci", cityId);
        if (showDate != null && !showDate.isEmpty()) {
            params.put("showDate", showDate);
        }
        return baseService.sendGetRequest(PATH, params);
    }
}