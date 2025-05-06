package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.FilteredCinemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/filter/cinema")
public class FilteredCinemasController {
    @Autowired
    private FilteredCinemasService filteredCinemasService;

    @GetMapping
    public String getFilteredCinemas(@RequestParam("movieId") int movieId, @RequestParam("ci") int cityId,
                                     @RequestParam(value = "showDate", required = false) String showDate) {
        return filteredCinemasService.getFilteredCinemas(movieId, cityId, showDate);
    }
}