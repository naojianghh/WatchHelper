package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CinemaListService {
    private static final String PATH = "/cinemas";

    @Autowired
    private BaseService baseService;

    public String getCinemaList(int cityId, String showDate, int limit, int offset, int districtId, int lineId, int hallType, int brandId, int serviceId, int areaId, int stationId) {
        Map<String, Object> params = new HashMap<>();
        params.put("ci", cityId);
        if (showDate != null && !showDate.isEmpty()) {
            params.put("showDate", showDate);
        }
        params.put("limit", limit);
        params.put("offset", offset);
        params.put("districtId", districtId);
        params.put("lineId", lineId);
        params.put("hallType", hallType);
        params.put("brandId", brandId);
        params.put("serviceId", serviceId);
        params.put("areaId", areaId);
        params.put("stationId", stationId);
        return baseService.sendGetRequest(PATH, params);
    }
}