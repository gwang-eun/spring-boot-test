package com.example.demo2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by 9111665 on 2022-05-17.
 * Description:
 */

@RestController
public class HelloController {

    //get, post, update, delete

    @GetMapping("/get")
    public String get() {
        return "get test success";
    }

    @GetMapping("/hello/{variable}")
    public String hello(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/get-map")
    public String getMap(@RequestParam Map<String, String> param) {

        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> { //forEach 다음에 나오는 map이 키워드였어?!
            sb.append(map.getKey() + " : "+map.getValue()+"\n");
        });

        return sb.toString();
    }

}
