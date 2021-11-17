package com.project.postgresql;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class AlienController {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(AlienController.class);


    // to inject the object dependency implicitly

    @Autowired
    AlienService service;


    // This is GET Request 

    @RequestMapping("/aliens")
    public List<Information> getaliens() {
        LOGGER.info("Get Alien Information");
        return service.getaliens();
    } 

    // This is POST Request

    @PostMapping("/aliens")
    public void add(@RequestBody  Information information){
        service.setaliens(information);
    }

    // NULL Class for Reference

    public void add(AlienService service) {
    }    
}
