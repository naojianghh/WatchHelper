package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/list")
public class MovieListController {
    @Autowired
    private MovieListService movieListService;

    @GetMapping
    public String getMovieList(@RequestParam("movieIds") String movieIds) {
        return movieListService.getMovieList(movieIds);
    }
}