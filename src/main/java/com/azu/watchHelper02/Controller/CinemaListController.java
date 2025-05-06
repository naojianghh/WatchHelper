package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.CinemaListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinemas")
public class CinemaListController {
    @Autowired
    private CinemaListService cinemaListService;

    @GetMapping
    public String getCinemaList(@RequestParam("ci") int cityId,
                                @RequestParam(value = "showDate", required = false) String showDate,
                                @RequestParam(value = "limit", defaultValue = "10") int limit,
                                @RequestParam(value = "offset", defaultValue = "0") int offset,
                                @RequestParam(value = "districtId", defaultValue = "-1") int districtId,
                                @RequestParam(value = "lineId", defaultValue = "-1") int lineId,
                                @RequestParam(value = "hallType", defaultValue = "-1") int hallType,
                                @RequestParam(value = "brandId", defaultValue = "-1") int brandId,
                                @RequestParam(value = "serviceId", defaultValue = "-1") int serviceId,
                                @RequestParam(value = "areaId", defaultValue = "-1") int areaId,
                                @RequestParam(value = "stationId", defaultValue = "-1") int stationId) {
        return cinemaListService.getCinemaList(cityId, showDate, limit, offset, districtId, lineId, hallType, brandId, serviceId, areaId, stationId);
    }
}