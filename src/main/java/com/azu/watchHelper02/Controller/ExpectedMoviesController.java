package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.ExpectedMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/expected")
public class ExpectedMoviesController {
    @Autowired
    private ExpectedMoviesService expectedMoviesService;

    @GetMapping
    public String getExpectedMovies(@RequestParam("ci") int cityId, @RequestParam("ct") String cityName,
                                    @RequestParam(value = "limit", defaultValue = "10") int limit,
                                    @RequestParam(value = "offset", defaultValue = "0") int offset) {
        return expectedMoviesService.getExpectedMovies(cityId, cityName, limit, offset);
    }
}