package io.bastrikov.resttemplateapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping
    public String RestHelloWorld(){
        String baseUrl = "http://hello-world-bastrikov-dev.apps.sandbox.x8i5.p1.openshiftapps.com/";
        return restTemplate.getForObject(baseUrl,String.class);

    }
}
