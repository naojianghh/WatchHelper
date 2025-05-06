package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.HotMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/hot")
public class HotMoviesController {
    @Autowired
    private HotMoviesService hotMoviesService;

    @GetMapping
    public String getHotMovies(@RequestParam("ci") int cityId,@RequestParam("ct") String cityName){
        return hotMoviesService.getHotMovies(cityId,cityName);
    }
}
