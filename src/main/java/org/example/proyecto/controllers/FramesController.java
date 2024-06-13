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
    public Page<FrameDto> getFrames(@RequestParam(name= "orderField") String orderField,
                                    @RequestParam(name= "orderCriterial") String orderCriterial,
                                    @RequestParam(name= "pageNumber") Integer pageNumber,
                                    @RequestParam(name= "pageSize") Integer pageSize) {
        return this.frameService.getFrames(orderField, orderCriterial, pageNumber, pageSize);
    }
}

