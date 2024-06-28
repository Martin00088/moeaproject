package org.example.proyecto.controllers;

import org.example.proyecto.model.dto.TrunckDto;
import org.example.proyecto.services.TruncksServices;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrunckController {
    private final TruncksServices trunckService;
    public TrunckController(TruncksServices trunckService) {
        this.trunckService = trunckService;
    }

    @GetMapping("/truncks")
    public Page<TrunckDto> get(@RequestParam(name= "orderField") String orderField,
                                      @RequestParam(name= "orderCriterial") String orderCriterial,
                                      @RequestParam(name= "pageNumber") Integer pageNumber,
                                      @RequestParam(name= "pageSize") Integer pageSize) {
        return this.trunckService.get(orderField, orderCriterial, pageNumber, pageSize);
    }
}