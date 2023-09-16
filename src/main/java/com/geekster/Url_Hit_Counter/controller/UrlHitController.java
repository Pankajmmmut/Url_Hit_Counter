package com.geekster.Url_Hit_Counter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UrlHitController {

    private Map<String,Integer> map = new HashMap<>();

    @GetMapping("/username/{username}/hit")
    public String incrementHitCount(@PathVariable String username) {
            if(map.containsKey(username)){
                map.put(username, map.get(username)+1);
            }
            else {
                map.put(username,1);
            }
        return "URL hit count incremented!";
    }

    @GetMapping("/username/{username}/count")
    public int getHitCount(@PathVariable String username) {
        return map.get(username);
    }

}
