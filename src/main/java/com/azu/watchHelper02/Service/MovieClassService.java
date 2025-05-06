package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieClassService {
    private static final String PATH = "/movie/class";

    @Autowired
    private BaseService baseService;

    public String getMovieClass(int sortId, int showType, int limit, int offset) {
        Map<String, Object> params = new HashMap<>();
        params.put("sortId", sortId);
        params.put("showType", showType);
        params.put("limit", limit);
        params.put("offset", offset);
        return baseService.sendGetRequest(PATH, params);
    }
}