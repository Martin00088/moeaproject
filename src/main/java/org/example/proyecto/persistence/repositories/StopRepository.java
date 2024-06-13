package org.example.proyecto.persistence.repositories;

import org.example.proyecto.persistence.entity.StopEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends PagingAndSortingRepository<StopEntity, Integer>, CrudRepository<StopEntity, Integer> {
}
