package org.example.proyecto.controllers;
import org.example.proyecto.model.dto.StopDto;
import org.example.proyecto.services.StopServices;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StopController {
    private final StopServices stopService;
    public StopController(StopServices stopService) {
        this.stopService = stopService;
    }

    @GetMapping("/stops")
    public Page<StopDto> getStops(@RequestParam(name= "orderField",defaultValue = "id") String orderField,
                                  @RequestParam(name= "orderCriterial",defaultValue = "DESC") String orderCriterial,
                                  @RequestParam(name= "pageNumber",defaultValue = "0") Integer pageNumber,
                                  @RequestParam(name= "pageSize", defaultValue = "30") Integer pageSize) {
        return this.stopService.get(orderField, orderCriterial, pageNumber, pageSize);
    }
}