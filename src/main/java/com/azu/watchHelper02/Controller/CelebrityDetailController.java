package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.CelebrityDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/celebrity")
public class CelebrityDetailController {
    @Autowired
    private CelebrityDetailService celebrityDetailService;

    @GetMapping
    public String getCelebrityDetail(@RequestParam("id") int celebrityId) {
        return celebrityDetailService.getCelebrityDetail(celebrityId);
    }
}