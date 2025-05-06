package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.SearchCinemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search/cinemas")
public class SearchCinemasController {
    @Autowired
    private SearchCinemasService searchCinemasService;

    @GetMapping
    public String searchCinemas(@RequestParam("ci") int cityId, @RequestParam("kw") String keyword,
                                @RequestParam(value = "limit", defaultValue = "10") int limit,
                                @RequestParam(value = "offset", defaultValue = "0") int offset) {
        return searchCinemasService.searchCinemas(cityId, keyword, limit, offset);
    }
}