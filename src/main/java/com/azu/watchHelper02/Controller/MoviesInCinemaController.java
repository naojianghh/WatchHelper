package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.MoviesInCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/movies")
public class MoviesInCinemaController {
    @Autowired
    private MoviesInCinemaService moviesInCinemaService;

    @GetMapping
    public String getMoviesInCinema(@RequestParam("ci") int cityId, @RequestParam("cinemaId") int cinemaId) {
        return moviesInCinemaService.getMoviesInCinema(cityId, cinemaId);
    }
}