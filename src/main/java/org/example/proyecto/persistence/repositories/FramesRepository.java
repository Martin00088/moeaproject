package org.example.proyecto.persistence.repositories;


import org.example.proyecto.persistence.entity.FrameEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FramesRepository extends PagingAndSortingRepository<FrameEntity, Integer>, CrudRepository<FrameEntity, Integer> {
}
