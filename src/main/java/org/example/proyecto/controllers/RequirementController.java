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

    @GetMapping("/requirements")
    public Page<RequirementDto> getRequirements(@RequestParam(name= "orderField") String orderField,
                                                @RequestParam(name= "orderCriterial") String orderCriterial,
                                                @RequestParam(name= "pageNumber") Integer pageNumber,
                                                @RequestParam(name= "pageSize") Integer pageSize) {
        return this.requirementService.getRequirements(orderField, orderCriterial, pageNumber, pageSize);
    }
}