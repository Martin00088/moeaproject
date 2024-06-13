package org.example.proyecto.controllers;

import org.example.proyecto.services.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    public final AppService appService;
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("/run")
    public String run() {
        appService.getFrames();
        return "Ok";
    }
}