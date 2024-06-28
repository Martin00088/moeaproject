package org.example.proyecto.services;

import org.example.proyecto.model.dto.TrunckDto;
import org.example.proyecto.model.mapper.TrunckMapper;
import org.example.proyecto.persistence.repositories.TruncksRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TruncksServices {

        private final TruncksRepository trunckRepository;
        private final TrunckMapper trunckMapper;

        public TruncksServices(TruncksRepository trunckRepository,TrunckMapper trunckMapper) {
            this.trunckRepository = trunckRepository;
            this.trunckMapper = trunckMapper;
        }


    public Page<TrunckDto> get(String orderField, String orderCriterial, Integer pageNumber, Integer pageSize) {
        Pageable page;

        if (orderCriterial.equalsIgnoreCase("desc")) {
            page = PageRequest.of(pageNumber, pageSize, Sort.by(orderField).descending());
        }else{
            page = PageRequest.of(pageNumber, pageSize, Sort.by(orderField).ascending());
        }

        return trunckRepository.findAll(page).map(this.trunckMapper::toDto);
    }
        }

