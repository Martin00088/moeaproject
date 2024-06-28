package org.example.proyecto.controllers;
import org.example.proyecto.model.dto.RequirementDto;
import org.example.proyecto.services.RequirementService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequirementController {
    private final RequirementService requirementService;
    public RequirementController(RequirementService requirementService) {
        this.requirementService = requirementService;
    }

    @GetMapping(value = "requirements")
    public Page<RequirementDto> get(
            @RequestParam(value = "orderField", defaultValue="id") String orderField,
            @RequestParam(value = "orderCriterial", defaultValue="DESC") String orderCriterial,
            @RequestParam(value = "page", defaultValue="0") Integer page,
            @RequestParam(value = "pageSize", defaultValue="30") Integer pageSize
    ) {
        return requirementService.get(orderField, orderCriterial, page, pageSize);
    }
}