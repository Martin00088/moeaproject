package org.example.proyecto.persistence.repositories;

import org.example.proyecto.persistence.entity.TrunckEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruncksRepository extends PagingAndSortingRepository<TrunckEntity, Integer>, CrudRepository<TrunckEntity, Integer> {
}
