package org.example.msformation.repositories;

import org.example.msformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface FormationRep extends JpaRepository<Formation, Long> {
}
