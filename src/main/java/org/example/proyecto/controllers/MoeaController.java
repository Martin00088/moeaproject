package org.example.proyecto.controllers;
import org.example.proyecto.services.MoeaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoeaController {
    public final MoeaService MoeaService;

    public MoeaController(MoeaService MoeaService) {
        this.MoeaService=MoeaService;
    }

    @GetMapping(path = "moea/run",produces = "application/json")
    public String run(){
        try {
            return  MoeaService.run();
        }
        catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @GetMapping(path = "moea/init",produces = "application/json")
    public String init(){
        MoeaService.run();
        return "init";
    }

}

