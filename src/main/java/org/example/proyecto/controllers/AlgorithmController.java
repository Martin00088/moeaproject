package org.example.proyecto.controllers;

import org.example.proyecto.services.AlgorithmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmController {

    public final AlgorithmService algorithmService;

    public AlgorithmController(AlgorithmService algorithmService) {
        this.algorithmService = algorithmService;
    }

    @GetMapping("moea/init")
    public void init() {
        algorithmService.init();
    }
    @PostMapping("moea/run")
    public void runAlgorithm() {
        algorithmService.run();
    }
}
