package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.CinemasPlayingMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/cinema")
public class CinemasPlayingMovieController {
    @Autowired
    private CinemasPlayingMovieService cinemasPlayingMovieService;

    @GetMapping
    public String getCinemasPlayingMovie(@RequestParam("movieId") int movieId, @RequestParam("ci") int cityId,
                                         @RequestParam(value = "lat", required = false) String lat,
                                         @RequestParam(value = "lng", required = false) String lng,
                                         @RequestParam(value = "limit", defaultValue = "10") int limit,
                                         @RequestParam(value = "offset", defaultValue = "0") int offset,
                                         @RequestParam(value = "districtId", defaultValue = "-1") int districtId,
                                         @RequestParam(value = "lineId", defaultValue = "-1") int lineId,
                                         @RequestParam(value = "areaId", defaultValue = "-1") int areaId,
                                         @RequestParam(value = "stationId", defaultValue = "-1") int stationId,
                                         @RequestParam(value = "brandIds", required = false) String brandIds,
                                         @RequestParam(value = "serviceIds", required = false) String serviceIds,
                                         @RequestParam(value = "hallTypeIds", defaultValue = "all") String hallTypeIds,
                                         @RequestParam(value = "languageIds", defaultValue = "all") String languageIds,
                                         @RequestParam(value = "dimIds", defaultValue = "all") String dimIds) {
        return cinemasPlayingMovieService.getCinemasPlayingMovie(movieId, cityId, lat, lng, limit, offset, districtId, lineId, areaId, stationId, brandIds, serviceIds, hallTypeIds, languageIds, dimIds);
    }
}