package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.MovieDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/days")
public class MovieDaysController {
    @Autowired
    private MovieDaysService movieDaysService;

    @GetMapping
    public String getMovieDays(@RequestParam("movieId") int movieId, @RequestParam("ci") int cityId) {
        return movieDaysService.getMovieDays(movieId, cityId);
    }
}