package org.example.proyecto.services;
import org.example.proyecto.model.dto.FrameDto;
import org.example.proyecto.model.mapper.FramesMapper;
import org.example.proyecto.persistence.repositories.FramesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FramesService {
    private final FramesRepository frameRepository;
    private final FramesMapper frameMapper;

    public FramesService(FramesRepository frameRepository,FramesMapper frameMapper) {
        this.frameRepository = frameRepository;
        this.frameMapper = frameMapper;
    }

    public Page<FrameDto> getFrames(String orderField, String orderCriterial, Integer pageNumber, Integer pageSize) {
        Pageable page=Pageable.ofSize(pageSize);
        return frameRepository.findAll(page).map(this.frameMapper::toDto);
    }
}