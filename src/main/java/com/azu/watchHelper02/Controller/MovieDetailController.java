package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.MovieDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/detail")
public class MovieDetailController {
    @Autowired
    private MovieDetailService movieDetailService;

    @GetMapping
    public String getMovieDetail(@RequestParam("movieId") int movieId) {
        return movieDetailService.getMovieDetail(movieId);
    }
}