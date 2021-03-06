package io.bastrikov.resttemplateapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${redirectHost:localhost:8080}")
    String redirectHost;

    @GetMapping
    public String RestHelloWorld(){
        String baseUrl = "http://" + redirectHost;
        return restTemplate.getForObject(baseUrl,String.class);

    }
}
