package com.example.endpointsample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EndpointController {
    @PostMapping("/hello")
    public void hello(@RequestBody String body) throws Exception {
        System.out.println(body);
        if (new Random().nextBoolean()) {
            throw new Exception();
        }
    }
    @PostMapping("/hoge")
    public void hoge(@RequestBody String body) throws Exception {
        System.out.println(body.toString());
        if (new Random().nextBoolean()) {
            throw new Exception();
        }
    }

}
