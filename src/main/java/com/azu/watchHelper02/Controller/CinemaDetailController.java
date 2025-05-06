package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.CinemaDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class CinemaDetailController {
    @Autowired
    private CinemaDetailService cinemaDetailService;

    @GetMapping
    public String getCinemaDetail(@RequestParam("cinemaId") int cinemaId) {
        return cinemaDetailService.getCinemaDetail(cinemaId);
    }
}