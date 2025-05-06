package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatsController {
    @Autowired
    private SeatsService seatsService;

    @GetMapping
    public String getSeats(@RequestParam("seqNo") String seqNo, @RequestParam("ci") int cityId, @RequestParam("ct") String cityName) {
        return seatsService.getSeats(seqNo, cityId, cityName);
    }
}