package org.example.proyecto.controllers;
import org.example.proyecto.services.MoeaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MOEAController {
    private final MOEAService service;

    public MOEAController(MOEAService service) {
        this.service = service;
    }

    @GetMapping(path = "moea/test", produces = "application/json")
	public String test(){
        this.init();
        return this.run();
	}

    @GetMapping("moea/init")
    public void init() {
        service.loadCities();
        service.loadRequirements();
        service.loadTrunks();
        service.loadFrames();
    }

    @GetMapping(path = "moea/run", produces = "application/json")
    public String run() {
        try{
            return service.run();
        }catch (InterruptedException e){
            e.printStackTrace();
            return "{\"error\": \"" + e.getMessage() + "\" }";
        }
    }
}