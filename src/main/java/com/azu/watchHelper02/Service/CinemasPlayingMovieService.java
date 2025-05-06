package com.azu.watchHelper02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CinemasPlayingMovieService {
    private static final String PATH = "/movie/cinema";

    @Autowired
    private BaseService baseService;

    public String getCinemasPlayingMovie(int cityId, int movieId, String lat, String lng, int limit, int offset, int districtId, int lineId, int areaId, int stationId, String brandIds, String serviceIds, String hallTypeIds, String languageIds, String dimIds) {
        Map<String, Object> params = new HashMap<>();
        params.put("movieId", movieId);
        params.put("ci", cityId);
        if (lat != null && !lat.isEmpty()) {
            params.put("lat", lat);
        }
        if (lng != null && !lng.isEmpty()) {
            params.put("lng", lng);
        }
        params.put("limit", limit);
        params.put("offset", offset);
        params.put("districtId", districtId);
        params.put("lineId", lineId);
        params.put("areaId", areaId);
        params.put("stationId", stationId);
        if (brandIds != null && !brandIds.isEmpty()) {
            params.put("brandIds", brandIds);
        }
        if (serviceIds != null && !serviceIds.isEmpty()) {
            params.put("serviceIds", serviceIds);
        }
        if (hallTypeIds != null && !hallTypeIds.isEmpty()) {
            params.put("hallTypeIds", hallTypeIds);
        }
        if (languageIds != null && !languageIds.isEmpty()) {
            params.put("languageIds", languageIds);
        }
        if (dimIds != null && !dimIds.isEmpty()) {
            params.put("dimIds", dimIds);
        }
        return baseService.sendGetRequest(PATH, params);
    }
}