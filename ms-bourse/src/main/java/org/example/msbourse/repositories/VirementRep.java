package org.example.msbourse.repositories;


import org.example.msbourse.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirementRep extends JpaRepository<Virement, Long> {
}
