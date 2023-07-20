package com.example.endpointsample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {
    @PostMapping("/hello")
    public void hello(@RequestBody String body) {
        System.out.println(body);
    }

}
