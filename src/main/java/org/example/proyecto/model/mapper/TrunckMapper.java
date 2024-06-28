package org.example.proyecto.model.mapper;

import org.example.proyecto.model.dto.TrunckDto;
import org.example.proyecto.persistence.entity.TrunckEntity;
import org.springframework.stereotype.Component;

@Component
public class TrunckMapper {
    public TrunckEntity toEntity(TrunckDto trunckDto) {
        TrunckEntity trunckEntity = new TrunckEntity();
        trunckEntity.setId(trunckDto.getId());
        trunckEntity.setCapacity(trunckDto.getCapacity());
        trunckEntity.setIdStopParking(trunckDto.getIdStopParking());
        return trunckEntity;
    }
    public TrunckDto toDto(TrunckEntity trunckEntity) {
        TrunckDto trunckDto = new TrunckDto();
        trunckDto.setId(trunckEntity.getId());
        trunckDto.setCapacity(trunckEntity.getCapacity());
        trunckDto.setIdStopParking(trunckEntity.getIdStopParking());
        return trunckDto;
    }
}
