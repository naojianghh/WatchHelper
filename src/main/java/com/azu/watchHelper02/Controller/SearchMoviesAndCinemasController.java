package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.SearchMoviesAndCinemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchMoviesAndCinemasController {
    @Autowired
    private SearchMoviesAndCinemasService searchMoviesAndCinemasService;

    @GetMapping
    public String searchMoviesAndCinemas(@RequestParam("ci") int cityId, @RequestParam("kw") String keyword) {
        return searchMoviesAndCinemasService.searchMoviesAndCinemas(cityId, keyword);
    }
}