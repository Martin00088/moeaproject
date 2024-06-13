package org.example.proyecto.persistence.repositories;

import org.example.proyecto.persistence.entity.RequirementEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequirementRepository extends PagingAndSortingRepository<RequirementEntity, Integer>, CrudRepository<RequirementEntity, Integer> {
}
