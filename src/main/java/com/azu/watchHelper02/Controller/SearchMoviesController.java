package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.SearchMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search/movies")
public class SearchMoviesController {
    @Autowired
    private SearchMoviesService searchMoviesService;

    @GetMapping
    public String searchMovies(@RequestParam("ci") int cityId, @RequestParam("kw") String keyword,
                               @RequestParam(value = "limit", defaultValue = "10") int limit,
                               @RequestParam(value = "offset", defaultValue = "0") int offset) {
        return searchMoviesService.searchMovies(cityId, keyword, limit, offset);
    }
}