package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.FilteredCinemasByCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/filter")
public class FilteredCinemasByCityController {
    @Autowired
    private FilteredCinemasByCityService filteredCinemasByCityService;

    @GetMapping
    public String getFilteredCinemasByCity(@RequestParam("ci") int cityId) {
        return filteredCinemasByCityService.getFilteredCinemasByCity(cityId);
    }
}