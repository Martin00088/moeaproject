package org.example.proyecto.model.mapper;

import org.example.proyecto.model.dto.RequirementDto;
import org.example.proyecto.persistence.entity.RequirementEntity;
import org.springframework.stereotype.Component;

@Component
public class RequirementMapper {
    public RequirementDto toDto(RequirementEntity requirementEntity){
        RequirementDto requirementDto = new RequirementDto();

        requirementDto.setId(requirementEntity.getId());
        requirementDto.setCategory(requirementEntity.getCategory());
        requirementDto.setLoading(requirementEntity.getLoading());
        requirementDto.setPickupTime(requirementEntity.getPickupTime());
        requirementDto.setIdStopArrival(requirementEntity.getIdStopArrival());
        requirementDto.setPickupTime(requirementEntity.getPickupTime());

        return requirementDto;
    }

    public RequirementEntity toEntity(RequirementDto requirementDto){
        RequirementEntity requirementEntity = new RequirementEntity();
        requirementEntity.setId(requirementDto.getId());
        requirementEntity.setCategory(requirementDto.getCategory());
        requirementEntity.setLoading(requirementDto.getLoading());
        requirementEntity.setPickupTime(requirementDto.getPickupTime());
        requirementEntity.setIdStopArrival(requirementDto.getIdStopArrival());
        requirementEntity.setPickupTime(requirementDto.getPickupTime());
        return requirementEntity;
    }
}
