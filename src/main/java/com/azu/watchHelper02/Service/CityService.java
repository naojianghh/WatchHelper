package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private BaseService baseService;

    public String getCities() {
        return baseService.sendGetRequest("/city", null);
    }
}
