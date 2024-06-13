package org.example.proyecto.model.mapper;

import org.example.proyecto.model.dto.FrameDto;
import org.example.proyecto.persistence.entity.FrameEntity;
import org.springframework.stereotype.Component;

@Component
public class FramesMapper {
    public FrameDto toDto(FrameEntity frameEntity) {
        FrameDto frameDTO = new FrameDto();
        frameDTO.setId(frameEntity.getId());
        frameDTO.setIdStopDeparture(frameEntity.getIdStopDeparture());
        frameDTO.setIdStopArrival(frameEntity.getIdStopArrival());
        frameDTO.setPrice(frameEntity.getPrice());
        frameDTO.setDepartureDatetime(frameEntity.getDepartureDatetime());
        frameDTO.setArrivalDatetime(frameEntity.getArrivalDatetime());

        return frameDTO;
    }

    public FrameEntity toEntity(FrameDto frameDTO) {
        FrameEntity frameEntity = new FrameEntity();

        frameEntity.setId(frameDTO.getId());
        frameEntity.setIdStopDeparture(frameDTO.getIdStopDeparture());
        frameEntity.setIdStopArrival(frameDTO.getIdStopArrival());
        frameEntity.setPrice(frameDTO.getPrice());
        frameEntity.setDepartureDatetime(frameDTO.getDepartureDatetime());
        frameEntity.setArrivalDatetime(frameDTO.getArrivalDatetime());

        return frameEntity;
    }
}
