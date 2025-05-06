package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CelebrityDetailService {
    private static final String PATH = "/celebrity";

    @Autowired
    private BaseService baseService;

    public String getCelebrityDetail(int celebrityId) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", celebrityId);
        return baseService.sendGetRequest(PATH, params);
    }
}