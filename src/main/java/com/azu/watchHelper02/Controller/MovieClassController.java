package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.MovieClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/class")
public class MovieClassController {
    @Autowired
    private MovieClassService movieClassService;

    @GetMapping
    public String getMovieClass(@RequestParam("sortId") int sortId, @RequestParam("showType") int showType,
                                @RequestParam(value = "limit", defaultValue = "10") int limit,
                                @RequestParam(value = "offset", defaultValue = "0") int offset) {
        return movieClassService.getMovieClass(sortId, showType, limit, offset);
    }
}