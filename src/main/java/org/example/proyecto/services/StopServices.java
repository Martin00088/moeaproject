package org.example.proyecto.services;

import org.example.proyecto.model.dto.StopDto;
import org.example.proyecto.model.mapper.StopMapper;
import org.example.proyecto.persistence.repositories.StopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StopServices {

    private final StopRepository stopRepository;
    private final StopMapper stopMapper;

    public StopServices(StopRepository stopRepository,StopMapper stopMapper) {
        this.stopRepository = stopRepository;
        this.stopMapper = stopMapper;
    }
    public Page<StopDto>get(String orderField, String orderCriterial, Integer pageNumber, Integer pageSize) {
            Pageable page;

            if (orderCriterial.equalsIgnoreCase("desc")) {
                page = PageRequest.of(pageNumber, pageSize, Sort.by(orderField).descending());
            }else{
                page = PageRequest.of(pageNumber, pageSize, Sort.by(orderField).ascending());
            }

            return stopRepository.findAll(page).map(this.stopMapper::toDto);
        }
    }


