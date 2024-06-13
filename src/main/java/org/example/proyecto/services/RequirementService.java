package org.example.proyecto.services;

import org.example.proyecto.model.dto.RequirementDto;
import org.example.proyecto.model.mapper.RequirementMapper;
import org.example.proyecto.persistence.repositories.RequirementRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RequirementService {
    private final RequirementRepository requirementRepository;
    private final RequirementMapper requirementMapper;

    public RequirementService(RequirementRepository requirementRepository,RequirementMapper requirementMapper) {
        this.requirementRepository = requirementRepository;
        this.requirementMapper = requirementMapper;
    }


    public Page<RequirementDto> getRequirements(String orderField, String orderCriterial, Integer pageNumber, Integer pageSize) {
        Pageable page=Pageable.ofSize(pageSize);
        return requirementRepository.findAll(page).map(this.requirementMapper::toDto);
    }
}
