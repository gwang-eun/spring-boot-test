package com.example.demo2.controller;

import com.example.demo2.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by 9111665 on 2022-05-20.
 * Description:
 */
@RestController
public class PostController {

    @PostMapping("default")
    public String postMethod(){
        return "Hello World";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();


        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}
