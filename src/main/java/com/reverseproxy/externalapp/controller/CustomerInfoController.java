package com.reverseproxy.externalapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CustomerInfoController {

    @PostMapping(value = "/getCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> routeAllUrls(HttpServletRequest httpServletRequest, @RequestBody String requestBody) {
        String url = httpServletRequest.getRequestURL().toString();

        System.out.println("url: "+url+","+requestBody);
        return new ResponseEntity("got it", HttpStatus.OK);
    }
}
