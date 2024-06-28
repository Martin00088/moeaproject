package org.example.proyecto.controllers;

import org.example.proyecto.model.dto.FrameDto;
import org.example.proyecto.services.FramesService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FramesController {
    private final FramesService frameService;
    public FramesController(FramesService frameService) {
        this.frameService = frameService;
    }

    @GetMapping("/frames")
    public Page<FrameDto> get(@RequestParam(name= "orderField",defaultValue = "id") String orderField,
                                    @RequestParam(name= "orderCriterial",defaultValue = "DESC") String orderCriterial,
                                    @RequestParam(name= "pageNumber",defaultValue = "0") Integer pageNumber,
                                    @RequestParam(name= "pageSize",defaultValue = "30") Integer pageSize) {
        return this.frameService.get(orderField, orderCriterial, pageNumber, pageSize);
    }
}

