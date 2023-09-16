package com.geekster.Url_Hit_Counter.controller;

import com.geekster.Url_Hit_Counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {

    @Autowired
    UrlHitService urlHitService;


    private int hitCount = 0;

    @GetMapping("/username/{username}/hit")
    public String incrementHitCount() {
        hitCount++;
        return "URL hit count incremented!";
    }

    @GetMapping("/count")
    public int getHitCount() {
        return hitCount;
    }

}
